interface Pagamento {
    void realizarPagamento(double valor);
}

class CartaoCredito implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Cartão de Crédito.");
    }
}

class BoletoBancario implements Pagamento {
    @Override
    public void realizarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " realizado com Boleto Bancário.");
    }
}

public class Exercicio1 {
    public static void main(String[] args) {
        Pagamento cartao = new CartaoCredito();
        Pagamento boleto = new BoletoBancario();

        cartao.realizarPagamento(150.75);
        boleto.realizarPagamento(89.90);
    }
}
