package com.forohub.api.post;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;


public record DadosCadastroPost(

        @NotBlank
        String nome,
        @NotBlank
        @Email
        String email,
        @NotBlank
        String titulo,
        @NotBlank
        String texto,
        @NotNull
        Categoria categoria)
         {
}