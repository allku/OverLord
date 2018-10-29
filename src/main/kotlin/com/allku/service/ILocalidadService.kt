package com.allku.service

import com.allku.model.Localidad

interface ILocalidadService {

    fun findAll() : MutableList<Localidad>
    fun save(localidad : Localidad) : Localidad

}