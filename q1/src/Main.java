import java.util.Scanner;

public class SistemaBancario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Escolha o tipo de conta:");
        System.out.println("1. Conta Corrente");
        System.out.println("2. Conta Poupança");
        int escolha = scanner.nextInt();
        scanner.nextLine(); // consumir a nova linha
        System.out.print("Digite o nome do titular: ");
        String titular = scanner.nextLine();

        Conta conta;
        if (escolha == 1) {
            conta = new ContaCorrente(titular);
        } else {
            conta = new ContaPoupanca(titular);
        }

        int opcao;
        do {
            System.out.println("\nMenu de Opções:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            if (conta instanceof ContaPoupanca) {
                System.out.println("3. Calcular Rendimento");
            } else {
                System.out.println("3. Usar Cheque Especial");
            }
            System.out.println("4. Exibir Dados da Conta");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o valor para depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.print("Digite o valor para saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    if (conta instanceof ContaPoupanca) {
                        System.out.print("Digite a taxa Selic: ");
                        double selic = scanner.nextDouble();
                        double rendimento = ((ContaPoupanca) conta).calcularRendimento(selic);
                        System.out.println("Rendimento: " + rendimento);
                    } else {
                        System.out.print("Digite o valor para usar o cheque especial: ");
                        double valorCheque = scanner.nextDouble();
                        ((ContaCorrente) conta).usarChequeEspecial(valorCheque);
                    }
                    break;
                case 4:
                    conta.exibirDados();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 0);
