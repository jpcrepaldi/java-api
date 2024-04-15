package com.example.api.service;

import com.example.api.model.ProdutoModel;
import com.example.api.repository.ProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProdutoService {

    private ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    public ProdutoModel saveProduto(ProdutoModel produtoModel) throws Exception {
        if (!produtoModel.getTipoProduto().equals("camiseta")) {
            throw new Exception("dadsa");
        }
        return produtoRepository.save(produtoModel);
    }

    public List<ProdutoModel> getAllProdutos() {
        return produtoRepository.getAll();
    }

    public ProdutoModel getByIndex(int index) {
        return produtoRepository.getByIndex(index);
    }

    public ProdutoModel updateProduto(int index, ProdutoModel produtoModel) {
        var produtoOld = produtoRepository.getByIndex(index);
        if (produtoOld != null) {
            return produtoRepository.updateProduto(index, produtoModel);
        }
        return null;
    }

    public ProdutoModel deleteProduto(int index) {
        var produto = produtoRepository.getByIndex(index);
        if (produto != null)
            return produtoRepository.deleteProduto(index);
        return produto;
    }


}

