package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Genero;
import br.edu.uniesp.api.service.GeneroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/genero")
public class GeneroResource {

    @Autowired
    private GeneroService service;

    @PostMapping
    public Genero salvar(@RequestBody Genero genero){
        return service.salvar(genero);
    }
}
