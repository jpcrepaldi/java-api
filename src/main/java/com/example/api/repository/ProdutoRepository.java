package com.example.api.repository;

import com.example.api.model.ProdutoModel;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProdutoRepository {
    private List<ProdutoModel> produtoModelList = new ArrayList<>();

    public ProdutoModel save(ProdutoModel produtoModel) {
        produtoModelList.add(produtoModel);
        return produtoModel;
    }

    public List<ProdutoModel> getAll() {
        return produtoModelList;
    }

    public ProdutoModel getByIndex(int index) {
        try {
            return produtoModelList.get(index);
        } catch (Exception ex) {
            return null;
        }
    }

    public ProdutoModel updateProduto(int index, ProdutoModel produto) {
        try {
            return produtoModelList.set(index, produto);
        } catch (Exception ex) {
            return null;
        }
    }

    public ProdutoModel deleteProduto(int index) {
        try {
            return produtoModelList.remove(index);
        } catch (Exception ex) {
            return null;
        }
    }
}
