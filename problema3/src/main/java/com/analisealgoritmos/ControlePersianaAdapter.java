package com.analisealgoritmos;

import com.analisealgoritmos.enums.EPersiana;

import br.furb.analise.algoritmos.PersianaNatLight;
import br.furb.analise.algoritmos.PersianaSolarius;

public class ControlePersianaAdapter {

    private PersianaNatLight persianaNatLight;
    private PersianaSolarius persianaSolarius;

    public ControlePersianaAdapter() {
        this.persianaNatLight = new PersianaNatLight();
        this.persianaSolarius = new PersianaSolarius();
    }

    public boolean verificarPersianaAbertaNatLight() {
        return persianaNatLight.estaPalhetaAberta() && persianaNatLight.estaPalhetaErguida();
    }

    public boolean verificarPersianaAbertaSolarius() {
        return persianaSolarius.estaAberta();
    }

    public void fecharPersiana(EPersiana ePersiana) {
		switch (ePersiana) {
            case NatLight:
                fecharPersianaNatLight();
                break;
            case Solarius:
                fecharPersianaSolarius();
                break;
        }
	}

    void abrirPersiana(EPersiana ePersiana) {
        switch (ePersiana) {
            case NatLight:
                abrirPersianaNatLight();
                break;
            case Solarius:
                abrirPersianaSolarius();
                break;
        }
    }

    private  void abrirPersianaNatLight() {
        try {
            persianaNatLight.abrirPalheta();
            persianaNatLight.subirPalheta();
        } catch (Exception e) {

        }
    }

    private void fecharPersianaNatLight() {
        try {
            persianaNatLight.descerPalheta();
            persianaNatLight.fecharPalheta();
        } catch (Exception e) {

        }
    }
   
    private void abrirPersianaSolarius() {
        persianaSolarius.subirPersiana();
    }

    private void fecharPersianaSolarius() {
        persianaSolarius.descerPersiana();
    }
}
