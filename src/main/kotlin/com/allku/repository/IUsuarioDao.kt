package com.allku.repository

import com.allku.model.Usuario

interface IUsuarioDao {

    fun findAll() : MutableList<Usuario>

}