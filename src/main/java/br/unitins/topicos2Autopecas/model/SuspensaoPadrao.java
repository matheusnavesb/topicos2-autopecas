package br.unitins.topicos2Autopecas.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class SuspensaoPadrao extends Peca{
    
    //private String dadosTecnicos;

    private String compatibilidade;

    @JoinColumn(name = "id_dadosTecnicos")
    @OneToOne
    private DadosTecnicos dadosTecnicos;

    // public String getDadosTecnicos() {
    //     return dadosTecnicos;
    // }
    // public void setDadosTecnicos(String dadosTecnicos) {
    //     this.dadosTecnicos = dadosTecnicos;
    // }

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
