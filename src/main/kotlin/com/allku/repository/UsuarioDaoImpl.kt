package com.allku.repository

import com.allku.model.Usuario
import org.springframework.stereotype.Repository
import org.springframework.transaction.annotation.Transactional
import javax.persistence.EntityManager
import javax.persistence.PersistenceContext

@Transactional
@Repository
class UsuarioDaoImpl : IUsuarioDao {

    @PersistenceContext
    lateinit var entityMAnager : EntityManager

    override fun findAll(): MutableList<Usuario> {
        return entityMAnager.createQuery("from Usuario").resultList as MutableList<Usuario>
    }
}