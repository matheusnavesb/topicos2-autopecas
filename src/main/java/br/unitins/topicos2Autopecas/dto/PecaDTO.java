package br.unitins.topicos2Autopecas.dto;

import br.unitins.topicos2Autopecas.model.Peca;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;

public abstract class PecaDTO<T extends Peca> {

        @NotBlank
        public final String nome;
        @Positive
        public final Double preco;
        @NotBlank
        public final String descricao;

        public PecaDTO(String nome, Double preco, String descricao) {
                this.nome = nome;
                this.preco = preco;
                this.descricao = descricao;
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

        public abstract T valueOf();
}
