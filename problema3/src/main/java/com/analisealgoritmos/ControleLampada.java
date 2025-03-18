package com.analisealgoritmos;

import br.furb.analise.algoritmos.LampadaPhellipes;
import br.furb.analise.algoritmos.LampadaShoyuMi;

public class ControleLampada {

    public void ligarLampadaPhellipes() {
        LampadaPhellipes lampadaPhellipes = new LampadaPhellipes();
        lampadaPhellipes.setIntensidade(100);
    }

    public void desligarLampadaPhellipes() {
        LampadaPhellipes lampadaPhellipes = new LampadaPhellipes();
        lampadaPhellipes.setIntensidade(0);
    }

    public void ligarLampadaShoyuMi() {
        LampadaShoyuMi lampadaShoyuMi = new LampadaShoyuMi();
        lampadaShoyuMi.ligar();
    }

    public void desligarLampadaShoyuMi() {
        LampadaShoyuMi lampadaShoyuMi = new LampadaShoyuMi();
        lampadaShoyuMi.desligar();
    }
}
