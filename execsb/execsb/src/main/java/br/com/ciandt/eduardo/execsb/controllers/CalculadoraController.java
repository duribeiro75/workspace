package br.com.ciandt.eduardo.execsb.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/calculadora")
public class CalculadoraController {

    @GetMapping("/somar/{a}/{b}")
    public int soma(@PathVariable int a, @PathVariable int b){
        return a + b;
    }

    @GetMapping("/subtrair")
    public int subtrair(@RequestParam(name = "a", defaultValue = "0") int a, @RequestParam(name = "b", defaultValue = "0") int b){
        return a - b;
    }
}
