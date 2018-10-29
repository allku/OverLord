package com.allku

import com.allku.model.Menu
import com.allku.repository.IMenuDao
import com.allku.service.IMenuService
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class OverLordApplicationTests {

	@Autowired
	lateinit var service: IMenuService
	@Autowired
	lateinit var repository: IMenuDao


	@Test
	fun contextLoads() {
	}

	@Test
	fun addCity() {
		var menu : Menu = Menu()
		menu.nombre = "Principal"
		val result = service.save(Menu())

	}

}
