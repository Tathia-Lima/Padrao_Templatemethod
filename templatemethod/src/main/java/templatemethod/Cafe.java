package templatemethod;

public abstract class Cafe {
    private int codigo;
    private String nome;
    private float valor = 5.00f;
    private String tamanho;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public float calcularValor() {
        float valorAdicional = 0.0f;

        if (tamanho==("Pequeno")) {
            valorAdicional = 1.0f;
        } else if (tamanho==("Médio")) {
            valorAdicional = 1.5f;
        } else if (tamanho==("Grande")) {
            valorAdicional = 2.0f;
        }

        return valor * valorAdicional;
    }
    public abstract float calcularValorTotal();

    public String getTipo() {
        return "Café";
    }
    public String getInfo() {
        return getTipo() + "{" +
                "codigo=" + codigo +
                ", nome='" + this.nome + '\'' +
                ", valor=" + this.calcularValorTotal() +
                ", tamanho='" + this.tamanho + '\'' +
                '}';
    }
}