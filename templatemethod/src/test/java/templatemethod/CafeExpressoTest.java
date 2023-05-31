package templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CafeExpressoTest {

    @Test
    public void deveRetornarCafeExpressoPequenoInfo() {
        CafeExpresso cafeExpresso = new CafeExpresso();
        cafeExpresso.setCodigo(1);
        cafeExpresso.setNome("Café Expresso");
        cafeExpresso.setTamanho("Pequeno");

        String expectedInfo = "Café Expresso{codigo=1, nome='Café Expresso', valor=6.5, tamanho='Pequeno'}";
        assertEquals(expectedInfo, cafeExpresso.getInfo());
    }

    @Test
    public void deveRetornarCafeExpressoMedioInfo() {
        CafeExpresso cafeExpresso = new CafeExpresso();
        cafeExpresso.setCodigo(1);
        cafeExpresso.setNome("Café Expresso");
        cafeExpresso.setTamanho("Médio");

        String expectedInfo = "Café Expresso{codigo=1, nome='Café Expresso', valor=9.0, tamanho='Médio'}";
        assertEquals(expectedInfo, cafeExpresso.getInfo());
    }

    @Test
    public void deveRetornarCafeExpressoGrandeInfo() {
        CafeExpresso cafeExpresso = new CafeExpresso();
        cafeExpresso.setCodigo(1);
        cafeExpresso.setNome("Café Expresso");
        cafeExpresso.setTamanho("Grande");

        String expectedInfo = "Café Expresso{codigo=1, nome='Café Expresso', valor=11.5, tamanho='Grande'}";
        assertEquals(expectedInfo, cafeExpresso.getInfo());
    }

    @Test
    public void deveRetornarValorCafeExpressoPequeno() {
        CafeExpresso cafe = new CafeExpresso();
        cafe.setCodigo(1);
        cafe.setTamanho("Pequeno");

        assertEquals(6.5f, cafe.calcularValorTotal(), 0.01);
    }

    @Test
    public void deveRetornarValorCafeExpressoMedio() {
        CafeExpresso cafe = new CafeExpresso();
        cafe.setCodigo(1);
        cafe.setTamanho("Médio");

        assertEquals(9.0f, cafe.calcularValorTotal(), 0.01);
    }
    @Test
    public void deveRetornarValorCafeExpressoGrande() {
        CafeExpresso cafe = new CafeExpresso();
        cafe.setCodigo(1);
        cafe.setTamanho("Grande");

        assertEquals(11.5f, cafe.calcularValorTotal(), 0.01);
    }
}
