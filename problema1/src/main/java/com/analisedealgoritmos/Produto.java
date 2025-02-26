package com.analisedealgoritmos;
public class Produto {

    private String nome;
    private double valor;
    private int peso;

    public Produto(String nome, double valor, int peso) {
        this.nome = nome;
        this.valor = valor;
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        if (valor < 0)
            throw new IllegalArgumentException("Valor do produto não pode ser negativo");

        this.valor = valor;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        if (peso < 0)
            throw new IllegalArgumentException("Peso do produto não pode ser negativo");

        this.peso = peso;
    }
}
