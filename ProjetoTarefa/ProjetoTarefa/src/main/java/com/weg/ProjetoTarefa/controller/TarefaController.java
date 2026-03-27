package com.weg.ProjetoTarefa.controller;

import com.weg.ProjetoTarefa.dto.TarefaDto.TarefaRequestDto;
import com.weg.ProjetoTarefa.dto.TarefaDto.TarefaResponseDto;
import com.weg.ProjetoTarefa.service.TarefaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/tarefa")
public class TarefaController {

    private final TarefaService service;

    @PutMapping
    public TarefaResponseDto salvar (@RequestBody TarefaRequestDto requestDto) {
        return service.salvar(requestDto);
    }

    @GetMapping
    public List<TarefaResponseDto> listarTodos () {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public TarefaResponseDto listarPorId (@PathVariable Long id) {
        return service.listarPorId(id);
    }

    @PostMapping("/{id}")
    public TarefaResponseDto atualizar (@RequestBody TarefaRequestDto requestDto ,@PathVariable Long id) {
        return service.atualizar(requestDto , id);
    }

    @DeleteMapping("/{id}")
    public void deletar (@PathVariable Long id) {
        service.deletar(id);
    }
}
