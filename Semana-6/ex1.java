import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Exercício 1: Soma dos N primeiros números naturais
        System.out.print("Digite um número N: ");
        int n = scanner.nextInt();
        int soma = 0;
        for (int i = 1; i <= n; i++) {
            soma += i;
        }
        System.out.println("A soma dos " + n + " primeiros números naturais é: " + soma);
        
        scanner.close();
    }
}
