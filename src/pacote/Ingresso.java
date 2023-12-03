package pacote;

public class Ingresso {

    private double valor;

    public Ingresso(double valor) {
        this.valor = valor;
    }

    public void imprimirValor() {
        System.out.println("R$" + String.format("%.2f", valor));
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
