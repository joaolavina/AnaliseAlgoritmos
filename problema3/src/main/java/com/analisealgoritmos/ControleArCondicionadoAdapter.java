package com.analisealgoritmos;

import com.analisealgoritmos.enums.EArCondicionado;

import br.furb.analise.algoritmos.ArCondicionadoGellaKaza;
import br.furb.analise.algoritmos.ArCondicionadoVentoBaumn;

public class ControleArCondicionadoAdapter {
    
    private ArCondicionadoVentoBaumn arCondicionadoVentoBaumn;
    private ArCondicionadoGellaKaza arCondicionadoGellaKaza;

    public ControleArCondicionadoAdapter() {
        arCondicionadoVentoBaumn = new ArCondicionadoVentoBaumn();
        arCondicionadoGellaKaza = new ArCondicionadoGellaKaza();
    }

    public void ligarArCondicionadoVentoBaumn() {
        arCondicionadoVentoBaumn.ligar();
    }

    public void desligarArCondicionadoVentoBaumn() {
        arCondicionadoVentoBaumn.desligar();
    }

    public void ligarArCondicionadoGellaKaza() {
        arCondicionadoGellaKaza.ativar();
    }

    public void desligarArCondicionadoGellaKaza() {
        arCondicionadoGellaKaza.desativar();
    }

    public void aumentarTemperaturaVentoBaumn() {
        int temperatura = arCondicionadoVentoBaumn.getTemperatura();
        arCondicionadoVentoBaumn.definirTemperatura(++temperatura);
    }

    public void diminuirTemperaturaVentoBaumn() {
        int temperatura = arCondicionadoVentoBaumn.getTemperatura();
        arCondicionadoVentoBaumn.definirTemperatura(--temperatura);
    }

    public void aumentarTemperaturaGellaKaza() {
        arCondicionadoGellaKaza.aumentarTemperatura();
    }

    public void diminuirTemperaturaGellaKaza() {
        arCondicionadoGellaKaza.diminuirTemperatura();
    }

    public void definirTemperaturaVentoBaumn(int temperatura) {
        arCondicionadoVentoBaumn.definirTemperatura(temperatura);
    }

    public boolean verificarArCondicionadoLigadoVentoBaumn() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("Função de verificação de ar condicionado ligado não implementada");
    }

    public int getTemperaturaVentoBaumn() {
        return arCondicionadoVentoBaumn.getTemperatura();
    }
    
    public void definirTemperaturaGellaKaza(int temperatura) {
        int tempAtual = arCondicionadoGellaKaza.getTemperatura();

        if(tempAtual > temperatura) {
            while(tempAtual != temperatura) {
                arCondicionadoGellaKaza.diminuirTemperatura();
                tempAtual = arCondicionadoGellaKaza.getTemperatura();
            }
        } else {
            while(tempAtual != temperatura) {
                arCondicionadoGellaKaza.aumentarTemperatura();
                tempAtual = arCondicionadoGellaKaza.getTemperatura();
            }
        }
    }

    public boolean verificarArCondicionadoLigadoGellaKaza() {
        return arCondicionadoGellaKaza.estaLigado();
    }

    public int getTemperaturaGellaKaza() {
        return arCondicionadoGellaKaza.getTemperatura();
    }

    public void desligarArCondicionado(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                desligarArCondicionadoVentoBaumn();
                break;
            case GellaKaza:
                desligarArCondicionadoGellaKaza();
                break;
        }
    }

    public void definirTemperatura(EArCondicionado eArCondicionado, int temperatura) {
        switch (eArCondicionado) {
            case VentoBaumn:
            definirTemperaturaVentoBaumn(temperatura);
            break;
            case GellaKaza:
            definirTemperaturaGellaKaza(temperatura);
            break;
        }
    }

	public void ligarArCondicionado(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                ligarArCondicionadoVentoBaumn();
                break;
            case GellaKaza:
                ligarArCondicionadoGellaKaza();
                break;
        }
	}

    public void aumentarTemperatura(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                aumentarTemperaturaVentoBaumn();
                break;
            case GellaKaza:
                aumentarTemperaturaGellaKaza();
                break;
        }
    }

    public void diminuirTemperatura(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                diminuirTemperaturaVentoBaumn();
                break;
            case GellaKaza:
                diminuirTemperaturaGellaKaza();
                break;
        }
    }
}
