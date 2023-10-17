package principal;
import java.util.Scanner;

public class VerificaAnoBissexto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicita ao usu�rio que insira o ano
        System.out.print("Insira um ano: ");
        int ano = input.nextInt();

        // Verifica se o ano � bissexto
        boolean isBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);

        // Exibe o resultado
        if (isBissexto) {
            System.out.println(ano + " � um ano bissexto.");
        } else {
            System.out.println(ano + " n�o � um ano bissexto.");
        }

        input.close();
    }
}
