package controle;

import dominio.CaixaEletronico;
import java.util.Scanner;

public class SimuladorCaixa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o saldo inicial do caixa eletrônico: ");
        double saldoInicial = scanner.nextDouble();

        CaixaEletronico caixa = new CaixaEletronico(saldoInicial);
        int opcao = 0;

        while (opcao != 3) {
            System.out.println("\nSelecione uma operação:");
            System.out.println("1. Sacar");
            System.out.println("2. Exibir Saldo");
            System.out.println("3. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o valor para sacar (múltiplo de 10): ");
                    double valorSaque = scanner.nextDouble();
                    if (!caixa.sacar(valorSaque)) {
                        System.out.println("Operação inválida. O valor deve ser múltiplo de 10 ou saldo insuficiente.");
                    }
                    break;
                case 2:
                    caixa.exibirSaldo();
                    break;
                case 3:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }
        scanner.close();
    }
}
