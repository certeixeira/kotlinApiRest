package com.certeixeira.demo.service

import com.certeixeira.demo.model.Curso
import org.springframework.stereotype.Service
import java.util.Arrays

@Service
class CursoService(var cursos: List<Curso>) {

    init {

        val curso = Curso(
            1,
            "Kotlin",
            "Programacao"
        )
        cursos = listOf(curso)
    }

    fun buscarPorId(id: Long): Curso {
        return  cursos.stream().filter { c ->
            c.id == id
        }.findFirst().get()
    }
}
