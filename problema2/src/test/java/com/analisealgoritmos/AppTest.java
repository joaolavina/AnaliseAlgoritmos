package com.analisealgoritmos;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.analisealgoritmos.ordem.Ordem;
import com.analisealgoritmos.ordem.TipoOrdem;

public class AppTest {


    @Test
    public void RegistrarOrdemVenda() {
        BolsaValores bolsaValores = new BolsaValores();
        Acao acao1 = new Acao("acao1", 20.00, bolsaValores);
        Investidor investidor1 = new Investidor("nome");     
        Ordem ordem1 = new Ordem(investidor1, 20.00, TipoOrdem.OrdemVenda);

        acao1.registrarOrdem(ordem1);
        
        assertEquals(ordem1, acao1.getOrdens().get(0));
    }

    @Test
    public void RegistrarOrdemCompra() {
        BolsaValores bolsaValores = new BolsaValores();
        Acao acao1 = new Acao("acao1", 20.00, bolsaValores);
        Investidor investidor1 = new Investidor("nome");     
        Ordem ordem1 = new Ordem(investidor1, 20.00, TipoOrdem.OrdemCompra);

        acao1.registrarOrdem(ordem1);
        
        assertEquals(ordem1, acao1.getOrdens().get(0));

    }

    @Test
    public void SeRegistrarEmUmaAcao() {
        BolsaValores bolsaValores = new BolsaValores();
        Acao acao1 = new Acao("acao1", 20.00, bolsaValores);
        Investidor investidor1 = new Investidor("nome");     
        
        bolsaValores.assinarAcao(acao1, investidor1);
        
        assertEquals(investidor1, bolsaValores.getInscritosAcao(acao1).get(0));
    }

    @Test
    public void OrdensPreCadastradasPt1() {
        BolsaValores bolsaValores = new BolsaValores();
        Acao acao1 = new Acao("acao1", 18.00, bolsaValores);
        Investidor investidor1 = new Investidor("nome");
        Ordem ordem1 = new Ordem(investidor1, 20.00, TipoOrdem.OrdemCompra);
        Ordem ordem2 = new Ordem(investidor1, 14.00, TipoOrdem.OrdemVenda);

        investidor1.programarOrdem(acao1,ordem1, 20.00);
        investidor1.programarOrdem(acao1, ordem2, 14.00);

        assertEquals(ordem1, investidor1.getOrdensPreRegistradas(acao1).get(0));
    }

    @Test
    public void OrdensPreCadastradasPt2() {
        BolsaValores bolsaValores = new BolsaValores();
        Acao acao1 = new Acao("acao1", 18.00, bolsaValores);
        Investidor investidor1 = new Investidor("nome");
        Ordem ordem1 = new Ordem(investidor1, 20.00, TipoOrdem.OrdemCompra);
        Ordem ordem2 = new Ordem(investidor1, 14.00, TipoOrdem.OrdemVenda);

        investidor1.programarOrdem(acao1,ordem1, 20.00);
        investidor1.programarOrdem(acao1, ordem2, 14.00);

        assertEquals(ordem2, investidor1.getOrdensPreRegistradas(acao1).get(1));
    }

    @Test
    public void GetOrdem() {
        Investidor investidor1 = new Investidor("nome");     
        Ordem ordem1 = new Ordem(investidor1, 20.00, TipoOrdem.OrdemCompra);

        assertEquals(investidor1, ordem1.getInvestidor());
        assertEquals(TipoOrdem.OrdemCompra, ordem1.getTipoOrdem());
        assertEquals(20.00, ordem1.getValor(), 0.00);
    }

}
