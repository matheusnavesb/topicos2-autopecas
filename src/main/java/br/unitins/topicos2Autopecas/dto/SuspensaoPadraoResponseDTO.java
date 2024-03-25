package br.unitins.topicos2Autopecas.dto;

import br.unitins.topicos2Autopecas.model.Peca;
import br.unitins.topicos2Autopecas.model.SuspensaoPadrao;

public class SuspensaoPadraoResponseDTO extends PecaResponseDTO<Peca> {

    private final String dadosTecnicos;
    private final String compatibilidade;

    public SuspensaoPadraoResponseDTO(Long id, String nome, Double preco, String descricao, String dadosTecnicos,
            String compatibilidade) {
        super(id, nome, preco, descricao);
        this.dadosTecnicos = dadosTecnicos;
        this.compatibilidade = compatibilidade;
    }

    public static SuspensaoPadraoResponseDTO from(SuspensaoPadrao peca) {
        try {
            return new SuspensaoPadraoResponseDTO(
                    peca.getId(),
                    peca.getNome(),
                    peca.getPreco(),
                    peca.getDescricao(),
                    peca.getDadosTecnicos(),
                    peca.getCompatibilidade());

        } catch (NullPointerException e) {
            return null;
        }
    }

    public String getDadosTecnicos() {
        return dadosTecnicos;
    }

    public String getCompatibilidade() {
        return compatibilidade;
    }

}
