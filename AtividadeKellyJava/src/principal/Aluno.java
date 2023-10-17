package principal;
import java.util.Arrays;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;

    public Aluno(String nome, String matricula, double[] notas) {
        this.nome = nome;
        this.matricula = matricula;
        this.notas = notas;
    }

    public double calcularMedia() {
        if (notas.length == 0) {
            return 0.0;
        }

        double soma = 0.0;
        for (double nota : notas) {
            soma += nota;
        }

        return soma / notas.length;
    }

    public boolean estaAprovado(double mediaMinima) {
        double media = calcularMedia();
        return media >= mediaMinima;
    }

    public static void main(String[] args) {
        String nome = "João";
        String matricula = "2023001";
        double[] notas = {8.5, 7.0, 9.2, 6.8}; // Substitua com as notas do aluno

        Aluno aluno = new Aluno(nome, matricula, notas);

        double mediaMinima = 7.0; // Define basicamente a média

        double media = aluno.calcularMedia();
        boolean aprovado = aluno.estaAprovado(mediaMinima);

        System.out.println("Nome: " + aluno.nome);
        System.out.println("Matrícula: " + aluno.matricula);
        System.out.println("Notas: " + Arrays.toString(aluno.notas));
        System.out.println("Média: " + media);
        
        if (aprovado) {
            System.out.println("O aluno está aprovado!");
        } else {
            System.out.println("O aluno não está aprovado.");
        }
    }
}
