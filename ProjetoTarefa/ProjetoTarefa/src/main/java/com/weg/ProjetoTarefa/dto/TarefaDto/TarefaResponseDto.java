package com.weg.ProjetoTarefa.dto.TarefaDto;

public record TarefaResponseDto (
        Long id,
        String nomeTarefa,
        String tipo,
        Integer quantidade
){
}
