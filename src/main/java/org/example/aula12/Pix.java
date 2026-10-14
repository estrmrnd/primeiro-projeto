package org.example.aula12;

public class Pix implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via Pix de R$%.2f\n", valor);
    }
}
