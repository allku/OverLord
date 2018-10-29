package com.allku.model

import java.io.Serializable
import java.util.HashSet
import javax.persistence.*

@Entity
@Table(name = "adm_permisos")
class Permiso : Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Long? = null

    @Column(name = "read")
    var read : String? = null

    @Column(name = "write")
    var write : String? = null

    @Column(name = "update")
    var update : String? = null

    @Column(name = "delete")
    var delete : String? = null

    @Column(name = "observacion")
    var observacion : String? = null

    @ManyToOne(cascade = [(CascadeType.ALL)])
    @JoinColumn(name = "id_usuario")
    var usuario: Usuario? = null

    @ManyToOne(cascade = [(CascadeType.ALL)])
    @JoinColumn(name = "id_menu")
    var menu: Menu? = null

}