package templatemethod;

public class CafeExpresso extends Cafe {

    @Override
    public float calcularValorTotal() {
        return this.calcularValor() + 1.5f;
    }

    @Override
    public String getTipo() {
        return "Café Expresso";
    }
}