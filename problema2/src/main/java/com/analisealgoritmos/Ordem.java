package com.analisealgoritmos;

public abstract class Ordem {

    String nomeInvestidor;
    double valor;

    public Ordem(String nomeInvestidor, double valor) {
        setNomeInvestidor(nomeInvestidor);
        setValor(valor);
    }

    public String getNomeInvestidor() {
        return nomeInvestidor;
    }

    public void setNomeInvestidor(String nomeInvestidor) {
        this.nomeInvestidor = nomeInvestidor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


}
