package com.example.Avaliacao_SubmissaoTrabalhos.Model;


import jakarta.persistence.*;
import org.springframework.lang.NonNull;

@Entity
@Table(name = "Usuário")
public class Usuário {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NonNull
    private String nome;

    @NonNull
    private String email;

    @NonNull
    private String senha;

    private

    Usuário(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        if(senha == null){
            this.senha = "default";
        }
    }
}
