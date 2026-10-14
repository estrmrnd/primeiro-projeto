package org.example.aula12;

public class Boleto implements MeioDePagamento {
    @Override
    public void pagar(double valor) {
        System.out.printf("Pagamento via Boleto de R$%.2f\n", valor);
    }
}
