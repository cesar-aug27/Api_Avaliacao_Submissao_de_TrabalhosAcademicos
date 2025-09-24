package com.example.Avaliacao_SubmissaoTrabalhos.Model;


import jakarta.persistence.*;
import org.aspectj.weaver.ast.Or;

@Entity
@Table(name = "Trabalhos")
public class Trabalho {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String Titulo;
    private String Resumo;

    @ManyToOne
    @JoinColumn(name = "orientador_id")
    private Orientador Orientador;

    private String PalavrasChave;
    private Double nota;

    public Orientador getOrientador() {
        return Orientador;
    }

    public void setOrientador(Orientador Orientador) {
        this.Orientador = Orientador;
    }


}
