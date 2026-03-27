package com.weg.ProjetoTarefa.dto.TarefaDto;

public record TarefaRequestDto (
        String nomeTarefa,
        String tipo,
        Integer quantidade
){
}
