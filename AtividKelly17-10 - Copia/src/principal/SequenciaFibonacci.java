package principal;
import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Serve pra inserir o número de termos desejados
        System.out.print("Insira o número de termos da sequência de Fibonacci a serem exibidos: ");
        int n = input.nextInt();

        // Verifica se o número de termos é pelo menos 1
        if (n < 1) {
            System.out.println("Por favor, insira um número válido de termos.");
        } else {
            int primeiroTermo = 0;
            int segundoTermo = 1;

            System.out.print("Os primeiros " + n + " termos da sequência de Fibonacci são: ");

            for (int i = 0; i < n; i++) {
                System.out.print(primeiroTermo + " ");
                int proximoTermo = primeiroTermo + segundoTermo;
                primeiroTermo = segundoTermo;
                segundoTermo = proximoTermo;
            }

            System.out.println();
        }

        input.close();
    }
}
