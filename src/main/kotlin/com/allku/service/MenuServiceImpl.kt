package com.allku.service

import com.allku.model.Menu
import com.allku.repository.IMenuDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class MenuServiceImpl : IMenuService {

    @Autowired
    lateinit var menuDao: IMenuDao

    override fun findAll(): MutableList<Menu> {
        return menuDao.findAll()
    }

    override fun save(menu: Menu) {
        menuDao.save(menu)
    }

}