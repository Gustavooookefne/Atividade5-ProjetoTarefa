package com.weg.ProjetoTarefa.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome_tarefa" , nullable = false)
    private String nomeTarefa;

    @Column(name = "tipo" , nullable = false)
    private String tipo;

    @Column(name = "quantidade" , nullable = false)
    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "idProjeto")
    private Projeto projeto;

    public Tarefa(String s, String tipo, Integer quantidade) {
    }
}
