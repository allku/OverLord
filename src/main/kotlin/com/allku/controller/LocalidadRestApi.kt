package com.allku.controller

import com.allku.model.Localidad
import com.allku.service.ILocalidadService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import javax.validation.Valid


@RestController
@RequestMapping("/rest/v1")
class LocalidadRestApi {

    @Autowired
    lateinit var localidadService : ILocalidadService

    @CrossOrigin(value = "*")
    @GetMapping("/localidades")
    fun localidades() : ResponseEntity<MutableList<Localidad>> {
        println("Rest API show localidaddes")
        val localidades = localidadService.findAll()
        return ResponseEntity(localidades, HttpStatus.OK)
    }
//  Post Example
//  {
//    "codigo": "01",
//    "localidad": "Azuay",
//    "observacion": null,
//    "estado": "Activo",
//    "tree_localidad": null,
//    "localidades": [],
//    "entidades": []
//  }
    @CrossOrigin(value = "*")
    @RequestMapping(value = "/localidad", method = [(RequestMethod.POST)])
    fun create(@RequestBody localidad: Localidad) : Localidad {
        return localidadService.save(localidad)
    }


}