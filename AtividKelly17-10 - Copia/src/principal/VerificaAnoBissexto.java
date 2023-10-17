package principal;
import java.util.Scanner;

public class VerificaAnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita ao usuário que insira o ano
        System.out.print("Insira um ano: ");
        int ano = input.nextInt();

        // Verifica se o ano é bissexto
        boolean isBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        // Exibe o resultado
        if (isBissexto) {
            System.out.println(ano + " é um ano bissexto.");
        } else {
            System.out.println(ano + " não é um ano bissexto.");
        }

        input.close();
    }
}
