package com.analisealgoritmos;

import com.analisealgoritmos.enums.*;

public class ControleUniversal {

    private ControlePersiana controlePersiana;
    private ControleLampada controleLampada;
    private ControleArCondicionado controleArCondicionado;

    public ControleUniversal() {
        controlePersiana = new ControlePersiana();
        controleLampada = new ControleLampada();
        controleArCondicionado = new ControleArCondicionado();
    }

    public void abrirPersiana(EPersiana ePersiana) {
        switch (ePersiana) {
            case NatLight:
                controlePersiana.abrirPersianaNatLight();
                break;
            case Solarius:
                controlePersiana.abrirPersianaSolarius();
                break;
        }
    }

    public void fecharPersiana(EPersiana ePersiana) {
        switch (ePersiana) {
            case NatLight:
                controlePersiana.fecharPersianaNatLight();
                break;
            case Solarius:
                controlePersiana.fecharPersianaSolarius();
                break;
        }
    }

    public void ligarLampada(ELampada eLampada) {
        switch (eLampada) {
            case Phellipes:
                controleLampada.ligarLampadaPhellipes();
                break;
            case ShoyuMi:
                controleLampada.ligarLampadaShoyuMi();
                break;
        }
    }

    public void desligarLampada(ELampada eLampada) {
        switch (eLampada) {
            case Phellipes:
                controleLampada.desligarLampadaPhellipes();
                break;
            case ShoyuMi:
                controleLampada.desligarLampadaShoyuMi();
                break;
        }
    }

    public void ligarArCondicionado(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                controleArCondicionado.ligarArCondicionadoVentoBaumn();
                break;
            case GellaKaza:
                controleArCondicionado.ligarArCondicionadoGellaKaza();
                break;
        }
    }

    public void desligarArCondicionado(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                controleArCondicionado.desligarArCondicionadoVentoBaumn();
                break;
            case GellaKaza:
                controleArCondicionado.desligarArCondicionadoGellaKaza();
                break;
        }
    }

    public void aumentarTemperatura(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                controleArCondicionado.aumentarTemperaturaVentoBaumn();
                break;
            case GellaKaza:
                controleArCondicionado.aumentarTemperaturaGellaKaza();
                break;
        }
    }

    public void diminuirTemperatura(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                controleArCondicionado.diminuirTemperaturaVentoBaumn();
                break;
            case GellaKaza:
                controleArCondicionado.diminuirTemperaturaGellaKaza();
                break;
        }
    }

    public void definirTemperatura(EArCondicionado eArCondicionado, int temperatura) {
        switch (eArCondicionado) {
            case VentoBaumn:
                controleArCondicionado.definirTemperaturaVentoBaumn(temperatura);
                break;
            case GellaKaza:
                controleArCondicionado.definirTemperaturaGellaKaza(temperatura);
                break;
        }
    }

    public void ativarModoSono(EArCondicionado eArCondicionado, ELampada eLampada, EPersiana ePersiana) {
        desligarLampada(eLampada);
        desligarArCondicionado(eArCondicionado);
        fecharPersiana(ePersiana);
    }

    public void ativarModoTrabalho(EArCondicionado eArCondicionado, ELampada eLampada, EPersiana ePersiana) {
        ligarLampada(eLampada);
        ligarArCondicionado(eArCondicionado);
        definirTemperatura(eArCondicionado, 25);
        abrirPersiana(ePersiana);
    }

}
