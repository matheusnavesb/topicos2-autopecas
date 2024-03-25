package br.unitins.topicos2Autopecas.service;

import br.unitins.topicos2Autopecas.dto.PecaDTO;
import br.unitins.topicos2Autopecas.dto.PecaResponseDTO;

@SuppressWarnings("rawtypes")
public interface PecaService<DTO extends PecaDTO, RDTO extends PecaResponseDTO> {

    RDTO create(DTO dto);

    RDTO update(Long id, DTO dto);

    void delete(Long id);

    RDTO findById(Long id);

    //List<PecaResponseDTO> getAll();
}
