package com.analisealgoritmos;

import com.analisealgoritmos.enums.*;

public class ControleUniversal {

    private ControlePersiana controlePersiana;
    private ControleLampada controleLampada;

    public ControleUniversal() {
        controlePersiana = new ControlePersiana();
        controleLampada = new ControleLampada();
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

    }

    public void desligarArCondicionado(EArCondicionado eArCondicionado) {

    }

    public void aumentarTemperatura(EArCondicionado eArCondicionado) {

    }

    public void diminuirTemperatura(EArCondicionado eArCondicionado) {

    }

    public void aumentarTemperatura(EArCondicionado eArCondicionado, int temperatura) {

    }

    public void diminuirTemperatura(EArCondicionado eArCondicionado, int temperatura) {

    }

    public void ativarModoSono(EArCondicionado eArCondicionado, ELampada eLampada, EPersiana ePersiana) {

    }

    public void ativarModoTrabalho(EArCondicionado eArCondicionado, ELampada eLampada, EPersiana ePersiana) {

    }

}
