package com.allku.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "adm_tipos")
class Tipo : Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Long? = null

    @Column(name = "tipo")
    var tipo : String? = null

    // Tabla o Objeto donde se muestra el tipo
    @Column(name = "objeto")
    var objeto : String? = null

    @Column(name = "observacion")
    var observacion : String? = null

    @Column(name = "estado")
    var estado : String? = null

}