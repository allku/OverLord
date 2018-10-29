package com.allku.repository

import com.allku.model.Localidad
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Transactional
@Repository
class LocalidadDaoImpl : ILocalidadDao {

    @PersistenceContext
    lateinit var entityManager : EntityManager

    override fun findAll(): MutableList<Localidad> {
        return entityManager.createQuery("from Localidad").resultList as MutableList<Localidad>
    }

    override fun save(localidad: Localidad) : Localidad {
        return entityManager.merge(localidad)
    }
}