package com.allku.repository

import com.allku.model.Menu
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Transactional
@Repository
class MenuDaoImpl : IMenuDao {

    @PersistenceContext
    lateinit var entityMAnager : EntityManager

    override fun findAll(): MutableList<Menu> {
        return entityMAnager.createQuery("from Menu").resultList as MutableList<Menu>
    }

    override fun save(menu: Menu) {
        entityMAnager.persist(menu)
    }
}