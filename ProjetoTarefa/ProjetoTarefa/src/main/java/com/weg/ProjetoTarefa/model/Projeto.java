package com.weg.ProjetoTarefa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Projeto {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(name = "nome_projeto", nullable = false)
    private String nomeProjeto;

    @Column(name = "descriçao", nullable = false)
    private String descricao;

    @Column(name = "duraçao", nullable = false)
    private LocalDate duracao;

    @OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL)
    private List<Tarefa> tarefas = new ArrayList<>();

    public Projeto(String s, String descricao, LocalDate duracao) {
    }
}
