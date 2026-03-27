package com.weg.ProjetoTarefa.service;

import com.weg.ProjetoTarefa.dto.TarefaDto.TarefaRequestDto;
import com.weg.ProjetoTarefa.dto.TarefaDto.TarefaResponseDto;
import com.weg.ProjetoTarefa.model.Tarefa;
import jakarta.persistence.Column;
import org.springframework.stereotype.Component;

@Component
public class TarefaService {

    public Tarefa paraEntidade (TarefaRequestDto requestDto) {
        return new Tarefa(
                requestDto.nomeTarefa(),
                requestDto.tipo(),
                requestDto.quantidade()
        );
    }

    public TarefaResponseDto paraDto (Tarefa tarefa) {
        return new TarefaResponseDto(
                tarefa.getId(),
                tarefa.getNomeTarefa(),
                tarefa.getTipo(),
                tarefa.getQuantidade()
        );
    }
}
