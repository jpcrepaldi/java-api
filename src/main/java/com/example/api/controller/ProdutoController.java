package com.example.api.controller;

import com.example.api.model.CategoriaProdutoModel;
import com.example.api.service.CategoriaProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProdutoController
{
    private CategoriaProdutoService categoriaProdutoService;

    public ProdutoController(CategoriaProdutoService categoriaProdutoService) {
        this.categoriaProdutoService = categoriaProdutoService;
    }

    @PostMapping("/produtos")
    public CategoriaProdutoModel postProduto(@RequestBody String nomeCategoria) throws Exception {
        var categoriaProdutoModel = new CategoriaProdutoModel(nomeCategoria);
        return categoriaProdutoService.process(categoriaProdutoModel);
    }

    @GetMapping("/produtos")
    public List<CategoriaProdutoModel> getProdutos(){
        return categoriaProdutoService.getAllProdutos();
    }

    @GetMapping("/produtos/{index}")
    public CategoriaProdutoModel getProdutoByIndex(@PathVariable Integer index) {
        return categoriaProdutoService.getByIndex(index);
    }

    @PutMapping("/produtos/{index}")
    public CategoriaProdutoModel putProduto(@PathVariable Integer index, @RequestBody String tipoProduto){
       var produto = new CategoriaProdutoModel(tipoProduto);
       return categoriaProdutoService.updateProduto(index, produto);
    }

    @DeleteMapping("/produtos/{index}")
    public void deleteProduto(@PathVariable Integer index) {
        categoriaProdutoService.deleteProduto(index);
    }
}

