package com.example.api.model;

public class CategoriaProdutoModel {

    private String nomeCategoria;

    public CategoriaProdutoModel(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getNomeCategoria(){
        return this.nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
}


