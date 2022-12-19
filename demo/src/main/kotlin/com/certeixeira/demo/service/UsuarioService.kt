package com.certeixeira.demo.service

import com.certeixeira.demo.model.Curso
import com.certeixeira.demo.model.Usuario
import org.springframework.stereotype.Service

@Service
class UsuarioService(var usuarios: List<Usuario>) {

    init {

        val usuario = Usuario(
            1,
            "João Teixeira",
            "joao@email.com"
        )
        usuarios = listOf(usuario)
    }

    fun buscarPorId(id: Long): Usuario {
        return usuarios.stream().filter ({
            u -> u.id ==id
        }).findFirst().get()
    }

}
