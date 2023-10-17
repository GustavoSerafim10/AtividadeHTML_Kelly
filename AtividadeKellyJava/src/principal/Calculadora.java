package principal;

import java.util.Scanner;

public class Calculadora {
    // M�todo para adi��o
    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }

    // M�todo para subtra��o
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    // M�todo para multiplica��o
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    // M�todo para divis�o
    public static double divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro! N�o � poss�vel dividir por zero.");
            return Double.NaN; // Retorna um valor de NaN (Not-a-Number)
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro n�mero: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo n�mero: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a opera��o desejada (+, -, *, /): ");
        char operacao = scanner.next().charAt(0);

        double resultado = 0.0;

        switch (operacao) {
            case '+':
                resultado = adicao(numero1, numero2);
                break;
            case '-':
                resultado = subtracao(numero1, numero2);
                break;
            case '*':
                resultado = multiplicacao(numero1, numero2);
                break;
            case '/':
                resultado = divisao(numero1, numero2);
                break;
            default:
                System.out.println("Opera��o inv�lida!");
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
