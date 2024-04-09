package com.example.api.model;

public class ProdutoModel {

    private String tipoProduto;

    public ProdutoModel(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }

    public String getTipoProduto(){
        return this.tipoProduto;
    }

    public void setTipoProduto(String tipoProduto) {
        this.tipoProduto = tipoProduto;
    }
}


