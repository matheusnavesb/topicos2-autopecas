package br.unitins.topicos2Autopecas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SuspensaoPadrao extends Peca{

    private String compatibilidade;

    @JoinColumn(name = "id_dadosTecnicos")
    @ManyToOne
    private DadosTecnicos dadosTecnicos;

    public String getCompatibilidade() {
        return compatibilidade;
    }

    public void setCompatibilidade(String compatibilidade) {
        this.compatibilidade = compatibilidade;
    }

    public DadosTecnicos getDadosTecnicos() {
        return dadosTecnicos;
    }

    public void setDadosTecnicos(DadosTecnicos dadosTecnicos) {
        this.dadosTecnicos = dadosTecnicos;
    }
    

}
