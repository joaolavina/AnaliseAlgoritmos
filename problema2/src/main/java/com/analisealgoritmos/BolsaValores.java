package com.analisealgoritmos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BolsaValores {

    // Se não for possível um investidor se inscrever em mais de uma ação,
    // O Set evita duplicatas
    // private Map<Acao, Set<Investidor>> inscritosAcao;
    private Map<Acao, List<Investidor>> inscritosAcao;

    

    public BolsaValores() {
        this.inscritosAcao = new HashMap<>();
    }

    public void assinarAcao(Acao acao, Investidor investidor) {
        inscritosAcao.computeIfAbsent(acao, k -> new ArrayList<>()).add(investidor);
    }

    public void cancelarAssinaturaAcao(Acao acao, Investidor investidor) {
        inscritosAcao.computeIfAbsent(acao, k -> new ArrayList<>()).remove(investidor);
    }

    public void notificar(Acao acao) {
        List<Investidor> investidoresInscritos = getInscritosAcao(acao);

        for (Investidor investidor : investidoresInscritos) {
            investidor.atualizar(acao);
        }
    }

    public List<Investidor> getInscritosAcao(Acao acao) {
        List<Investidor> investidoresInscritos = inscritosAcao.get(acao);
        return investidoresInscritos;
    }
}
