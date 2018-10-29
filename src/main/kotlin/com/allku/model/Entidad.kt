package com.allku.model

import java.io.Serializable
import java.util.HashSet
import javax.persistence.*

@Entity
@Table(name = "adm_entidades")
class Entidad : Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Long? = null

    @Column(name = "documento")
    var documento : String? = null

    @Column(name = "tipo_documento")
    var tipo_documento : String? = null

    @Column(name = "nombre")
    var nombre : String? = null

    @Column(name = "apellido")
    var apellido : String? = null

    @Column(name = "razon_social")
    var razonSocial : String? = null

    @Column(name = "nombre_comercial")
    var nombreComercial : String? = null

    @Column(name = "direccion")
    var direccion : String? = null

    @Column(name = "telefono")
    var telefono : String? = null

    @Column(name = "correo")
    var correo : String? = null

    @Column(name = "observacion")
    var observacion : String? = null

    @Column(name = "estado")
    var estado : String? = null

    @ManyToOne(cascade = [(CascadeType.ALL)])
    @JoinColumn(name = "id_localidad")
    var localidad: Localidad? = null

    @OneToMany(mappedBy = "entidad")
    var usuarios: Set<Usuario> = HashSet()

    @OneToMany(mappedBy = "entidad")
    var informacionEntidades: Set<InformacionEntidad> = HashSet()

}