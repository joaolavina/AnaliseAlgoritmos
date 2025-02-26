package com.analisedealgoritmos;
import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Produto> produtos = new ArrayList<>();

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void addProduto(Produto produto) {
        this.produtos.add(produto);
    }

}
