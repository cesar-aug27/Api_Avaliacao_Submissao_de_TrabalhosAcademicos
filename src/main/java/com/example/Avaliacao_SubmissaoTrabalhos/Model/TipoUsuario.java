package com.example.Avaliacao_SubmissaoTrabalhos.Model;

public enum TipoUsuario {

    ALUNO(1),
    PROFESSOR(2),
    SERVIDOR(3);

    private int codigo;
    private TipoUsuario(int codigo){
        this.codigo = codigo;
    }

    public int getCodigo(){
        return this.codigo;
    }

}
