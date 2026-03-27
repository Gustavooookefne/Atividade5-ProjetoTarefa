package com.weg.ProjetoTarefa.service;

import com.weg.ProjetoTarefa.dto.TarefaDto.TarefaRequestDto;
import com.weg.ProjetoTarefa.dto.TarefaDto.TarefaResponseDto;
import com.weg.ProjetoTarefa.mapper.TarefaMapper;
import com.weg.ProjetoTarefa.model.Tarefa;
import com.weg.ProjetoTarefa.repository.TarefaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TarefaService {

    private final TarefaRepository repository;
    private final TarefaMapper mapper;

    public TarefaResponseDto salvar (TarefaRequestDto requestDto) {

        Tarefa tarefa = new Tarefa();

        return mapper.paraDto(repository.save(tarefa));
    }

    public List<TarefaResponseDto> listarTodos () {
        return repository.findAll()
                .stream()
                .map(mapper::paraDto)
                .toList();
    }

    public TarefaResponseDto listarPorId (Long id) {

        Tarefa tarefa = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lista não encontrada"));

        return mapper.paraDto(tarefa);
    }

    public TarefaResponseDto atualizar (TarefaRequestDto requestDto , Long id){
        Tarefa tarefa = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Lista não encontrada"));

        tarefa.setNomeTarefa(requestDto.nomeTarefa());
        tarefa.setTipo(requestDto.tipo());
        tarefa.setQuantidade(requestDto.quantidade());

        return mapper.paraDto(tarefa);
    }

    public void deletar (Long id) {
        repository.deleteById(id);
    }
}
