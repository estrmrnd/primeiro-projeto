package org.example.aula11;

public class SMS implements Notificacao {

    @Override
    public void enviar(String mensagem) {
        System.out.println("SMS enviado: " + mensagem);
    }
}
