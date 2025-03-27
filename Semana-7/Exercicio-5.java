package dominio;

public class CaixaEletronico {
    private double saldo;

    
    public CaixaEletronico(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    
    public boolean sacar(double valor) {
        if (valor % 10 == 0 && saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    
    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }

    
    public double getSaldo() {
        return saldo;
    }
}
