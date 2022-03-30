package br.edu.uniesp.api.service;

import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.repository.GeneroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GeneroService {

    @Autowired
    private GeneroRepository repository;

    public Genero salvar(Genero genero){

        return repository.save(genero);
    }
}
