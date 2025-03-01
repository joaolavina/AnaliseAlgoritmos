package com.analisedealgoritmos.model;

import java.util.HashMap;
import java.util.Map;

import javax.management.InstanceNotFoundException;

import com.analisedealgoritmos.model.entrega.TipoEntrega;

public class Pedido {

    private int numero;
    private String nomeCliente;
    private TipoEntrega tipoEntrega = null;
    // adicionamos esse produtosQuantidades pois no diagrama de UML apresentado em aula não havia uma forma explícita de armazenar o valor sem ser em banco
    private Map<Produto, Integer> produtosQuantidades = new HashMap<>();

    public void incluirItem(Produto p, int quantidade) {
        this.produtosQuantidades.put(p, quantidade);
    }

    public void setTipoEntrega(TipoEntrega tipoEntrega) {
        this.tipoEntrega = tipoEntrega;
    }

    public TipoEntrega getTipoEntrega() {
        return this.tipoEntrega;
    }

    public double getPesoTotal() {
        double pesoTotal = 0;

        for (Map.Entry<Produto, Integer> produto : produtosQuantidades.entrySet()) {
            pesoTotal += produto.getKey().getPeso() * produto.getValue();
        }

        return pesoTotal;
    }

    public double getTotalPedido() {
        double totalPedido = 0;

        for (Map.Entry<Produto, Integer> produto : produtosQuantidades.entrySet()) {
            totalPedido += produto.getKey().getValor() * produto.getValue();
        }

        return totalPedido;
    }

    public double calcularEntrega() throws InstanceNotFoundException {

        if (tipoEntrega == null) 
            throw new InstanceNotFoundException("Tipo de entrega não definido!");

        return tipoEntrega.calcular(this);
    }
}
