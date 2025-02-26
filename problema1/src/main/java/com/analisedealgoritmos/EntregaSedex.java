package com.analisedealgoritmos;
import java.util.List;

public class EntregaSedex implements Entrega {

    @Override
    public double calcularValorEntrega(List<Produto> produtos) {
        double pesoTotal = 0;
        double valorTotal = 0;

        for (Produto produto : produtos) {
            pesoTotal += produto.getPeso();
        }

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
