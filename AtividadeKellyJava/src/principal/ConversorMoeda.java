package principal;
public class ConversorMoeda {
    // Taxa de câmbio apenas.
    private static final double TAXA_CAMBIO = 0.85;

    // Coverter dólares para euros
    public static double converterDolaresParaEuros(double dolares) {
        return dolares * TAXA_CAMBIO;
    }

    public static void main(String[] args) {
        double valorEmDolares = 100.0; 

        double valorEmEuros = converterDolaresParaEuros(valorEmDolares);

        System.out.println(valorEmDolares + " dólares são equivalentes a " + valorEmEuros + " euros.");
    }
}
