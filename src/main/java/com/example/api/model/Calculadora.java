package com.example.api.model;

public class Calculadora {

    Double soma;
    Double subtracao;
    Double multiplicacao;
    Double divisao;

    public Double somar(Double A, Double B) {
        var soma = A + B;
        return soma;

    }
    public Double subtrair(Double A, Double B){
        var subtracao = A - B;
        return subtracao;
    }

    public static Double multiplicar(Double A, Double B){
        var resultado = A * B;
        return resultado;
    }
    public static Double dividir(Double A, Double B) throws Exception {
        if (B == 0)
            throw new Exception("nao existe");
        var resultado = A / B;
        return resultado;
    }

    public static void main(String[] args) throws Exception {
        var resultado = dividir(2.0, 0.0);

        System.out.println(resultado);
    }




}


