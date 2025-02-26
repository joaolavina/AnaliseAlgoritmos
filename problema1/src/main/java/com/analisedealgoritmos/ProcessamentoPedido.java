package com.analisedealgoritmos;

import java.util.HashMap;
import java.util.Map;

public class ProcessamentoPedido {

    public Map<String, Double> processarPedido(Pedido pedido) {
     
        Map<String, Double> valoresOpcaoEntrega = new HashMap<String, Double>();

        try {
            double valorPac = new EntregaPac().calcularValorEntrega(pedido.getProdutos());
            valoresOpcaoEntrega.put("Entrega PAC", valorPac);
        } catch (IllegalArgumentException e) {
            
        }

        double valorSedex = new EntregaSedex().calcularValorEntrega(pedido.getProdutos());
        valoresOpcaoEntrega.put("Entrega SEDEX", valorSedex);
        
        double valorRetirada = new Retirada().calcularValorEntrega(pedido.getProdutos());
        valoresOpcaoEntrega.put("Retirada", valorRetirada);

        return valoresOpcaoEntrega;
    }
}
