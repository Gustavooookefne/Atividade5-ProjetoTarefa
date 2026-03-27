package com.weg.ProjetoTarefa.mapper;

import com.weg.ProjetoTarefa.dto.TarefaDto.TarefaRequestDto;
import com.weg.ProjetoTarefa.dto.TarefaDto.TarefaResponseDto;
import com.weg.ProjetoTarefa.model.Tarefa;

public class TarefaMapper {

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
