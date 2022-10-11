package br.com.ciandt.eduardo.execsb.model.entities.repositories;

import br.com.ciandt.eduardo.execsb.model.entities.Produto;
import org.springframework.data.repository.CrudRepository;

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
