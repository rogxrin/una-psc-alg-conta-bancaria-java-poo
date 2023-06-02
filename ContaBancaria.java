package exercicioContabancaria;

import java.util.Scanner;

public class ContaBancaria {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        System.out.println("Digite seu nome:");
        conta.setNome(scanner.nextLine());

        System.out.println("Digite o número da sua conta:");
        conta.setNumeroConta(scanner.nextInt());

        scanner.nextLine();

        System.out.println("Digite seu saldo inicial:");
        conta.setSaldoInicial(scanner.nextDouble());

        scanner.nextLine();

        System.out.println("Conta bancária criada com sucesso");
        System.out.println("O que deseja fazer? Depositar(1), Sacar(2),Obter o saldo disponível(3)");
        String acao = scanner.nextLine();

        switch (acao) {
            case "1":
                System.out.println("Digite o valor para depositar:");
                double ValorDeposito = scanner.nextDouble();
                conta.depositar(ValorDeposito);
                System.out.println("Deposito realizado com sucesso.Seu novo Saldo é: " + conta.getSaldo());
                break;
            case "2":
                System.out.println("Digite o valor para sacar: ");
                double ValorSaque = scanner.nextDouble();
                conta.sacar(ValorSaque);
                break;
            case "3":
                double saldoDisponivel = conta.getSaldo();
                System.out.println("O seu saldo disponível é:" + saldoDisponivel);
                break;

        }
        scanner.close();
    }
}