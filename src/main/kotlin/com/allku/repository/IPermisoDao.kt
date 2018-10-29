package com.allku.repository

import com.allku.model.Permiso

interface IPermisoDao {

    fun findAll() : MutableList<Permiso>

}