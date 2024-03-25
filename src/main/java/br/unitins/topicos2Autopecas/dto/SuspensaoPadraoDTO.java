package br.unitins.topicos2Autopecas.dto;

import br.unitins.topicos2Autopecas.model.SuspensaoPadrao;
import jakarta.validation.constraints.NotBlank;

public class SuspensaoPadraoDTO extends PecaDTO<SuspensaoPadrao>{

    @NotBlank
    private final String dadosTecnicos;
    @NotBlank
    private final String compatibilidade;


    public SuspensaoPadraoDTO(String nome, Double preco, String descricao, String dadosTecnicos, String compatibilidade) {
        super(nome, preco, descricao);
        this.dadosTecnicos = dadosTecnicos;
        this.compatibilidade = compatibilidade;
    }

    @Override
    public SuspensaoPadrao valueOf() {
        SuspensaoPadrao peca = new SuspensaoPadrao();
        peca.setNome(getNome());
        peca.setPreco(getPreco());
        peca.setDescricao(getDescricao());
        peca.setDadosTecnicos(getDadosTecnicos());
        peca.setCompatibilidade(getCompatibilidade());
        return peca;
    }

    public String getDadosTecnicos() {
        return dadosTecnicos;
    }

    public String getCompatibilidade() {
        return compatibilidade;
    }
    
    
}
