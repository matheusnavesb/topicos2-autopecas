package br.unitins.topicos2Autopecas.service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import br.unitins.topicos2Autopecas.dto.DadosTecnicosDTO;
import br.unitins.topicos2Autopecas.dto.DadosTecnicosResponseDTO;
import br.unitins.topicos2Autopecas.model.DadosTecnicos;
import br.unitins.topicos2Autopecas.repository.DadosTecnicosRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.validation.ConstraintViolation;
import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import jakarta.validation.Validator;
import jakarta.ws.rs.NotFoundException;

@ApplicationScoped
public class DadosTecnicosServiceImpl implements DadosTecnicosService {

    @Inject
    DadosTecnicosRepository repository;

    @Inject
    Validator validator;

    @Override
    public List<DadosTecnicosResponseDTO> getAll() {
        List<DadosTecnicos> list = repository.findAll().list();
        return list.stream().map(e -> DadosTecnicosResponseDTO.valueOf(e)).collect(Collectors.toList());
    }

    @Override
    public DadosTecnicosResponseDTO findById(Long id) {
        DadosTecnicos dadosTecnicos = repository.findById(id);
        if (dadosTecnicos == null)
            throw new NotFoundException("DadosTecnicos não encontrados.");
        return DadosTecnicosResponseDTO.valueOf(dadosTecnicos);
    }

    @Override
    @Transactional
    public DadosTecnicosResponseDTO create(@Valid DadosTecnicosDTO dto) {
        DadosTecnicos entity = new DadosTecnicos();
        entity.setModelo(dto.modelo());
        entity.setFabricante(dto.fabricante());
        entity.setGarantia(dto.garantia());
        entity.setEmbalagem(dto.embalagem());
        entity.setPeso(dto.peso());

        repository.persist(entity);

        return DadosTecnicosResponseDTO.valueOf(entity);
    }

    @Override
    @Transactional
    public DadosTecnicosResponseDTO update(Long id, DadosTecnicosDTO dto) {
        validar(dto);

        DadosTecnicos entity = repository.findById(id);

        entity.setModelo(dto.modelo());
        entity.setFabricante(dto.fabricante());
        entity.setGarantia(dto.garantia());
        entity.setEmbalagem(dto.embalagem());
        entity.setPeso(dto.peso());

        return DadosTecnicosResponseDTO.valueOf(entity);
    }

    private void validar(DadosTecnicosDTO dadostecnicosDTO) throws ConstraintViolationException {
        Set<ConstraintViolation<DadosTecnicosDTO>> violations = validator.validate(dadostecnicosDTO);
        if (!violations.isEmpty())
            throw new ConstraintViolationException(violations);

    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

}
