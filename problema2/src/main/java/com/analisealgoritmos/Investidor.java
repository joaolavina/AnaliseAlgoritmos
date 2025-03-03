package com.analisealgoritmos;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.analisealgoritmos.interfaces.Observador;
import com.analisealgoritmos.ordem.Ordem;

public class Investidor implements Observador {

    private String nome;
    private Map<Ordem, Double> valorOrdensPreRegistrada;
    private Map<Acao, List<Ordem>> ordensPreRegistradas;

    public Investidor(String nome) {
        setNome(nome);
    }

    public void programarOrdem(Acao acao, Ordem ordem, double valor ) {
        ordensPreRegistradas.computeIfAbsent(acao, k -> new ArrayList<>()).add(ordem);
        valorOrdensPreRegistrada.put(ordem, valor);
    }

    @Override
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
}
