package com.example.Avaliacao_SubmissaoTrabalhos.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "Servidor")
public class Servidor {

    @Id
    @Column(unique = true)
    private String siape;
    private String nome;
    private String email;


    public  Servidor() {
    }
    public Servidor(String nome, String email, String siape) {
        this.nome = nome;
        this.email = email;
        this.siape = siape;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getSiape() {
        return siape;
    }
    public void setSiape(String siape) {
        this.siape = siape;
    }

}
