package pacote;

public class CamaroteSuperior extends VIP {

    double adicional = 20.00;
    public CamaroteSuperior(double valor) {
        super(valor);
    }

    @Override
    public void imprimirValor() {
        System.out.println("R$" + String.format("%.2f", super.getValorVip() + adicional));
    }

    public double getValorCamarioteSuperior() {
        return super.getValorVip() + adicional;
    }

    @Override
    public void imprimirTipo() {
        System.out.println("Camarote Superior");
    }
}
