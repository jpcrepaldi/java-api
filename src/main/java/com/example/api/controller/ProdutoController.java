package com.example.api.controller;

import com.example.api.model.ProdutoModel;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoController
{

    private List<ProdutoModel> produtoModelList = new ArrayList<>();

    @PostMapping("/produtos")
    public ProdutoModel createProduto(@RequestBody String tipoProduto){
        var produto = new ProdutoModel(tipoProduto);
        produtoModelList.add(produto);
        return produto;
    }

    @GetMapping("/produtos")

    public List<ProdutoModel> readProdutos(){
        return produtoModelList;
    }

    @GetMapping("/produtos/{index}")
    public ProdutoModel readProduto(@PathVariable int index) {
        var produto = produtoModelList.get(index);
        return produto;
    }

    @PutMapping("/produtos/{index}")
    public ProdutoModel putProduto(@PathVariable int index, @RequestBody String tipoProduto){
       var produto = new ProdutoModel(tipoProduto);
       produtoModelList.set(index, produto);
       return produto;
    }

    @DeleteMapping("/produtos/{index}")
    public ProdutoModel deleteProduto(@PathVariable int index) {
        var produtoDeletado = produtoModelList.remove(index);
        return produtoDeletado;
    }
}

