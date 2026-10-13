package org.example.aula11;
/*
4. Crie uma interface Notificacao com o método enviar(String mensagem).
   Crie duas classes que implementam ela: Email e SMS. Cada uma
   imprime de um jeito. Adicione as duas num ArrayList<Notificacao>
   e percorra com for-each, enviando a mesma mensagem.

   Saída esperada:
   E-mail enviado: Sua compra foi aprovada!
   SMS enviado: Sua compra foi aprovada!
 */


public interface Notificacao {
    void enviar(String mensagem);
}