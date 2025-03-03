package com.analisealgoritmos;

import java.util.List;

import com.analisealgoritmos.interfaces.Observador;
import com.analisealgoritmos.ordem.Ordem;
import com.analisealgoritmos.ordem.TipoOrdem;

public class Acao {

    private String nome;
    private double valor;
    private List<Ordem> ordens;
    private List<Observador> observadores;

    public Acao(String nome, double valor) {
        setNome(nome);
        setValor(valor);
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
        Ordem ordemCorrespondente = encontrarCorrespondente(ordem);
        
        if(ordemCorrespondente != null){
            // aqui tanto faz a ordem das ordens pq o valor vai ser igual 
            removerOrdensEAtualizarValor(ordemCorrespondente, ordem); 
            notificarObservadores();
        }
    }

    private Ordem encontrarCorrespondente(Ordem ordem) {
        return ordens.stream()
                .filter(c -> c.getValor() == ordem.getValor() && ordem.getTipoOrdem() != c.getTipoOrdem()) 
                // a gente sempre vai procurar pelo tipo contrário do que a gente enviou
                .findFirst()
                .orElse(null);
    }

    private void removerOrdensEAtualizarValor(Ordem ordem1, Ordem ordem2) {
        ordens.remove(ordem1);
        ordens.remove(ordem2);

        setValor(ordem1.getValor());
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

    public double getValor() {
        return valor;
    }

}
