package com.forohub.api.post;

public record DadosListagemPost(Long id, String nome, String email, String titulo, Categoria categoria) {

    public DadosListagemPost(Post post){
        this(post.getId(), post.getNome(), post.getEmail(), post.getTexto(), post.getCategoria());
    }
}
