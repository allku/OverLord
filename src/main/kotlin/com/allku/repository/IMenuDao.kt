package com.allku.repository

import com.allku.model.Menu

interface IMenuDao {

    fun findAll() : MutableList<Menu>
    fun save(menu : Menu)

}