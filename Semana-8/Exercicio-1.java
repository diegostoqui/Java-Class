import java.util.Scanner;

public class MaiorEMenorValor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[5];

        // Solicitar ao usuário 5 números
        System.out.println("Informe 5 números inteiros:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Inicializar maior e menor valor com o primeiro número do array
        int maior = numeros[0];
        int menor = numeros[0];

        // Percorrer o array para encontrar o maior e menor valor
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Exibir maior e menor valor
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        scanner.close();
    }
}
