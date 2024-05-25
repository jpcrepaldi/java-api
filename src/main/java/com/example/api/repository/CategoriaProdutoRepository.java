package com.example.api.repository;

import com.example.api.entities.CategoriaProdutoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProdutoEntity, Integer> {
}
