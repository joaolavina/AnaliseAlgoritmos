
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.analisealgoritmos.ControleUniversal;
import com.analisealgoritmos.enums.EArCondicionado;
import com.analisealgoritmos.enums.ELampada;
import com.analisealgoritmos.enums.EPersiana;

public class ControleUniversalTest {

    ControleUniversal controleUniversal;

    @Before
    public void setUp() {
        controleUniversal = new ControleUniversal();
    }

    @Test
    public void abrirPersianaNatLightTest() {
        controleUniversal.abrirPersiana(EPersiana.NatLight);

        boolean persianaAberta = controleUniversal.verificarPersianaAberta(EPersiana.NatLight);
        assertTrue(persianaAberta);
    }

    @Test
    public void fecharPersianaNatLightTest() {
        controleUniversal.fecharPersiana(EPersiana.NatLight);

        boolean persianaAberta = controleUniversal.verificarPersianaAberta(EPersiana.NatLight);
        assertFalse(persianaAberta);
    }

    @Test
    public void abrirPersianaSolariusTest() {
        controleUniversal.abrirPersiana(EPersiana.Solarius);

        boolean persianaAberta = controleUniversal.verificarPersianaAberta(EPersiana.Solarius);
        assertTrue(persianaAberta);
    }

    @Test
    public void fecharPersianaSolariusTest() {
        controleUniversal.fecharPersiana(EPersiana.Solarius);

        boolean persianaAberta = controleUniversal.verificarPersianaAberta(EPersiana.Solarius);
        assertFalse(persianaAberta);
    }

    @Test
    public void ligarLampadaPhellipesTest() {
        controleUniversal.ligarLampada(ELampada.Phellipes);

        boolean lampadaLigada = controleUniversal.verificarLampadaLigada(ELampada.Phellipes);
        assertTrue(lampadaLigada);
    }

    @Test
    public void desligarLampadaPhellipesTest() {
        controleUniversal.desligarLampada(ELampada.Phellipes);

        boolean lampadaLigada = controleUniversal.verificarLampadaLigada(ELampada.Phellipes);
        assertFalse(lampadaLigada);
    }

    @Test
    public void ligarLampadaShoyuMiTest() {
        controleUniversal.ligarLampada(ELampada.ShoyuMi);

        boolean lampadaLigada = controleUniversal.verificarLampadaLigada(ELampada.ShoyuMi);
        assertTrue(lampadaLigada);
    }

    @Test
    public void desligarLampadaShoyuMiTest() {
        controleUniversal.desligarLampada(ELampada.ShoyuMi);

        boolean lampadaLigada = controleUniversal.verificarLampadaLigada(ELampada.ShoyuMi);
        assertFalse(lampadaLigada);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void ligarArCondicionadoVentoBaumnTest() {
        controleUniversal.ligarArCondicionado(EArCondicionado.VentoBaumn);

        boolean arCondicionadoLigado = controleUniversal.verificarArCondicionadoLigado(EArCondicionado.VentoBaumn);
    }

    @Test(expected = UnsupportedOperationException.class)
    public void desligarArCondicionadoVentoBaumnTest() {
        controleUniversal.desligarArCondicionado(EArCondicionado.VentoBaumn);

        boolean arCondicionadoLigado = controleUniversal.verificarArCondicionadoLigado(EArCondicionado.VentoBaumn);
    }

    @Test
    public void ligarArCondicionadoGellaKazaTest() {
        controleUniversal.ligarArCondicionado(EArCondicionado.GellaKaza);

        boolean arCondicionadoLigado = controleUniversal.verificarArCondicionadoLigado(EArCondicionado.GellaKaza);
        assertTrue(arCondicionadoLigado);
    }

    @Test
    public void desligarArCondicionadoGellaKazaTest() {
        controleUniversal.desligarArCondicionado(EArCondicionado.GellaKaza);

        boolean arCondicionadoLigado = controleUniversal.verificarArCondicionadoLigado(EArCondicionado.GellaKaza);
        assertFalse(arCondicionadoLigado);
    }

    @Test
    public void aumentarTemperaturaVentoBaumnTest() {
        controleUniversal.ligarArCondicionado(EArCondicionado.VentoBaumn);
        controleUniversal.aumentarTemperatura(EArCondicionado.VentoBaumn);
        controleUniversal.aumentarTemperatura(EArCondicionado.VentoBaumn);
        
        int temperatura = controleUniversal.getTemperaturaArCondicionado(EArCondicionado.VentoBaumn);
        assertEquals(26, temperatura);
    }

    @Test
    public void diminuirTemperaturaVentoBaumnTest() {
        controleUniversal.ligarArCondicionado(EArCondicionado.VentoBaumn);
        controleUniversal.diminuirTemperatura(EArCondicionado.VentoBaumn);
        controleUniversal.diminuirTemperatura(EArCondicionado.VentoBaumn);
        
        int temperatura = controleUniversal.getTemperaturaArCondicionado(EArCondicionado.VentoBaumn);
        assertEquals(22, temperatura);
    }

    @Test
    public void aumentarTemperaturaGellaKazaTest() {
        controleUniversal.ligarArCondicionado(EArCondicionado.GellaKaza);
        controleUniversal.aumentarTemperatura(EArCondicionado.GellaKaza);
        controleUniversal.aumentarTemperatura(EArCondicionado.GellaKaza);
        
        int temperatura = controleUniversal.getTemperaturaArCondicionado(EArCondicionado.GellaKaza);
        assertEquals(30, temperatura);
    }

    @Test
    public void diminuirTemperaturaGellaKazaTest() {
        controleUniversal.ligarArCondicionado(EArCondicionado.GellaKaza);
        controleUniversal.diminuirTemperatura(EArCondicionado.GellaKaza);
        controleUniversal.diminuirTemperatura(EArCondicionado.GellaKaza);
        
        int temperatura = controleUniversal.getTemperaturaArCondicionado(EArCondicionado.GellaKaza);
        assertEquals(26, temperatura);
    }

    @Test
    public void definirTemperaturaVentoBaumnTest() {
        controleUniversal.ligarArCondicionado(EArCondicionado.VentoBaumn);
        controleUniversal.definirTemperatura(EArCondicionado.VentoBaumn, 25);
        
        int temperatura = controleUniversal.getTemperaturaArCondicionado(EArCondicionado.VentoBaumn);
        assertEquals(25, temperatura);
    }

    @Test
    public void definirTemperaturaGellaKazaTest() {
        controleUniversal.ligarArCondicionado(EArCondicionado.GellaKaza);
        controleUniversal.definirTemperatura(EArCondicionado.GellaKaza, 28);
        
        int temperatura = controleUniversal.getTemperaturaArCondicionado(EArCondicionado.GellaKaza);
        assertEquals(28, temperatura);
    }

    @Test
    public void ativarModoSonoGellaKazaPhellipesNatLightTest() {
        controleUniversal.ativarModoSono(EArCondicionado.GellaKaza, ELampada.Phellipes, EPersiana.NatLight);

        boolean arCondicionadoLigado = controleUniversal.verificarArCondicionadoLigado(EArCondicionado.GellaKaza);
        boolean lampadaLigada = controleUniversal.verificarLampadaLigada(ELampada.Phellipes);
        boolean persianaAberta = controleUniversal.verificarPersianaAberta(EPersiana.NatLight);

        assertFalse(arCondicionadoLigado);
        assertFalse(lampadaLigada);
        assertFalse(persianaAberta);
    }

    @Test
    public void ativarModoSonoVentoBaumnShoyuMiSolariusTest() {
        controleUniversal.ativarModoSono(EArCondicionado.VentoBaumn, ELampada.ShoyuMi, EPersiana.Solarius);

        boolean lampadaLigada = controleUniversal.verificarLampadaLigada(ELampada.ShoyuMi);
        boolean persianaAberta = controleUniversal.verificarPersianaAberta(EPersiana.Solarius);

        assertFalse(lampadaLigada);
        assertFalse(persianaAberta);
    }
}
