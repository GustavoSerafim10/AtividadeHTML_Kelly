package principal;
import java.util.Scanner;

public class CalculadoraIMC {
    
    public static double calcularIMC(double peso, double altura) {
        if (peso <= 0 || altura <= 0) {
            System.out.println("Peso e altura devem ser números positivos.");
            return -1.0; // Valor inválido
        }

        double imc = peso / (altura * altura);
        return imc;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu peso (em kg): ");
        double peso = scanner.nextDouble();

        System.out.print("Digite sua altura (em metros): ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        if (imc != -1.0) {
            System.out.println("Seu IMC é: " + imc);

            if (imc < 18.5) {
                System.out.println("Abaixo do peso.");
            } else if (imc < 24.9) {
                System.out.println("Peso normal.");
            } else if (imc < 29.9) {
                System.out.println("Sobrepeso.");
            } else if (imc < 34.9) {
                System.out.println("Obesidade Grau I.");
            } else if (imc < 39.9) {
                System.out.println("Obesidade Grau II.");
            } else {
                System.out.println("Obesidade Grau III (Obesidade Mórbida).");
            }
        }

        scanner.close();
    }
}
