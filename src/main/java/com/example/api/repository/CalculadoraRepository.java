package com.example.api.repository;

import com.example.api.entities.CalculadorEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface CalculadoraRepository extends JpaRepository<CalculadorEntity, Integer> {

}
