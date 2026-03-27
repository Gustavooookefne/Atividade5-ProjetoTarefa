package com.weg.ProjetoTarefa.controller;

import com.weg.ProjetoTarefa.dto.ProjetoDto.ProjetoRequestDto;
import com.weg.ProjetoTarefa.dto.ProjetoDto.ProjetoResponseDto;
import com.weg.ProjetoTarefa.service.ProjetoService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@AllArgsConstructor
@RestController
@RequestMapping("/projeto")
public class ProjetoController {

    private final ProjetoService service;

    @PutMapping
    public ProjetoResponseDto salvar (@RequestBody ProjetoRequestDto requestDto) {
        return service.salvar(requestDto);
    }

    @GetMapping
    public List<ProjetoResponseDto> listarTodos () {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ProjetoResponseDto listarPorId (@PathVariable UUID id) {
        return service.listarPorId(id)
    }

    @PostMapping("/{id}")
    public ProjetoResponseDto atualizar (@RequestBody ProjetoRequestDto requestDto, @PathVariable UUID id) {
        return service.atualizar(requestDto , id);
    }

    public void deletar (@PathVariable UUID id) {
        service.deletar(id);
    }
}
