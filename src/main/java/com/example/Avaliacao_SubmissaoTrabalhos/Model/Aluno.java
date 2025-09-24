package com.example.Avaliacao_SubmissaoTrabalhos.Model;
import jakarta.persistence.*;

@Entity
@Table(name = "Aluno")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String nome;
    private String matricula;
    private String email;
    public Aluno() {
    }
    public Aluno(String nome, String matricula, String email) {
        this.nome = nome;
        this.matricula = matricula;
        this.email = email;
    }
    public long getId() {
        return id;
    }

    public String getMatricula() {

        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNome() {
        return nome;
    }

}
