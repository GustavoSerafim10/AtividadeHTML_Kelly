package principal;
public class CalculoMedia {
    public static void main(String[] args) {
        // As notas de cada mat�ria 
        double notaMatematica = 8.5;
        double notaCiencias = 7.8;
        double notaPortugues = 9.0;
        
        // C�lculo da m�dia
        double media = (notaMatematica + notaCiencias + notaPortugues) / 3.0;

       // vou imprimir
        System.out.println("A m�dia das notas �: " + media);
    }
}
