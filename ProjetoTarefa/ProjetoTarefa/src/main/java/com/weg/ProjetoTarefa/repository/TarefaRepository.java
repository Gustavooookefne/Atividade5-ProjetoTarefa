package com.weg.ProjetoTarefa.repository;

import com.weg.ProjetoTarefa.model.Tarefa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TarefaRepository extends JpaRepository<Tarefa , Long> {
}
