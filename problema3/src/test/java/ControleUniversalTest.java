
import static org.junit.Assert.assertFalse;
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
