package com.weg.ProjetoTarefa.mapper;

import com.weg.ProjetoTarefa.dto.ProjetoDto.ProjetoRequestDto;
import com.weg.ProjetoTarefa.dto.ProjetoDto.ProjetoResponseDto;
import com.weg.ProjetoTarefa.model.Projeto;
import org.springframework.stereotype.Component;

@Component
public class ProjetoMapper {

    public Projeto paraEntidade (ProjetoRequestDto requestDto) {
        return new Projeto(
                requestDto.nomeProjeto(),
                requestDto.descricao(),
                requestDto.duracao()
        );
    }

    public ProjetoResponseDto paraDto (Projeto projeto) {
        return new ProjetoResponseDto(
                projeto.getId(),
                projeto.getNomeProjeto(),
                projeto.getDescricao(),
                projeto.getDuracao()
        );
    }
}
