package principal;
public class ConversorTemperatura {
    // Celsius para Fahrenheit
    public static double celsiusParaFahrenheit(double celsius) {
        double fahrenheit = (celsius * 9/5) + 32;
        return fahrenheit;
    }

    // Fahrenheit para Celsius
    public static double fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        return celsius;
    }

    public static void main(String[] args) {
        double celsius = 25.0;
        double fahrenheit = celsiusParaFahrenheit(celsius);

        System.out.println(celsius + " graus Celsius equivalem a " + fahrenheit + " graus Fahrenheit.");

        double fahrenheit2 = 77.0;
        double celsius2 = fahrenheitParaCelsius(fahrenheit2);

        System.out.println(fahrenheit2 + " graus Fahrenheit equivalem a " + celsius2 + " graus Celsius.");
    }
}
