package principal;
import java.util.Scanner;

public class VerificaPalindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Vai insirir uma palavra
        System.out.print("Insira uma palavra: ");
        String palavra = input.nextLine();

        // Remove espa�os e converte a palavra para min�sculas
        palavra = palavra.replaceAll(" ", "").toLowerCase();

        // Verifica se a palavra � um pal�ndromo
        boolean ehPalindromo = true;
        int tamanho = palavra.length();
        for (int i = 0; i < tamanho / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(tamanho - i - 1)) {
                ehPalindromo = false;
                break;
            }
        }

        // Apresentado o meus resultados
        if (ehPalindromo) {
            System.out.println("A palavra � um palindromo.");
        } else {
            System.out.println("A palavra n�o � um palindromo.");
        }

        input.close();
    }
}
