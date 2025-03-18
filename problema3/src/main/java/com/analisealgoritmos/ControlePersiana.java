package com.analisealgoritmos;

import br.furb.analise.algoritmos.PersianaNatLight;
import br.furb.analise.algoritmos.PersianaSolarius;

public class ControlePersiana {

    private PersianaNatLight persianaNatLight;
    private PersianaSolarius persianaSolarius;

    public ControlePersiana() {
        this.persianaNatLight = new PersianaNatLight();
        this.persianaSolarius = new PersianaSolarius();
    }

    public void abrirPersianaNatLight() {
        try {
            persianaNatLight.abrirPalheta();
            persianaNatLight.subirPalheta();
        } catch (Exception e) {

        }
    }

    public void fecharPersianaNatLight() {
        try {
            persianaNatLight.descerPalheta();
            persianaNatLight.fecharPalheta();
        } catch (Exception e) {

        }
    }
    
    public boolean verificarPersianaAbertaNatLight() {
        return persianaNatLight.estaPalhetaAberta() && persianaNatLight.estaPalhetaErguida();
    }
   
    public void abrirPersianaSolarius() {
        persianaSolarius.subirPersiana();
    }

    public void fecharPersianaSolarius() {
        persianaSolarius.descerPersiana();
    }

    public boolean verificarPersianaAbertaSolarius() {
        return persianaSolarius.estaAberta();
    }
}
