package com.allku.repository

import com.allku.model.Localidad

interface ILocalidadDao {

    fun findAll() : MutableList<Localidad>
    fun save(localidad : Localidad) : Localidad

}