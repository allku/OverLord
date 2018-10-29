package com.allku.service

import com.allku.model.Usuario

interface IUsuarioService {

    fun findAll() : MutableList<Usuario>

}