package principal;
public class Relogio {
    private int hora;
    private int minutos;


    public Relogio() {
        hora = 0;
        minutos = 0;
    }

    // Serão definidos as horas  e minutos
    public void definirHora(int hora, int minutos) {
        if (hora >= 0 && hora <= 23 && minutos >= 0 && minutos <= 59) {
            this.hora = hora;
            this.minutos = minutos;
        } else {
            System.out.println("Hora ou minutos inválidos. A hora deve estar entre 0 e 23, e os minutos entre 0 e 59.");
        }
    }

    // Vai ser exibido a hora toral
    public void exibirHoraAtual() {
        System.out.println("Hora atual: " + String.format("%02d", hora) + ":" + String.format("%02d", minutos));
    }

    public static void main(String[] args) {
        Relogio relogio = new Relogio();

        relogio.definirHora(10, 30);
        relogio.exibirHoraAtual();

        relogio.definirHora(25, 70); // Tentativa de definir uma hora inválida
        relogio.exibirHoraAtual();
    }
}
