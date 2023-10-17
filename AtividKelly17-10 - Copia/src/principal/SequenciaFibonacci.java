package principal;
import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Serve pra inserir o n�mero de termos desejados
        System.out.print("Insira o n�mero de termos da sequ�ncia de Fibonacci a serem exibidos: ");
        int n = input.nextInt();

        // Verifica se o n�mero de termos � pelo menos 1
        if (n < 1) {
            System.out.println("Por favor, insira um n�mero v�lido de termos.");
        } else {
            int primeiroTermo = 0;
            int segundoTermo = 1;

            System.out.print("Os primeiros " + n + " termos da sequ�ncia de Fibonacci s�o: ");

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
