package principal;

import java.util.Scanner;

public class CalculadoraV {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Insira o raio da esfera
        System.out.print("Insira o raio da esfera: ");
        double raio = input.nextDouble();

        // Calcula o volume da esfera usando a fórmula V = (4/3) * π * raio^3
        double volume = (4.0 / 3.0) * Math.PI * Math.pow(raio, 3);

        // Exibe o volume da esfera
        System.out.println("O volume da esfera é: " + volume);

        input.close();
    }
}
