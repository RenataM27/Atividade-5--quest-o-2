package pacote;

public class CamaroteInferior extends VIP {

    String localizacao;
    public CamaroteInferior(double valor, String localizacao) {
        super(valor);
        this.localizacao = localizacao;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public void imprimirLocalizacao() {
        System.out.println(localizacao);
    }

    @Override
    public void imprimirTipo() {
        System.out.println("Camarote Inferior");;
    }
}
