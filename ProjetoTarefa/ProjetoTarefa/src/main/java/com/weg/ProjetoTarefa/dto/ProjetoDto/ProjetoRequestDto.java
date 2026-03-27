package com.weg.ProjetoTarefa.dto.ProjetoDto;

import java.time.LocalDate;

public record ProjetoRequestDto (
        String nomeProjeto,
        String descricao,
        LocalDate duracao
){
}
