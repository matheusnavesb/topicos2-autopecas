package br.unitins.topicos2Autopecas.model;

import jakarta.persistence.Entity;

@Entity
public class SuspensaoPadrao extends Peca{
    
    private String dadosTecnicos;
    private String compatibilidade;

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
