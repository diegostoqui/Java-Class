import java.util.Scanner;

public class ContagemDeNumerosPares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[8];
        int contadorPares = 0;

        // Solicitar ao usuário 8 números
        System.out.println("Informe 8 números inteiros:");
        for (int i = 0; i < 8; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Contar números pares
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 2 == 0) {
                contadorPares++;
            }
        }

        // Exibir a quantidade de números pares
        System.out.println("Quantidade de números pares: " + contadorPares);

        scanner.close();
    }
}
