public class Animal {
    protected String nome;
    protected int idade;

    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public void emitirSom() {
        System.out.println("Som genérico de animal");
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}

class Cachorro extends Animal {
    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Latindo...");
    }
}

class Gato extends Animal {
    public Gato(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("Miando...");
    }
}

public class Exercicio3Animais {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex", 3);
        Gato gato = new Gato("Mimi", 2);

        System.out.println("Cachorro:");
        cachorro.emitirSom();
        cachorro.exibirInfo();

        System.out.println("\nGato:");
        gato.emitirSom();
        gato.exibirInfo();
    }
} {
    
}
