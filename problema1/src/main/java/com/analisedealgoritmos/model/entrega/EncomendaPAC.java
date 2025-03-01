package com.analisedealgoritmos.model.entrega;

import com.analisedealgoritmos.model.Pedido;

public class EncomendaPAC implements TipoEntrega {

    @Override
    public double calcular(Pedido p) throws IllegalArgumentException {
        double valor;
        double pesoTotal = p.getPesoTotal();

        if (pesoTotal < 1000) {
            valor = 10;
        } else if(pesoTotal < 2000) {
            valor = 15;
        } else if(pesoTotal < 3000) {
            valor = 20;
        } else if(pesoTotal <= 5000) {
            valor = 30;
        } else{
            throw new IllegalArgumentException("Não é possível fazer entrega com pedidos acima de 5kg.");
        }

        return valor;
    }
}
