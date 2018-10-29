package com.allku.model

import java.io.Serializable
import java.util.HashSet
import javax.persistence.*

@Entity
@Table(name = "adm_localidades")
class Localidad : Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Long? = null

    @Column(name = "codigo")
    var codigo : String? = null

    @Column(name = "localidad")
    var localidad : String? = null

    @Column(name = "observacion")
    var observacion : String? = null

    @Column(name = "estado")
    var estado : String? = null

    @ManyToOne(cascade = [(CascadeType.ALL)])
    @JoinColumn(name = "id_localidad")
    var tree_localidad: Localidad? = null

    @OneToMany(mappedBy = "tree_localidad")
    var localidades: Set<Localidad> = HashSet()

    @OneToMany(mappedBy = "localidad")
    var entidades: Set<Entidad> = HashSet()

}