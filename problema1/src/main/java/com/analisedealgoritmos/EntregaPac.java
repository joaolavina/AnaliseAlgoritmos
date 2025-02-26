package com.analisedealgoritmos;
import java.util.List;

public class EntregaPac implements Entrega{

    public double calcularValorEntrega(List<Produto> produtos) {
        double pesoTotal = 0;
        double valorTotal = 0;

        for (Produto produto : produtos) {
            pesoTotal += produto.getPeso();
        }

        if (pesoTotal < 1000) {
            valorTotal = 10;
        } else if(pesoTotal < 2000) {
            valorTotal = 15;
        } else if(pesoTotal < 3000){
            valorTotal = 20;
        } else if(pesoTotal <= 5000){
            valorTotal = 30;
        } else{
            throw new IllegalArgumentException("Não é possível fazer entrega com pedidos acima de 5kg.");
        }

        return valorTotal;
    }


}
