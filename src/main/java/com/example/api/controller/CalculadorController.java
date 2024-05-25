package com.example.api.controller;

import com.example.api.service.CalculadoraService;
import com.example.api.service.CategoriaProdutoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculadorController {

    private CalculadoraService calculadoraService;

    public CalculadorController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/soma/{A}/{B}")
    public Double somar(@PathVariable Double A,@PathVariable Double B) throws Exception {
        return calculadoraService.somar(A,B);
    }

    @PostMapping("subtracao/{A}/{B}")
    public Double subtrair(@PathVariable Double A,@PathVariable Double B){
        return calculadoraService.subtrair(A,B);
    }

    @GetMapping("multiplicacao/{A}/{B}")
    public Double multiplicar(@PathVariable Double A,@PathVariable Double B){
        return calculadoraService.multiplicar(A,B);
    }

    @GetMapping("divisao/{A}/{B}")
    public Double dividir(@PathVariable Double A,@PathVariable Double B) throws Exception {
        return calculadoraService.dividir(A,B);
    }
}
