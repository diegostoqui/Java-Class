package controle;

import dominio.Elevador;
import java.util.Scanner;

public class SimuladorElevador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o total de andares do edifício: ");
        int totalAndares = scanner.nextInt();

        Elevador elevador = new Elevador(totalAndares);
        int opcao = 0;

        do {
            System.out.println("\nSelecione uma operação:");
            System.out.println("1. Subir");
            System.out.println("2. Descer");
            System.out.println("3. Exibir Andar Atual");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    elevador.subir();
                    break;
                case 2:
                    elevador.descer();
                    break;
                case 3:
                    elevador.exibirAndar();
                    break;
                case 4:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        } while (opcao != 4);
        
        scanner.close();
    }
}
