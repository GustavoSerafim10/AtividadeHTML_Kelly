package principal;
public class ConversorMoeda {
    // Taxa de c�mbio apenas.
    private static final double TAXA_CAMBIO = 0.85;

    // Coverter d�lares para euros
    public static double converterDolaresParaEuros(double dolares) {
        return dolares * TAXA_CAMBIO;
    }

    public static void main(String[] args) {
        double valorEmDolares = 100.0; 

        double valorEmEuros = converterDolaresParaEuros(valorEmDolares);

        System.out.println(valorEmDolares + " d�lares s�o equivalentes a " + valorEmEuros + " euros.");
    }
}
