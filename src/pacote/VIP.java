package pacote;

public class VIP extends Ingresso {

    double adicional = 20.00;

    public VIP(double valor) {
        super(valor);
    }

    public double getValorVip() {
        return super.getValor() + adicional;
    }

    @Override
    public void imprimirValor() {
        System.out.println("R$" + String.format("%.2f", super.getValor() + adicional));
    }

    public void imprimirTipo() {
        System.out.println("Ingresso VIP");
    }
}
