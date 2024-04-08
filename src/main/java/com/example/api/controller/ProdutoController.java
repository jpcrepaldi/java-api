package com.example.api.controller;

import com.example.api.model.ProdutoModel;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProdutoController
{
    @PostMapping("/produto")
    public ProdutoModel createProduto(){
        var produto1 = new ProdutoModel("camiseta");

        return produto1;
    }
}
