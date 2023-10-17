package principal;
import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita ao usu�rio que insira um n�mero inteiro positivo
        System.out.print("Insira um n�mero inteiro positivo: ");
        int numero = input.nextInt();

        if (numero < 0) {
            System.out.println("O n�mero deve ser positivo.");
        } else {
            // Calcula o fatorial
            long fatorial = 1;
            for (int i = 1; i <= numero; i++) {
                fatorial *= i;
            }

            // Exibe o resultado
            System.out.println("O fatorial de " + numero + " �: " + fatorial);
        }

        input.close();
    }
}
