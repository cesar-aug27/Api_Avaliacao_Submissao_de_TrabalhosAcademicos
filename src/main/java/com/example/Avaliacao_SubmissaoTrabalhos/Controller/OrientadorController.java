package com.example.Avaliacao_SubmissaoTrabalhos.Controller;

import com.example.Avaliacao_SubmissaoTrabalhos.Model.Orientador;
import com.example.Avaliacao_SubmissaoTrabalhos.Service.OrientadorService;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/orientador")
public class OrientadorController {

    private final OrientadorService orientadorService;

    public OrientadorController(OrientadorService orientadorService) {
        this.orientadorService = orientadorService;
    }

    @GetMapping("/ListarOrientadores")
    public List<Orientador> listarOrientadores(){
        return orientadorService.findAll();
    }

    @GetMapping("/BuscarOrientadorPorId/{id}")
    public Orientador buscarOrientadorPorId(@PathVariable long id){
        return orientadorService.findById(id);
    }

    @PostMapping("/CadastrarOrientador")
    public Orientador cadastrarOrientador(@RequestBody Orientador orientador){
        return orientadorService.save(orientador);
    }


}
