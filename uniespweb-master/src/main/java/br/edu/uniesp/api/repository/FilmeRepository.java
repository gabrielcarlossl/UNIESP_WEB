package br.edu.uniesp.api.repository;

import br.edu.uniesp.api.model.Filme;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FilmeRepository extends JpaRepository<Filme,Integer> {
}
