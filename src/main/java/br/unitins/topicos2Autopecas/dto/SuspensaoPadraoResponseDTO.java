package br.unitins.topicos2Autopecas.dto;

import br.unitins.topicos2Autopecas.model.Peca;
import br.unitins.topicos2Autopecas.model.SuspensaoPadrao;

public class SuspensaoPadraoResponseDTO extends PecaResponseDTO<Peca> {

    //private final String dadosTecnicos;

    private final String compatibilidade;
    private final DadosTecnicosResponseDTO dadosTecnicos;

    public SuspensaoPadraoResponseDTO(Long id, String nome, Double preco, String descricao, String compatibilidade, DadosTecnicosResponseDTO dadosTecnicos) {
        super(id, nome, preco, descricao);
        this.compatibilidade = compatibilidade;
        this.dadosTecnicos = dadosTecnicos;
    }

    public static SuspensaoPadraoResponseDTO from(SuspensaoPadrao peca) {
        try {
            return new SuspensaoPadraoResponseDTO(
                    peca.getId(),
                    peca.getNome(),
                    peca.getPreco(),
                    peca.getDescricao(),
                    //peca.getDadosTecnicos(),
                    peca.getCompatibilidade(),
                    DadosTecnicosResponseDTO.valueOf(peca.getDadosTecnicos()));

        } catch (NullPointerException e) {
            return null;
        }
    }

    // public String getDadosTecnicos() {
    //     return dadosTecnicos;
    // }

    public String getCompatibilidade() {
        return compatibilidade;
    }

    public DadosTecnicosResponseDTO getDadosTecnicos() {
        return dadosTecnicos;
    }

}
