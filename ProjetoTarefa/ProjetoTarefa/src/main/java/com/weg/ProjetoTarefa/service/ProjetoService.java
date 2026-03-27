package com.weg.ProjetoTarefa.service;

import com.weg.ProjetoTarefa.dto.ProjetoDto.ProjetoRequestDto;
import com.weg.ProjetoTarefa.dto.ProjetoDto.ProjetoResponseDto;
import com.weg.ProjetoTarefa.mapper.ProjetoMapper;
import com.weg.ProjetoTarefa.model.Projeto;
import com.weg.ProjetoTarefa.repository.ProjetoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@AllArgsConstructor
public class ProjetoService {

    private final ProjetoRepository repository;
    private final ProjetoMapper mapper;

    public ProjetoResponseDto salvar (ProjetoRequestDto requestDto) {

        Projeto projeto = new Projeto();

        return mapper.paraDto(repository.save(projeto));
    }

    public List<ProjetoResponseDto> listarTodos () {
        return repository.findAll()
                .stream()
                .map(mapper::paraDto)
                .toList();
    }

    public ProjetoResponseDto listarTodos (UUID id) {
        Projeto projeto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lista não encontrada"));

        return mapper.paraDto(projeto);
    }

    public ProjetoResponseDto atualizar (ProjetoRequestDto requestDto , UUID id ) {
        Projeto projeto = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Projeto nao encontrado"));

        projeto.setNomeProjeto(requestDto.nomeProjeto());
        projeto.setDescricao(requestDto.descricao());
        projeto.setDuracao(requestDto.duracao());

        return mapper.paraDto(projeto);
    }

    public void deletar (UUID id) {
        repository.deleteById(id);
    }
}
