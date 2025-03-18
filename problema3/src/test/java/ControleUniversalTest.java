
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

import com.analisealgoritmos.ControleUniversal;
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
    }
}
