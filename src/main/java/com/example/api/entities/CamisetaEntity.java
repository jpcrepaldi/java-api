package com.example.api.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "camisetas")
public class CamisetaEntity {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "tipo_camiseta")
    private String tipoCamiseta;

    @Column(name = "preco")
    private Double preco;

    @Column(name = "cor")
    private String cor;

    @Column(name = "tamanho")
    private String tamanho;

    @Column(name = "tecido")
    private String tecido;

    public void setTipoCamiseta(String tipoCamiseta) {
        this.tipoCamiseta = tipoCamiseta;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void setTecido(String tecido) {
        this.tecido = tecido;
    }

    public Integer getId() {
        return id;
    }

    public String getTipoCamiseta() {
        return tipoCamiseta;
    }

    public double getPreco() {
        return preco;
    }

    public String getCor() {
        return cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public String getTecido() {
        return tecido;
    }
}
