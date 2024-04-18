package com.example.api.repository;

import com.example.api.entities.CamisetaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CamisetaRepository extends JpaRepository<CamisetaEntity, Integer> {
}
