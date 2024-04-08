package com.example.api.model;

import lombok.Getter;

@Getter
public class ProdutoModel {

    private String tipoProduto;

    public ProdutoModel(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getTipoProduto(){
        return this.tipoProduto;
    }
}

