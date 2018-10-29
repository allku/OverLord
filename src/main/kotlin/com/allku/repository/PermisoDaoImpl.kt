package com.allku.repository

import com.allku.model.Permiso
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Transactional
@Repository
class PermisoDaoImpl : IPermisoDao {

    @PersistenceContext
    lateinit var entityMAnager : EntityManager

    override fun findAll(): MutableList<Permiso> {
        return entityMAnager.createQuery("from Permiso").resultList as MutableList<Permiso>
    }
}