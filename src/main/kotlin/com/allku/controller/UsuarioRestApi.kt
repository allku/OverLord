package com.allku.controller

import com.allku.model.Usuario
import com.allku.service.IUsuarioService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/rest/v1")
class UsuarioRestApi {

    @Autowired
    lateinit var usuarioService : IUsuarioService

    @CrossOrigin(value = "*")
    @GetMapping("/usuarios")
    fun usuarios() : ResponseEntity<MutableList<Usuario>> {
        println("Rest API show users")
        val usuarios = usuarioService.findAll()
        return ResponseEntity(usuarios, HttpStatus.OK)
    }

}