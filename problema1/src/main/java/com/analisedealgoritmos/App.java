package com.analisedealgoritmos;

import java.util.Map;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ProcessamentoPedido processamento = new ProcessamentoPedido();
        Pedido pedido = new Pedido();
        pedido.addProduto(new Produto("P1", 20.0, 2000)); 

        Map<String,Double> valoresEntrega = processamento.processarPedido(pedido);

        StringBuilder valoresStr = new StringBuilder();
        

        for (Map.Entry<String, Double> entry : valoresEntrega.entrySet()) {
            valoresStr.append("\n" + entry.getKey() + ": R$ " + entry.getValue());
        }

        System.out.println(valoresStr.toString());
    }
}
