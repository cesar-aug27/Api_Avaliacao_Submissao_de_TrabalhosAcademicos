package com.example.Avaliacao_SubmissaoTrabalhos.Service;

import com.example.Avaliacao_SubmissaoTrabalhos.Model.Aluno;
import com.example.Avaliacao_SubmissaoTrabalhos.Repository.AlunoRepository;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    public List<Aluno> listarAlunos() {
        return alunoRepository.findAll();
    }

    public Aluno salvarAluno(Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    public Aluno buscarAlunoPorId(Long id) {

        return alunoRepository.findById(id).orElse(null);
    }
}
