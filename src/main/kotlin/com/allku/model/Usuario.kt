package com.allku.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "adm_usuarios")
class Usuario : Serializable {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Long? = null

    @Column(name = "usuario")
    var usuario : String? = null

    @Column(name = "clave")
    var clave : String? = null

    // Derivada de la tabla adm_tipos
    @Column(name = "tipo")
    var tipo : String? = null

    @Column(name = "observacion")
    var observacion : String? = null

    @Column(name = "estado")
    var estado : String? = null

    @OneToMany(mappedBy = "usuario")
    var permisos: Set<Permiso> = HashSet()

    @ManyToOne(cascade = [(CascadeType.ALL)])
    @JoinColumn(name = "id_entidad")
    var entidad: Entidad? = null

}