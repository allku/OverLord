package com.allku.service

import com.allku.model.Menu

interface IMenuService {

    fun findAll() : MutableList<Menu>
    fun save(menu : Menu)

}