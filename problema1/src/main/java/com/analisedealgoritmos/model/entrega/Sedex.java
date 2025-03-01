package com.analisedealgoritmos.model.entrega;

import com.analisedealgoritmos.model.Pedido;

public class Sedex implements TipoEntrega {

    @Override
    public double calcular(Pedido p) throws IllegalArgumentException {
        double valorTotal;
        double pesoTotal = p.getPesoTotal();

        if (pesoTotal < 500) {
            valorTotal = 12.5;
        } else if (pesoTotal < 750) {
            valorTotal = 20;
        } else if (pesoTotal < 1200) {
            valorTotal = 30;
        } else if (pesoTotal < 2000) {
            valorTotal = 45;
        } else {
            valorTotal = 46.5 + (1.5 * (int) (pesoTotal - 2000) / 100);
        }

        return valorTotal;
    }
}
