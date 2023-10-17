package principal;
public class ContaBancaria {
    private String numeroConta;
    private double saldo;

    
    public ContaBancaria(String numeroConta, double saldoInicial) {
        this.numeroConta = numeroConta;
        this.saldo = saldoInicial;
    }

    // Vai exibir o meu saldo
    public void exibirSaldo() {
        System.out.println("Saldo da conta " + numeroConta + ": R$" + saldo);
    }

    // Aqui será a forma para realizar um depósito
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado com sucesso.");
            exibirSaldo();
        } else {
            System.out.println("Valor de depósito inválido. O valor deve ser maior que zero.");
        }
    }

    // Aqui será a forma para realizar um saque suaves..
    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado com sucesso.");
            exibirSaldo();
        } else if (valor <= 0) {
            System.out.println("Valor de saque inválido. O valor deve ser maior que zero.");
        } else {
            System.out.println("Saldo insuficiente para o saque de R$" + valor);
        }
    }

    public static void main(String[] args) {
        // Criando uma conta
        ContaBancaria minhaConta = new ContaBancaria("12345", 1000.0);

        // Abaixo e o saldo inicial
        minhaConta.exibirSaldo();

        // Aqui realizo os meus deposítos e saques.
        minhaConta.depositar(500.0);
        minhaConta.sacar(200.0);
        minhaConta.sacar(1500.0);

        
        minhaConta.exibirSaldo();
    }
}
