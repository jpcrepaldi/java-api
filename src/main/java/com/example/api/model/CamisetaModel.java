package com.example.api.model;

public class CamisetaModel {

    private String tipoCamiseta;
    private double preco;
    private String cor;
    private String tamanho;
    private String tecido;

    public CamisetaModel(String tipoCamiseta, double preco, String cor, String tamanho, String tecido){
        this.tipoCamiseta = tipoCamiseta;
        this.preco = preco;
        this.cor = cor;
        this.tecido = tecido;
        this.tamanho = tamanho;
    }
}
