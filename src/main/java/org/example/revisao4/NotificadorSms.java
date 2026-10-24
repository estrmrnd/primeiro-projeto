package org.example.revisao4;

public class NotificadorSms implements Notificador{
    @Override
    public void notificar(String mensagem){
        System.out.println("Enviando SMS: " + mensagem);
    }
}
