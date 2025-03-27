package controle;

import dominio.Aluno;
import java.util.Scanner;

public class GerenciadorAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do aluno: ");
        String nome = scanner.nextLine();

        double nota;
        do {
            System.out.println("Informe a nota do aluno (0 a 10): ");
            nota = scanner.nextDouble();
        } while (nota < 0 || nota > 10);

        Aluno aluno = new Aluno(nome, nota);

        System.out.println("Situação do aluno: " + aluno.classificarAluno());
        scanner.close();
    }
}
