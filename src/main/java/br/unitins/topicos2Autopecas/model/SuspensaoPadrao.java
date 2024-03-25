package br.unitins.topicos2Autopecas.model;

import jakarta.persistence.Entity;

@Entity
public class SuspensaoPadrao extends Peca{
    
    private String dadosTecnicos;
    private String compatibilidade;

    // public SuspensaoPadrao(String nome, Double preco, String descricao, String dadosTecnicos, String compatibilidade) {
    //     super();
    //     this.dadosTecnicos = dadosTecnicos;
    //     this.compatibilidade = compatibilidade;
    // }

    // public SuspensaoPadrao() {
    //     
    // }

    public String getDadosTecnicos() {
        return dadosTecnicos;
    }
    public void setDadosTecnicos(String dadosTecnicos) {
        this.dadosTecnicos = dadosTecnicos;
    }

    public String getCompatibilidade() {
        return compatibilidade;
    }

    public void setCompatibilidade(String compatibilidade) {
        this.compatibilidade = compatibilidade;
    }
    

    
}
