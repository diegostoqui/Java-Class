package dominio;

public class Elevador {
    private int andarAtual;
    private int totalAndares;

    public Elevador(int totalAndares) {
        this.andarAtual = 0;  // Inicialmente no térreo
        this.totalAndares = totalAndares;
    }

    public void subir() {
        if (andarAtual < totalAndares - 1) {
            andarAtual++;
        } else {
            System.out.println("Já está no último andar.");
        }
    }

    public void descer() {
        if (andarAtual > 0) {
            andarAtual--;
        } else {
            System.out.println("Já está no térreo.");
        }
    }

    public void exibirAndar() {
        System.out.println("Andar atual: " + andarAtual);
    }

    public int getAndarAtual() {
        return andarAtual;
    }
}
