import java.util.Scanner;

public class MediaDeNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4];
        double soma = 0;

        // Solicitar ao usuário as 4 notas
        System.out.println("Informe 4 notas:");
        for (int i = 0; i < 4; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
        }

        // Somar todas as notas
        for (int i = 0; i < notas.length; i++) {
            soma += notas[i];
        }

        // Calcular a média
        double media = soma / notas.length;

        // Exibir a média e o resultado
        System.out.println("Média: " + media);
        if (media >= 7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }

        scanner.close();
    }
}
