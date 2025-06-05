class Funcionario {
    protected String nome;
    protected double salarioBase;

    public Funcionario(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void exibirSalario() {
        System.out.println(nome + " - Salário: R$" + calcularSalario());
    }
}

class Gerente extends Funcionario {
    public Gerente(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.20;
    }
}

class Estagiario extends Funcionario {
    public Estagiario(String nome, double salarioBase) {
        super(nome, salarioBase);
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.05;
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        Funcionario f = new Funcionario("João", 2000.00);
        Gerente g = new Gerente("Maria", 5000.00);
        Estagiario e = new Estagiario("Pedro", 1500.00);

        f.exibirSalario();
        g.exibirSalario();
        e.exibirSalario();
    }
}
