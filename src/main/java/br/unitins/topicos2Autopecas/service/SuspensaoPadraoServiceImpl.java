package br.unitins.topicos2Autopecas.service;

import java.util.List;
import java.util.stream.Collectors;

import br.unitins.topicos2Autopecas.dto.SuspensaoPadraoDTO;
import br.unitins.topicos2Autopecas.dto.SuspensaoPadraoResponseDTO;

import br.unitins.topicos2Autopecas.model.SuspensaoPadrao;
import br.unitins.topicos2Autopecas.repository.SuspensaoPadraoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped
public class SuspensaoPadraoServiceImpl implements PecaService<SuspensaoPadraoDTO, SuspensaoPadraoResponseDTO> {

    @Inject
    SuspensaoPadraoRepository repository;

    @Override
    @Transactional
    public SuspensaoPadraoResponseDTO create(SuspensaoPadraoDTO dto) {
        SuspensaoPadrao peca = dto.valueOf();
        repository.persist(peca);
        return SuspensaoPadraoResponseDTO.from(peca);
    }

    @Override
    @Transactional
    public SuspensaoPadraoResponseDTO update(Long id, SuspensaoPadraoDTO dto) {
        SuspensaoPadrao peca = repository.findById(id);
        if (dto.getNome() != null)
            peca.setNome(dto.getNome());
        if (dto.getPreco() != null)
            peca.setPreco(dto.getPreco());
        if (dto.getDescricao() != null)
            peca.setDescricao(dto.getDescricao());
        if (dto.getDadosTecnicos() != null)
            peca.setDadosTecnicos(dto.getDadosTecnicos());
        if (dto.getCompatibilidade() != null)
            peca.setCompatibilidade(dto.getCompatibilidade());

        repository.persistAndFlush(peca);
        return SuspensaoPadraoResponseDTO.from(peca);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        repository.deleteById(id);
    }

    @Override
    public SuspensaoPadraoResponseDTO findById(Long id) {
        return SuspensaoPadraoResponseDTO.from(repository.findById(id));
    }

    @Override
    public List<SuspensaoPadraoResponseDTO> getAll() {
        List<SuspensaoPadrao> list = repository.findAll2();
        return list.stream().map(e -> SuspensaoPadraoResponseDTO.from(e)).collect(Collectors.toList());
    }

}
