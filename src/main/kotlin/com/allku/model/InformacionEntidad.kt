package com.allku.model

import java.io.Serializable
import javax.persistence.*

@Entity
@Table(name = "adm_informacion_entidades")
class InformacionEntidad : Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id")
    var id : Long? = null

    // Derivada de la tabla adm_tipos
    @Column(name = "tipo")
    var tipo : String? = null

    @Column(name = "valor")
    var valor : String? = null

    @Column(name = "observacion")
    var observacion : String? = null

    @Column(name = "estado")
    var estado : String? = null

    @ManyToOne(cascade = [(CascadeType.ALL)])
    @JoinColumn(name = "id_entidad")
    var entidad: Entidad? = null

}