package com.example.Avaliacao_SubmissaoTrabalhos.Service;

import com.example.Avaliacao_SubmissaoTrabalhos.Repository.ServidorRepository;
import org.springframework.stereotype.Service;

@Service
public class ServidorService {

    private final ServidorRepository servidorRepository;

    public ServidorService(ServidorRepository servidorRepository) {
        this.servidorRepository = servidorRepository;
    }


}
