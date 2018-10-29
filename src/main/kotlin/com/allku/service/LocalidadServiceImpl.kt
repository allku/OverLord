package com.allku.service

import com.allku.model.Localidad
import com.allku.repository.ILocalidadDao
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class LocalidadServiceImpl : ILocalidadService {

    @Autowired
    lateinit var localidadDao: ILocalidadDao

    override fun findAll(): MutableList<Localidad> {
        return localidadDao.findAll()
    }

    override fun save(localidad: Localidad) : Localidad {
        return localidadDao.save(localidad)
    }

}