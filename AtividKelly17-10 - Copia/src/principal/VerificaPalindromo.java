package principal;
import java.util.Scanner;

public class VerificaPalindromo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Vai insirir uma palavra
        System.out.print("Insira uma palavra: ");
        String palavra = input.nextLine();

        // Remove espaços e converte a palavra para minúsculas
        palavra = palavra.replaceAll(" ", "").toLowerCase();

        // Verifica se a palavra é um palíndromo
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
            System.out.println("A palavra é um palindromo.");
        } else {
            System.out.println("A palavra não é um palindromo.");
        }

        input.close();
    }
}
