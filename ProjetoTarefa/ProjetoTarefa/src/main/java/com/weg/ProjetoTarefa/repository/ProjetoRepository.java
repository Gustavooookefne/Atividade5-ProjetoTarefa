package com.weg.ProjetoTarefa.repository;

import com.weg.ProjetoTarefa.model.Projeto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProjetoRepository extends JpaRepository<Projeto , UUID> {
}
