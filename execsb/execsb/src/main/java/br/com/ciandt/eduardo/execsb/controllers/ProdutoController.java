package br.com.ciandt.eduardo.execsb.controllers;

import br.com.ciandt.eduardo.execsb.model.entities.Produto;
import br.com.ciandt.eduardo.execsb.model.entities.repositories.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping(path = "/api/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository produtoRepository;

    @PostMapping
    public @ResponseBody Produto novoProduto(@Valid Produto produto) {
        produtoRepository.save(produto);
        return produto;
    }

    @GetMapping
    public Iterable<Produto> obterProdutos(){
        return  produtoRepository.findAll();
    }
}