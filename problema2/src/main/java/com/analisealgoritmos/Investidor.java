package com.analisealgoritmos;

import java.util.Map;

import com.analisealgoritmos.interfaces.Observador;
import com.analisealgoritmos.ordem.Ordem;

public class Investidor implements Observador {

    private String nome;
    private Map<Acao, Ordem> ordensPreRegistradas;

    public Investidor(String nome){
        setNome(nome);
    }

    public String getNome() {
        return nome;
    }
    
    @Override
    public void atualizar(Acao acao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'atualizarAcao'");
    }

    private void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio");
        }
        this.nome = nome;
    }
}
