package com.analisedealgoritmos.model.entrega;

import com.analisedealgoritmos.model.Pedido;

public class RetiradaLocal implements TipoEntrega {

    @Override
    public double calcular(Pedido p) throws IllegalArgumentException {
        return 0;
    }
}
