package com.analisealgoritmos;

import com.analisealgoritmos.enums.*;

public class ControleUniversal {

    private ControlePersiana controlePersiana;

    public ControleUniversal() {
        controlePersiana = new ControlePersiana();
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

    }

    public void desligarLampada(ELampada eLampada) {

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
