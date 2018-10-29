package com.allku.model

import java.io.Serializable
import javax.persistence.*
import java.util.HashSet
import javax.persistence.JoinColumn

@Entity
@Table(name = "adm_menus")
class Menu : Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Long? = null

    @Column(name = "nombre")
    var nombre : String? = null

    @Column(name = "direccion")
    var direccion : String? = null

    @Column(name = "propiedad")
    var propiedad : String? = null

    @Column(name = "observacion")
    var observacion : String? = null

    @Column(name = "estado")
    var estado : String? = null

    @ManyToOne(cascade = arrayOf(CascadeType.ALL))
    @JoinColumn(name = "id_menu")
    var tree_menu: Menu? = null

    @OneToMany(mappedBy = "tree_menu")
    var subordinates: Set<Menu> = HashSet()

    @OneToMany(mappedBy = "menu")
    var menu: Set<Menu> = HashSet()
}

