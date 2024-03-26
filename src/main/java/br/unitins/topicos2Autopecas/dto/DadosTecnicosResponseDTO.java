package br.unitins.topicos2Autopecas.dto;

import br.unitins.topicos2Autopecas.model.DadosTecnicos;

public record DadosTecnicosResponseDTO(
        Long id,
        String modelo,
        String fabricante,
        String garantia,
        String embalagem,
        String peso) {
    public static DadosTecnicosResponseDTO valueOf(DadosTecnicos dadosTecnicos) {
        return new DadosTecnicosResponseDTO(
                dadosTecnicos.getId(),
                dadosTecnicos.getModelo(),
                dadosTecnicos.getFabricante(),
                dadosTecnicos.getGarantia(),
                dadosTecnicos.getEmbalagem(),
                dadosTecnicos.getPeso());
    }
}
