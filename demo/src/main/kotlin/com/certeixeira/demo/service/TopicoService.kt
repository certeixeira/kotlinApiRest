package com.certeixeira.demo.service

import com.certeixeira.demo.model.Curso
import com.certeixeira.demo.model.Topico
import com.certeixeira.demo.model.Usuario
import org.springframework.stereotype.Service
import java.util.*
import kotlin.collections.ArrayList

@Service
class TopicoService(private var topicos: List<Topico> = ArrayList()) {

    fun listar(): List<Topico> {
        return topicos
    }

    fun buscarPorId(id: Long): Topico {
        return topicos.stream().filter({
            t -> t.id == id
        }).findFirst().get()
    }

    fun cadastrar(topico: Topico) {
        topicos.plus(topico)
    }
}