package exercicioContabancaria;

public class Conta {
    private String nome;
    private int numeroConta;
    private double saldoInicial;

    public String setNome(String novoNome) {
        return nome = novoNome;
    }

    public int setNumeroConta(int novoNumeroConta) {
        return numeroConta = novoNumeroConta;
    }

    public double setSaldoInicial(double novoSaldoInicial) {
        return saldoInicial = novoSaldoInicial;
    }

    public double getSaldo() {
        return saldoInicial;
    }

    public void depositar(double valor) {
        saldoInicial += valor;
    }

    public void sacar(double valor) {
        if (valor > 5000.0) {
            System.out.println("Valor do saque acima do permitido.");
        } else if (valor <= saldoInicial) {
            saldoInicial -= valor;
            System.out.println("Saque realizado com sucesso.Seu novo Saldo é: " + saldoInicial);
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }
}