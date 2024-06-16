package com.forohub.api.post;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Table(name = "Post")
@Entity(name = "Post")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String email;
    private String titulo;
    private String texto;

    @Enumerated(EnumType.STRING)
    private Categoria categoria;


    private Boolean ativo;

    public Post(DadosCadastroPost dados) {
        this.ativo = true;
        this.nome = dados.nome();
        this.email = dados.email();
        this.titulo = dados.titulo();
        this.texto = dados.texto();
        this.categoria = dados.categoria();

    }

    public void atualizarInformacoes(DadosAtualizacaoPost dados) {
        if (dados.nome() != null) {
            this.nome = dados.nome();
        }
        if (dados.titulo() != null){
            this.titulo = dados.titulo();
        }

    }

    public void excluir() {
        this.ativo = false;
    }
}