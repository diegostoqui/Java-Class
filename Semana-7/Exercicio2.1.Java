package controle;

import dominio.Funcionario;
import java.util.Scanner;

public class GerenciadorFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Informe o salário base: ");
        double salarioBase = scanner.nextDouble();

        System.out.println("Informe a categoria (A, B ou C): ");
        String categoria = scanner.next();

        Funcionario funcionario = new Funcionario(nome, salarioBase, categoria);
        double salarioFinal = funcionario.calcularSalarioFinal();

        System.out.println("Salário final de " + funcionario.getNome() + ": R$ " + salarioFinal);
        scanner.close();
    }
}
