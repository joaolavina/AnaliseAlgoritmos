package com.analisealgoritmos;

import br.furb.analise.algoritmos.PersianaNatLight;
import br.furb.analise.algoritmos.PersianaSolarius;

public class ControlePersiana {

    public void abrirPersianaNatLight(){
        PersianaNatLight persianaNatLight = new PersianaNatLight();

        try {
            persianaNatLight.abrirPalheta();
            persianaNatLight.subirPalheta();
        } catch (Exception e) {
            
        }
    }
    
    public void fecharPersianaNatLight(){
        PersianaNatLight persianaNatLight = new PersianaNatLight();

        try {
            persianaNatLight.descerPalheta();
            persianaNatLight.fecharPalheta();
        } catch (Exception e) {
            
        }
    }

    public void abrirPersianaSolarius(){
        PersianaSolarius persianaSolarius = new PersianaSolarius();
        persianaSolarius.subirPersiana();
    }
    
    public void fecharPersianaSolarius(){
        PersianaSolarius persianaSolarius = new PersianaSolarius();
        persianaSolarius.descerPersiana();
    }
}
