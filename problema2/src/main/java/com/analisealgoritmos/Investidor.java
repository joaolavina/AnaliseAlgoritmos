package com.analisealgoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Observable;
import java.util.Observer;

import com.analisealgoritmos.ordem.Ordem;

@SuppressWarnings("deprecation")
public class Investidor implements Observer {

    private String nome;
    private Map<Ordem, Double> valorOrdensPreRegistrada;
    private Map<Acao, List<Ordem>> ordensPreRegistradas;

    public Investidor(String nome) {
        setNome(nome);
        valorOrdensPreRegistrada = new HashMap<>();
        ordensPreRegistradas = new HashMap<>();
    }

    public List<Ordem> getOrdensPreRegistradas(Acao acao) {
        List<Ordem> ordensPreRegistradas = this.ordensPreRegistradas.get(acao);
        return ordensPreRegistradas;
    }

    public void programarOrdem(Acao acao, Ordem ordem, double valor ) {
        ordensPreRegistradas.computeIfAbsent(acao, k -> new ArrayList<>()).add(ordem);
        valorOrdensPreRegistrada.put(ordem, valor);
    }

    public void atualizar(Acao acao) {
        List<Ordem> ordens = ordensPreRegistradas.get(acao);

        for (Ordem ordem : ordens) {
            double valor = valorOrdensPreRegistrada.get(ordem);
            if(acao.getValor() == valor){
                acao.registrarOrdem(ordem);
            }
        }
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }

    @Override
    public void update(Observable o, Object arg) {
        Acao acao = (Acao) o;
        double valorAcao = acao.getValor();

        List<Ordem> ordens = ordensPreRegistradas.get(acao);

        for (Ordem ordem : ordens) {
            double valor = valorOrdensPreRegistrada.get(ordem);
            if(valorAcao == valor){
                acao.registrarOrdem(ordem);
            }
        }
    }
}
