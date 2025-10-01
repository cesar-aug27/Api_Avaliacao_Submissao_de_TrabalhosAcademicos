package com.example.Avaliacao_SubmissaoTrabalhos.Model;


import jakarta.persistence.*;

@Entity
@Table(name = "Orientador")
public class Orientador {


    @Id
    @Column(unique = true)
    private String siape;
    private String email;
    private String nome;

    public Orientador() {

    }

    public Orientador(long id, String nome, String siape, String email) {
        setNome(nome);
        setSiape(siape);
        this.email = email;
    }

    public void setNome(String nome) {
        if (nome != null){
            this.nome = nome;
        }
    }
    public String getNome() {
        return nome;
    }
    public void setSiape(String siape) {
        if(siape.length() == 7){
            this.siape = siape;
        }
    }
    public String getSiape() {
        return siape;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }

}
