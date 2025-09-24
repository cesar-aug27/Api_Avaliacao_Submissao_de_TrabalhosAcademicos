package com.example.Avaliacao_SubmissaoTrabalhos.Controller;

import com.example.Avaliacao_SubmissaoTrabalhos.Model.Aluno;
import com.example.Avaliacao_SubmissaoTrabalhos.Repository.AlunoRepository;
import com.example.Avaliacao_SubmissaoTrabalhos.Service.AlunoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/alunos")
public class AlunoController {

    private final AlunoService alunoService;

    public AlunoController(AlunoService alunoService) {
        this.alunoService = alunoService;
    }

    @GetMapping("/ListarAlunos")
    public List<Aluno> listarAlunos() {
        return alunoService.listarAlunos();
    }

    @PostMapping("/CadastrarAluno")
    public Aluno CadastrarAluno(@RequestBody Aluno aluno) {
        return alunoService.salvarAluno(aluno);
    }

    @GetMapping("/BuscarAlunoPorID/{id}")
    public Aluno buscarAlunoPorID(@PathVariable long id) {
        return alunoService.buscarAlunoPorId(id);
    }
}
