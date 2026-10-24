package org.example.revisao4;

public class NotificadorEmail implements Notificador{
    @Override
    public void notificar(String mensagem){
        System.out.println("Enviando email: " + mensagem);
    }
}
