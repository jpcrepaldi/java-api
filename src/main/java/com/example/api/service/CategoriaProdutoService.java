package com.example.api.service;

import com.example.api.entities.CategoriaProdutoEntity;
import com.example.api.model.CategoriaProdutoModel;
import com.example.api.repository.CategoriaProdutoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriaProdutoService {

    private CategoriaProdutoRepository categoriaProdutoRepository;

    public CategoriaProdutoService(CategoriaProdutoRepository categoriaProdutoRepository) {
        this.categoriaProdutoRepository = categoriaProdutoRepository;
    }

    public CategoriaProdutoModel process(CategoriaProdutoModel categoriaProdutoModel) throws Exception {
        var nomeCategoria = categoriaProdutoModel.getNomeCategoria();

        var categoriaProdutoEntity = new CategoriaProdutoEntity();
        categoriaProdutoEntity.setNomeCategoria(nomeCategoria);

        var entity = categoriaProdutoRepository.save(categoriaProdutoEntity);

        return new CategoriaProdutoModel(entity.getNomeCategoria());
    }

    public List<CategoriaProdutoModel> getAllProdutos() {
        var categoriaProdutoEntityList = categoriaProdutoRepository.findAll();
        var categoriaProdutoModelList = new ArrayList<CategoriaProdutoModel>();

        categoriaProdutoEntityList.stream()
                .map(entity -> {
                    var model = new CategoriaProdutoModel(entity.getNomeCategoria());
                    return categoriaProdutoModelList.add(model);
                }).toList();

        return categoriaProdutoModelList;
    }

    public CategoriaProdutoModel getByIndex(Integer index) {
        var entity = categoriaProdutoRepository.findById(index).get();

        return new CategoriaProdutoModel(entity.getNomeCategoria());
    }

    public CategoriaProdutoModel updateProduto(Integer index, CategoriaProdutoModel categoriaProdutoModel) {

        var entity = categoriaProdutoRepository.findById(index);

        if (entity.isPresent()) {
            entity.get().setNomeCategoria(categoriaProdutoModel.getNomeCategoria());
            var newEntity = categoriaProdutoRepository.save(entity.get());
            return new CategoriaProdutoModel(newEntity.getNomeCategoria());
        }

        return null;
    }

    public void deleteProduto(Integer index) {
        var entity = categoriaProdutoRepository.findById(index);

        if (entity.isPresent()) {
            categoriaProdutoRepository.delete(entity.get());
        }
    }
}

