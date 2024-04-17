package com.example.api.entities;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Data
@Getter
@Entity
@Table(name = "calculador")
public class CalculadorEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Integer id;

    @Column(name = "resultado")
    public Double resultado;

    @Column(name = "operacao")
    public String operacao;

    @Column(name = "A")
    public Double A;

    @Column(name = "B")
    public Double B;

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public void setOperacao(String operacao) {
        this.operacao = operacao;
    }

    public void setA(Double A) {
        this.A = A;
    }

    public void setB(Double B) {
        this.B = B;
    }
}

