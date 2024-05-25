package com.example.api.service;

import com.example.api.entities.CalculadorEntity;
import com.example.api.repository.CalculadoraRepository;
import com.example.api.repository.CategoriaProdutoRepository;
import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    private CalculadoraRepository calculadoraRepository;

    public CalculadoraService(CalculadoraRepository calculadoraRepository) {
        this.calculadoraRepository = calculadoraRepository;
    }

    public Double somar(Double A, Double B) throws Exception {
        if (A <= 5) {
            throw new Exception("nao é maior que cinco");
        }
        var resultado = A + B;

        var entity = new CalculadorEntity();

        entity.setResultado(resultado);
        entity.setOperacao("+");
        entity.setA(A);
        entity.setB(B);

        calculadoraRepository.save(entity);
        return resultado;
    }

    public Double subtrair(Double A, Double B) {
        var resultado = A - B;

        var entity = new CalculadorEntity();

        entity.setResultado(resultado);
        entity.setOperacao("-");
        entity.setA(A);
        entity.setB(B);

        calculadoraRepository.save(entity);
        return resultado;

    }

    public Double multiplicar(Double A, Double B) {
        var resultado = A * B;

        var entity = new CalculadorEntity();

        entity.setResultado(resultado);
        entity.setOperacao("x");
        entity.setA(A);
        entity.setB(B);

        calculadoraRepository.save(entity);
        return resultado;

    }

    public Double dividir(Double A, Double B) throws Exception {
        if (B == 0) {
            throw new Exception("nao existe");
        }

        var resultado = A / B;

        var entity = new CalculadorEntity();

        entity.setResultado(resultado);
        entity.setOperacao("/");
        entity.setA(A);
        entity.setB(B);

        calculadoraRepository.save(entity);
        return resultado;

    }
}


