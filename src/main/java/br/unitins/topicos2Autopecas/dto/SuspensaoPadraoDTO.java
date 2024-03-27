package br.unitins.topicos2Autopecas.dto;

import br.unitins.topicos2Autopecas.model.SuspensaoPadrao;
import jakarta.validation.constraints.NotBlank;

public class SuspensaoPadraoDTO extends PecaDTO<SuspensaoPadrao> {

    // @NotBlank
    // private final String dadosTecnicos;

    @NotBlank
    private final String compatibilidade;

    private final Long idDadosTecnicos;

    public SuspensaoPadraoDTO(String nome, Double preco, String descricao, String compatibilidade,
            Long idDadosTecnicos) {
        super(nome, preco, descricao);
        // this.dadosTecnicos = dadosTecnicos;
        this.compatibilidade = compatibilidade;
        this.idDadosTecnicos = idDadosTecnicos;
    }

    @Override
    public SuspensaoPadrao valueOf() {
        SuspensaoPadrao peca = new SuspensaoPadrao();
        peca.setNome(getNome());
        peca.setPreco(getPreco());
        peca.setDescricao(getDescricao());
        // peca.setDadosTecnicos(getDadosTecnicos());
        peca.setCompatibilidade(getCompatibilidade());
        DadosTecnicosResponseDTO.valueOf(peca.getDadosTecnicos());

        // DadosTecnicosResponseDTO.valueOf(peca.getDadosTecnicos());
        return peca;
    }

    // public String getDadosTecnicos() {
    // return dadosTecnicos;
    // }

    public String getCompatibilidade() {
        return compatibilidade;
    }

    public Long getIdDadosTecnicos() {
        return idDadosTecnicos;
    }

}
