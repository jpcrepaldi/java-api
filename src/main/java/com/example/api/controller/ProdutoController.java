package com.example.api.controller;

import com.example.api.model.ProdutoModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoController
{

    private List<ProdutoModel> produtoModelList = new ArrayList<>();

    @PostMapping("/produto")
    public ProdutoModel createProduto(@RequestBody String tipoProduto){
        var produto1 = new ProdutoModel(tipoProduto);
        produtoModelList.add(produto1);
        return produto1;
    }

    @GetMapping("/produto")
    public List<ProdutoModel> readProdutos(){
        return produtoModelList;
    }

    @GetMapping("/produto2")
    public int readProduto() {
        var bicicleta = new ProdutoModel("camiseta");
        return produtoModelList.indexOf(bicicleta);
    }

//    @PutMapping("/produto")
//    public ProdutoModel putProduto(){
//        var produtoAntigo = readProduto();
//        produtoAntigo.setTipoProduto("tenis");
//        return produtoAntigo;
//    }

//    public ProdutoModel deleteProduto(){
//
//    }
}

