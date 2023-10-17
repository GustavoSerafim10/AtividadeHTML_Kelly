package principal;
import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que insira um número inteiro positivo
        System.out.print("Insira um número inteiro positivo: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("O número deve ser positivo.");
        } else {
            // Calcula o fatorial
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            // Exibe o resultado
            System.out.println("O fatorial de " + numero + " é: " + fatorial);
        }

        input.close();
    }
}
