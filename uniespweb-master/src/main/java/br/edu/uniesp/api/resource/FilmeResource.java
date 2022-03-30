package br.edu.uniesp.api.resource;

import br.edu.uniesp.api.model.Filme;
import br.edu.uniesp.api.repository.FilmeRepository;
import br.edu.uniesp.api.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/filme")
public class FilmeResource {

    @Autowired
    private FilmeService service;

    @GetMapping("/teste")
    public Filme teste(){

        Filme f = new Filme();
        f.setTitulo("Jurassic Park");
        return f;
    }

    @PostMapping("/salvar")
    public String salvar(){
        return "Salvou";
    }

    @PostMapping
    public Filme salvar(@RequestBody Filme filme){
        filme = service.salvar(filme);
        return filme;
    }

    @GetMapping
    public List<Filme> listar(){

        return service.listar();
    }

    //localhost:8080/filme/"id do filme"
    @DeleteMapping("{id}")
    public void remover(@PathVariable int id){
        service.deletar(id);
    }

    @PutMapping
    public Filme atualizar(@RequestBody Filme filme) throws Exception {

        return service.atualizar(filme);
    }


}
