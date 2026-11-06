package org.example.aula17.adapter;

public class PayPalAdapter implements Pagamento{
   private PayPalAPI payPalAPI = new PayPalAPI();

    @Override
    public void pagar(){
        payPalAPI.sendPayment();
    }
}
