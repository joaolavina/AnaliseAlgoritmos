package com.analisealgoritmos.ordem;

import com.analisealgoritmos.Investidor;

public class Ordem {

    private Investidor investidor;
    private double valor;
    private TipoOrdem tipoOrdem;

    public Ordem(Investidor investidor, double valor, TipoOrdem tipoOrdem) {
        setInvestidor(investidor);
        setValor(valor);
        setTipoOrdem(tipoOrdem);
    }
    
    public Investidor getInvestidor() {
        return investidor;
    }

    public double getValor() {
        return valor;
    }

    public TipoOrdem getTipoOrdem() {
        return tipoOrdem;
    }

    private void setInvestidor(Investidor investidor) {
        if (investidor == null)
            throw new IllegalArgumentException("Investidor não pode ser nulo");

        this.investidor = investidor;
    }

    private void setValor(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("Valor não pode ser menor ou igual a zero");

        this.valor = valor;
    }

    private void setTipoOrdem(TipoOrdem tipoOrdem) {
        if (tipoOrdem == null)
            throw new IllegalArgumentException("Tipo de ordem não pode ser nulo");

        this.tipoOrdem = tipoOrdem;
    }
}
