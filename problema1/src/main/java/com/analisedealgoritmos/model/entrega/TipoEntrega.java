package com.analisedealgoritmos.model.entrega;

import com.analisedealgoritmos.model.Pedido;

public interface TipoEntrega {
    public double calcular(Pedido p) throws IllegalArgumentException;
}
