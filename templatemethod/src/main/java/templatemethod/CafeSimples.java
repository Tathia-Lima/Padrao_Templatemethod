package templatemethod;

public class CafeSimples extends Cafe {

    @Override
    public float calcularValorTotal() {
        return this.calcularValor();
    }

    @Override
    public String getTipo() {
        return "Café Simples";
    }
}
