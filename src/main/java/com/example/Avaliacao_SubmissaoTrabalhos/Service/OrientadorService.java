package com.example.Avaliacao_SubmissaoTrabalhos.Service;

import com.example.Avaliacao_SubmissaoTrabalhos.Model.Orientador;
import com.example.Avaliacao_SubmissaoTrabalhos.Repository.OrientadorRepository;
import org.hibernate.dialect.function.array.OracleArrayIncludesFunction;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrientadorService {

    private final OrientadorRepository orientadorRepository;


    public OrientadorService(OrientadorRepository orientadorRepository) {
        this.orientadorRepository = orientadorRepository;
    }

    public Orientador findById(Long id) {
        return orientadorRepository.findById(id).orElse(null);
    }

    public List<Orientador> findAll() {
        return orientadorRepository.findAll();
    }

    public Orientador save(Orientador orientador) {
        return orientadorRepository.save(orientador);
    }

    public Orientador deletePorIdOrienador(long id) {
        if (orientadorRepository.existsById(id)) {
            Orientador orientadorTemp = orientadorRepository.findById(id).get();
            orientadorRepository.deleteById(id);
            return orientadorTemp;
        }
        return null;
    }

}
