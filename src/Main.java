import pacote.CamaroteInferior;
import pacote.CamaroteSuperior;
import pacote.Normal;

import java.util.Scanner;

public class Main {

    public static boolean confirmarCompra(Scanner scanner) {
        System.out.println("Deseja confirmar a compra (s/n)?");
        String resposta = scanner.nextLine();
        if (resposta.equals("s")) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;
        while(!sair) {
            String input;
            System.out.println("-------------------");
            System.out.println("COMPRA DE INGRESSOS");
            System.out.println("-------------------");
            System.out.println("Ingresso Normal (Digite 1): R$20.00");
            System.out.println("Ingresso Camarote Inferior (Digite 2): R$40.00");
            System.out.println("Ingresso Camarote Superior (Digite 3): R$60.00");
            System.out.println("Digite 0 para sair");
            input = scanner.nextLine();
            switch (input) {
                case("0"):
                    sair = true;
                    break;
                case("1"):
                    Normal ingresso = new Normal(20);
                    System.out.println("Ingresso selecionado: ");
                    ingresso.imprimirTipo();
                    ingresso.imprimirValor();
                    boolean resposta = confirmarCompra(scanner);
                    if (resposta) {
                        System.out.println("Compra finalizada");
                        ingresso.imprimirTipo();
                        ingresso.imprimirValor();
                        sair = true;
                    } else {
                        System.out.println("Compra negada");
                    }
                    break;
                case("2"):
                    CamaroteInferior ingresso1 = new CamaroteInferior(20, "2-B");
                    System.out.println("Ingresso selecionado: ");
                    ingresso1.imprimirTipo();
                    ingresso1.imprimirValor();
                    boolean resposta1 = confirmarCompra(scanner);
                    if (resposta1) {
                        System.out.println("Compra finalizada");
                        ingresso1.imprimirTipo();
                        ingresso1.imprimirValor();
                        sair = true;
                    } else {
                        System.out.println("Compra negada");
                    }
                    break;
                case("3"):
                    CamaroteSuperior ingresso2 = new CamaroteSuperior(20);
                    System.out.println("Ingresso selecionado: ");
                    ingresso2.imprimirTipo();
                    ingresso2.imprimirValor();
                    boolean resposta2 = confirmarCompra(scanner);
                    if (resposta2) {
                        System.out.println("Compra finalizada");
                        ingresso2.imprimirTipo();
                        ingresso2.imprimirValor();
                        sair = true;
                    } else {
                        System.out.println("Compra negada");
                    }
                    break;
                default:
                    System.out.println("Input não reconhecido, tentar novamente");
            }
        }
        System.out.println("Obrigado por aparecer, volte sempre!");
    }
}
