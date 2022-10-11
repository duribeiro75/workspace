package br.com.ciandt.eduardo.execsb.controllers;

import br.com.ciandt.eduardo.execsb.model.entities.Cliente;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/clientes")
public class ClienteController {
    @GetMapping(path = "/obter")
    public Cliente obterCliente() {
        return new Cliente(1, "Eduardo", "03746948770");
    }

    @GetMapping("/{id}")
    public Cliente obterClientePorId1(@PathVariable int id) {
        return new Cliente(id, "Mary", "02529965773");
    }

    @GetMapping
    public Cliente obterClientePorId2(@RequestParam(name = "id", defaultValue = "1") int id) {
        return new Cliente(id, "Estephany", "335122545887");
    }
}