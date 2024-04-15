package com.example.api.controller;

import com.example.api.model.ProdutoModel;
import com.example.api.service.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ProdutoController
{
    private ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping("/produtos")
    public ProdutoModel createProduto(@RequestBody String tipoProduto) throws Exception {
        var produto = new ProdutoModel(tipoProduto);
        produtoService.saveProduto(produto);
        return produto;
    }

    @GetMapping("/produtos")
    public List<ProdutoModel> readProdutos(){
        return produtoService.getAllProdutos();
    }

    @GetMapping("/produtos/{index}")
    public ProdutoModel readProduto(@PathVariable int index) {
        return produtoService.getByIndex(index);
    }

    @PutMapping("/produtos/{index}")
    public ProdutoModel putProduto(@PathVariable int index, @RequestBody String tipoProduto){
       var produto = new ProdutoModel(tipoProduto);
       return produtoService.updateProduto(index, produto);
    }

    @DeleteMapping("/produtos/{index}")
    public ProdutoModel deleteProduto(@PathVariable int index) {
        return produtoService.deleteProduto(index);
    }
}

