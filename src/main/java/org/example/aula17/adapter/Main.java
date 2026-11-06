package org.example.aula17.adapter;

public class Main {
    static void main(String[] args) {
        //Pagamento pagamento = new PayPalAPI  dessa forma não funciona
    Pagamento pagamento = new PayPalAdapter();
    pagamento.pagar();
    }
}
