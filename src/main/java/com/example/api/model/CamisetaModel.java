package com.example.api.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CamisetaModel {

    @JsonProperty("tipoCamiseta")
    private String tipoCamiseta;

    @JsonProperty("preco")
    private Double preco;

    @JsonProperty("cor")
    private String cor;

    @JsonProperty("tamanho")
    private String tamanho;

    @JsonProperty("tecido")
    private String tecido;

    public CamisetaModel(String tipoCamiseta, Double preco, String cor, String tamanho, String tecido){
        this.tipoCamiseta = tipoCamiseta;
        this.preco = preco;
        this.cor = cor;
        this.tecido = tecido;
        this.tamanho = tamanho;
    }

    public String getTipoCamiseta() {
        return tipoCamiseta;
    }

    public Double getPreco() {
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
