package com.analisealgoritmos;

import java.util.List;

import com.analisealgoritmos.interfaces.Observador;
import com.analisealgoritmos.ordem.Ordem;

public class Acao {

    private String nome;
    private double valor;
    private List<Ordem> ordens;
    private List<Observador> observadores;

    public Acao(String nome, double valor) {
        setNome(nome);
        setValor(valor);
    }

    public double getValor() {
        return valor;
    }

    public void adicionarObservador(Observador observador) {
        observadores.add(observador);
    }

    public void removerObservador(Observador observador) {
        observadores.remove(observador);
    }

    public void registrarOrdem(Ordem ordem) {
        ordens.add(ordem);
        verificarMatchOrdem(ordem);
    }

    private void notificarObservadores() {
        observadores.forEach(o -> o.atualizar(this));
    }

    private void verificarMatchOrdem(Ordem ordem) {
        // talvez tenha uma forma de usar o template method aqui, mas não sei como
        switch (ordem.getTipoOrdem()) {
            case OrdemCompra -> {
                Ordem ordemVenda = encontrarOrdemVenda(ordem);
                removerOrdensEAtualizarValor(ordem, ordemVenda);
                notificarObservadores();
            }
            case OrdemVenda -> {
                Ordem ordemCompra = encontrarOrdemCompra(ordem);
                removerOrdensEAtualizarValor(ordemCompra, ordem);
                notificarObservadores();
            }
            default -> throw new IllegalArgumentException("Tipo de ordem inválido");
        }
    }

    private Ordem encontrarOrdemCompra(Ordem ordem) {
        // não arrumei
        return ordens.stream().filter(c -> c.getValor() == ordem.getValor() && c instanceof OrdemCompra).findFirst()
                .orElse(null);
    }

    private Ordem encontrarOrdemVenda(Ordem ordem) {
        // não arrumei
        return ordens.stream().filter(c -> c.getValor() == ordem.getValor() && c instanceof OrdemVenda).findFirst()
                .orElse(null);
    }

    private void removerOrdensEAtualizarValor(Ordem ordemCompra, Ordem ordemVenda) {
        ordens.remove(ordemCompra);
        ordens.remove(ordemVenda);

        setValor(ordemCompra.getValor());
    }
 
    private void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    private void setValor(double valor) {
        if (valor <= 0)
            throw new IllegalArgumentException("Valor não pode ser menor ou igual a zero");

        this.valor = valor;
    }

}
