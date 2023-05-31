package templatemethod;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CafeGeladoTest {
    @Test
    public void deveRetornarCafeGeladoInfo() {
        CafeGelado cafeGelado = new CafeGelado();
        cafeGelado.setCodigo(2);
        cafeGelado.setTamanho("Pequeno");
        cafeGelado.setNome("Café Gelado");

        assertEquals("Café Gelado{codigo=2, nome='Café Gelado', valor=8.0, tamanho='Pequeno'}", cafeGelado.getInfo());
    }

    @Test
    public void deveRetornarValorCafeGeladoPequeno() {
        CafeGelado cafeGelado = new CafeGelado();
        cafeGelado.setCodigo(2);
        cafeGelado.setTamanho("Pequeno");
        cafeGelado.setNome("Café Gelado");

        assertEquals(8.0f, cafeGelado.calcularValorTotal(), 0.01);
    }
    @Test
    public void deveRetornarValorCafeGeladoMedio() {
        CafeGelado cafeGelado = new CafeGelado();
        cafeGelado.setCodigo(2);
        cafeGelado.setTamanho("Médio");
        cafeGelado.setNome("Café Gelado");

        assertEquals(10.5f, cafeGelado.calcularValorTotal(), 0.01);
    }

    @Test
    public void deveRetornarValorCafeGeladoGrande() {
        CafeGelado cafeGelado = new CafeGelado();
        cafeGelado.setCodigo(2);
        cafeGelado.setTamanho("Grande");
        cafeGelado.setNome("Café Gelado");

        assertEquals(13.0f, cafeGelado.calcularValorTotal(), 0.01);
    }

}