package principal;
import java.util.Scanner;

public class JurosSimples {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Serve para  insirir o valor principal
        System.out.print("Insira o valor principal: R$ ");
        double valorPrincipal = input.nextDouble();

        // Insere  a taxa de juros
        System.out.print("Insira a taxa de juros (em decimal): ");
        double taxaJuros = input.nextDouble();

        // Insere o tempo em anos
        System.out.print("Insira o tempo (em anos): ");
        int tempoAnos = input.nextInt();

        // Calcula os juros simples
        double juros = valorPrincipal * taxaJuros * tempoAnos;

        // Vai exibir o valor do juros tlg
        System.out.println("O valor dos juros simples é: R$ " + juros);

        input.close();
    }
}
