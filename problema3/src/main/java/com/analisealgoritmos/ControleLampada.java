package com.analisealgoritmos;

import br.furb.analise.algoritmos.LampadaPhellipes;
import br.furb.analise.algoritmos.LampadaShoyuMi;

public class ControleLampada {

    private LampadaPhellipes lampadaPhellipes;
    private LampadaShoyuMi lampadaShoyuMi;

    public ControleLampada(){
        lampadaPhellipes = new LampadaPhellipes();
        lampadaShoyuMi = new LampadaShoyuMi();
    }

    public void ligarLampadaPhellipes() {
        lampadaPhellipes.setIntensidade(100);
    }

    public void desligarLampadaPhellipes() {
        lampadaPhellipes.setIntensidade(0);
    }

    public void ligarLampadaShoyuMi() {
        lampadaShoyuMi.ligar();
    }

    public void desligarLampadaShoyuMi() {
        lampadaShoyuMi.desligar();
    }
}
