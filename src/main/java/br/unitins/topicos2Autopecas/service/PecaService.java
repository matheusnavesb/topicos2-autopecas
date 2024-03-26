package br.unitins.topicos2Autopecas.service;

import java.util.List;

import br.unitins.topicos2Autopecas.dto.PecaDTO;
import br.unitins.topicos2Autopecas.dto.PecaResponseDTO;

@SuppressWarnings("rawtypes")
public interface PecaService<DTO extends PecaDTO, ResponseDTO extends PecaResponseDTO> {

    ResponseDTO create(DTO dto);

    ResponseDTO update(Long id, DTO dto);

    void delete(Long id);

    ResponseDTO findById(Long id);

    List<ResponseDTO> getAll();

}
