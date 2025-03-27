import java.util.Scanner;

public class InversaoDeElementos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];

        // Solicitar ao usuário 6 números
        System.out.println("Informe 6 números inteiros:");
        for (int i = 0; i < 6; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Exibir os números na ordem inversa
        System.out.println("Números na ordem inversa:");
        for (int i = 5; i >= 0; i--) {
            System.out.println(numeros[i]);
        }

        scanner.close();
    }
}
