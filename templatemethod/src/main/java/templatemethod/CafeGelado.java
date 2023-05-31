package templatemethod;

public class CafeGelado extends Cafe {

    @Override
    public float calcularValorTotal() {
        return this.calcularValor() + 3.0f;
    }

    @Override
    public String getTipo() {
        return "Café Gelado";
    }
}
