package com.weg.ProjetoTarefa.dto.ProjetoDto;

import java.time.LocalDate;
import java.util.UUID;

public record ProjetoResponseDto (
        UUID id,
        String nomeProjeto,
        String descricao,
        LocalDate duracao
){
}
