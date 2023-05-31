package templatemethod;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CafeSimplesTest {

    @Test
    public void deveRetornarCafeSimplesInfo() {
        CafeSimples cafeSimples = new CafeSimples();
        cafeSimples.setCodigo(1);
        cafeSimples.setTamanho("Médio");
        cafeSimples.setNome("Café Simples");
        assertEquals("Café Simples{codigo=1, nome='Café Simples', valor=7.5, tamanho='Médio'}", cafeSimples.getInfo());
    }

    @Test
    public void deveRetornarValorCafeSimplesPequeno() {
        CafeSimples cafeSimples = new CafeSimples();
        cafeSimples.setCodigo(1);
        cafeSimples.setTamanho("Pequeno");

        assertEquals(5.0f, cafeSimples.calcularValorTotal(), 0.01);
    }
    @Test
    public void deveRetornarValorCafeSimplesMedio() {
        CafeSimples cafeSimples = new CafeSimples();
        cafeSimples.setCodigo(1);
        cafeSimples.setTamanho("Médio");

        assertEquals(7.5f, cafeSimples.calcularValorTotal(), 0.01);
    }
    @Test
    public void deveRetornarValorCafeSimplesGrande() {
        CafeSimples cafeSimples = new CafeSimples();
        cafeSimples.setCodigo(1);
        cafeSimples.setTamanho("Grande");

        assertEquals(10.0f, cafeSimples.calcularValorTotal(), 0.01);
    }

}