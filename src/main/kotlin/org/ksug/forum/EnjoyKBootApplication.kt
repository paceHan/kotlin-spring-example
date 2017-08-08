package org.ksug.forum

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Import
import swagger.Swagger

fun main(args: Array<String>) {
    SpringApplication.run(EnjoyKBootApplication::class.java, *args)
}

@SpringBootApplication
@Import(Swagger::class)
class EnjoyKBootApplication {
    

}