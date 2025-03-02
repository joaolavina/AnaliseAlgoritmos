package com.analisealgoritmos;

import java.util.List;

public class Acao {

    private String nome;
    private double valor;
    private List<Ordem> ordens;
    // private Map<Double, List<Ordem>> ordens;

    public Acao(String nome, double valor) {
        setNome(nome);
        setValor(valor);
    }

    public void adicionarOrdem(Ordem ordem) {
        ordens.add(ordem);
        verificarMatchOrdem(ordem);
    }

    public void removerOrdem(Ordem ordem) {
        ordens.remove(ordem);
    }

    public void verificarMatchOrdem(Ordem ordem) {
        Ordem ordemRegistrada;

        if (ordem instanceof OrdemVenda)
            ordemRegistrada = encontrarOrdemCompra(ordem);
        else
            ordemRegistrada = encontrarOrdemVenda(ordem);

        if(ordemRegistrada != null){
            removerOrdem(ordem);
            removerOrdem(ordemRegistrada);
            setValor(ordem.getValor());
        }
    }

    private Ordem encontrarOrdemCompra(Ordem ordem) {
        return ordens.stream().filter(c -> c.getValor() == ordem.getValor() && c instanceof OrdemCompra).findFirst()
                .orElse(null);
    }

    private Ordem encontrarOrdemVenda(Ordem ordem) {
        return ordens.stream().filter(c -> c.getValor() == ordem.getValor() && c instanceof OrdemVenda).findFirst()
                .orElse(null);
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    private void setValor(double valor) {
        this.valor = valor;
    }

}
