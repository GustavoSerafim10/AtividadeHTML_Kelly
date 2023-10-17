package principal;

import java.util.Scanner;

public class Calculadora {
    // Método para adição
    public static double adicao(double num1, double num2) {
        return num1 + num2;
    }

    // Método para subtração
    public static double subtracao(double num1, double num2) {
        return num1 - num2;
    }

    // Método para multiplicação
    public static double multiplicacao(double num1, double num2) {
        return num1 * num2;
    }

    // Método para divisão
    public static double divisao(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Erro! Não é possível dividir por zero.");
            return Double.NaN; // Retorna um valor de NaN (Not-a-Number)
        }
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        double numero1 = scanner.nextDouble();

        System.out.print("Digite o segundo número: ");
        double numero2 = scanner.nextDouble();

        System.out.print("Digite a operação desejada (+, -, *, /): ");
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
                System.out.println("Operação inválida!");
        }

        System.out.println("Resultado: " + resultado);

        scanner.close();
    }
}
