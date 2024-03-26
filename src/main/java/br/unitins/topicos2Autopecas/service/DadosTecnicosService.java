package br.unitins.topicos2Autopecas.service;

import java.util.List;

import br.unitins.topicos2Autopecas.dto.DadosTecnicosDTO;
import br.unitins.topicos2Autopecas.dto.DadosTecnicosResponseDTO;
import jakarta.validation.Valid;

public interface DadosTecnicosService {

    List<DadosTecnicosResponseDTO> getAll();

    DadosTecnicosResponseDTO findById(Long id);

    DadosTecnicosResponseDTO create(@Valid DadosTecnicosDTO dto);

    DadosTecnicosResponseDTO update(Long id, DadosTecnicosDTO dto);

    void delete(Long id);
}
