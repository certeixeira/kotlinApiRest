package com.certeixeira.demo.dto

import jakarta.validation.constraints.NotEmpty
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Size
import kotlin.math.min

data class NovoTopicoForm(
    @field:NotEmpty(message = "Título não pode ser em branco") @field:Size(min = 5, max = 100, message = "Título deve ter entre 5 em 100 caracteres") val titulo: String,
    @field:NotEmpty(message = "Título não pode ser em branco") val mensagem: String,
    @field:NotNull val idCurso: Long,
    @field:NotNull val idAutor: Long
)
