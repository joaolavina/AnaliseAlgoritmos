package com.analisealgoritmos;

import com.analisealgoritmos.enums.EArCondicionado;
import com.analisealgoritmos.enums.ELampada;
import com.analisealgoritmos.enums.EPersiana;

public class ControleUniversal {

    private ControlePersianaAdapter controlePersiana;
    private ControleLampadaAdapter controleLampada;
    private ControleArCondicionadoAdapter controleArCondicionado;

    public ControleUniversal() {
        controlePersiana = new ControlePersianaAdapter();
        controleLampada = new ControleLampadaAdapter();
        controleArCondicionado = new ControleArCondicionadoAdapter();
    }

    public boolean verificarPersianaAberta(EPersiana ePersiana) {
        switch (ePersiana) {
            case NatLight:
                return controlePersiana.verificarPersianaAbertaNatLight();
            case Solarius:
                return controlePersiana.verificarPersianaAbertaSolarius();
        }
        return false;
    }

    public boolean verificarLampadaLigada(ELampada eLampada) {
        switch (eLampada) {
            case Phellipes:
                return controleLampada.verificarLampadaLigadaPhellipes();
            case ShoyuMi:
                return controleLampada.verificarLampadaLigadaShoyuMi();
        }
        return false;
    }

    public boolean verificarArCondicionadoLigado(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                return controleArCondicionado.verificarArCondicionadoLigadoVentoBaumn();
            case GellaKaza:
                return controleArCondicionado.verificarArCondicionadoLigadoGellaKaza();
        }
        return false;
    }
    
    public int getTemperaturaArCondicionado(EArCondicionado eArCondicionado) {
        switch (eArCondicionado) {
            case VentoBaumn:
                return controleArCondicionado.getTemperaturaVentoBaumn();
            case GellaKaza:
                return controleArCondicionado.getTemperaturaGellaKaza();
            default:
                return 0;
        }
    }
    
    public void ativarModoSono(EArCondicionado eArCondicionado, ELampada eLampada, EPersiana ePersiana) {
        controleLampada.desligarLampada(eLampada);
        controleArCondicionado.desligarArCondicionado(eArCondicionado);
        controlePersiana.fecharPersiana(ePersiana);
    }

    public void ativarModoTrabalho(EArCondicionado eArCondicionado, ELampada eLampada, EPersiana ePersiana) {
        controleLampada.ligarLampada(eLampada);
        controleArCondicionado.ligarArCondicionado(eArCondicionado);
        controleArCondicionado.definirTemperatura(eArCondicionado, 25);
        controlePersiana.abrirPersiana(ePersiana);
    }

}
