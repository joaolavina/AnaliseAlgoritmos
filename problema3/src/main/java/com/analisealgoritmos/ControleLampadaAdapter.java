package com.analisealgoritmos;

import com.analisealgoritmos.enums.ELampada;

import br.furb.analise.algoritmos.LampadaPhellipes;
import br.furb.analise.algoritmos.LampadaShoyuMi;

public class ControleLampadaAdapter {

    private LampadaPhellipes lampadaPhellipes;
    private LampadaShoyuMi lampadaShoyuMi;


    public boolean verificarLampadaLigadaPhellipes() {
        return lampadaPhellipes.getIntensidade() > 0;
    }

    public boolean verificarLampadaLigadaShoyuMi() {
        return lampadaShoyuMi.estaLigada();
    }

    public void desligarLampada(ELampada eLampada) {
        switch (eLampada) {
            case Phellipes:
                desligarLampadaPhellipes();
                break;
            case ShoyuMi:
                desligarLampadaShoyuMi();
                break;
        }
    }

    public void ligarLampada(ELampada eLampada) {
        switch (eLampada) {
            case Phellipes:
                ligarLampadaPhellipes();
                break;
            case ShoyuMi:
                ligarLampadaShoyuMi();
                break;
        }
    }

    public ControleLampadaAdapter(){
        lampadaPhellipes = new LampadaPhellipes();
        lampadaShoyuMi = new LampadaShoyuMi();
    }

    private void ligarLampadaPhellipes() {
        lampadaPhellipes.setIntensidade(100);
    }

    private void desligarLampadaPhellipes() {
        lampadaPhellipes.setIntensidade(0);
    }
    

    private void ligarLampadaShoyuMi() {
        lampadaShoyuMi.ligar();
    }

    private void desligarLampadaShoyuMi() {
        lampadaShoyuMi.desligar();
    }
}
