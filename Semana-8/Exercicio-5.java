import java.util.Scanner;

public class BuscaDeElemento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];

        // Solicitar ao usuário 10 números
        System.out.println("Informe 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Solicitar o número a ser buscado
        System.out.print("Digite um número para buscar no array: ");
        int numeroBuscado = scanner.nextInt();
        boolean encontrado = false;

        // Buscar o número no array
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] == numeroBuscado) {
                System.out.println("Número encontrado na posição: " + i);
                encontrado = true;
                break;
            }
        }

        // Se o número não for encontrado
        if (!encontrado) {
            System.out.println("Número não encontrado.");
        }

        scanner.close();
    }
}
