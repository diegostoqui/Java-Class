package controle;

import dominio.ContaBancaria;
import java.util.Scanner;

public class GerenciadorConta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe o titular da conta: ");
        String titular = scanner.nextLine();
        
        ContaBancaria conta = new ContaBancaria(titular);
        int opcao = 0;

        while (opcao != 4) {
            System.out.println("\nSelecione uma operação:");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Exibir Saldo");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor a depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor a sacar: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
