package com.forohub.api.post;

import jakarta.validation.constraints.NotNull;


public record DadosAtualizacaoPost(@NotNull Long id,
                                   String texto,
                                   String nome,
                                   String titulo
                                   ) {
}
