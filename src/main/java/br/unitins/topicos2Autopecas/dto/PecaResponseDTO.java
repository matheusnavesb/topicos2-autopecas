package br.unitins.topicos2Autopecas.dto;

import br.unitins.topicos2Autopecas.model.Peca;

public abstract class PecaResponseDTO<T extends Peca> {

    private final Long id;
    private final String nome;
    private final Double preco;
    private final String descricao;

    protected PecaResponseDTO(Long id, String nome, Double preco, String descricao) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public String getDescricao() {
        return descricao;
    }

}
