package com.allku.service

import com.allku.model.Usuario
import com.allku.repository.IUsuarioDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class UsuarioServiceImpl : IUsuarioService {

    @Autowired
    lateinit var usuarioDao: IUsuarioDao

    override fun findAll(): MutableList<Usuario> {
        return usuarioDao.findAll()
    }
}