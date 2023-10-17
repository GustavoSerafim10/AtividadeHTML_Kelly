package principal;
public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        //Aqui vai calcular a temp em C
        double celsius = 25.0;

        // Aqui vai calcular a Temp em Graus F 
        double fahrenheit = (celsius * 9/5) + 32;

        // Imprima o resultado na tela
        System.out.println("Temperatura em graus Celsius: " + celsius + "°C");
        System.out.println("Temperatura em graus Fahrenheit: " + fahrenheit + "°F");
    }
}
