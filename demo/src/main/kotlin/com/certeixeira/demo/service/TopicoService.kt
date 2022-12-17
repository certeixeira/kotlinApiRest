package com.certeixeira.demo.service

import com.certeixeira.demo.model.Curso
import com.certeixeira.demo.model.Topico
import com.certeixeira.demo.model.Usuario
import org.springframework.stereotype.Service
import java.util.*

@Service
class TopicoService(private var topicos: List<Topico>) {

    init {
        val topico = Topico(
            id = 1,
            titulo = "Dúvida Kotlin",
            mensagem = "Variáveis Kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Eu mesmo",
                email = "eumesmo@gmail.com"
            )
        )
        val topico2 = Topico(
            id = 2,
            titulo = "Dúvida Kotlin",
            mensagem = "Variáveis Kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Eu mesmo",
                email = "eumesmo@gmail.com"
            )
        )
        val topico3 = Topico(
            id = 3,
            titulo = "Dúvida Kotlin",
            mensagem = "Variáveis Kotlin",
            curso = Curso(
                id = 1,
                nome = "Kotlin",
                categoria = "Programação"
            ),
            autor = Usuario(
                id = 1,
                nome = "Eu mesmo",
                email = "eumesmo@gmail.com"
            )
        )
        topicos = listOf(topico, topico2, topico3)

//        return Arrays.asList(topico, topico, topico)
//        return listOf(topico, topico, topico)
    }
    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({
            t -> t.id == id
        }).findFirst().get()
    }
}