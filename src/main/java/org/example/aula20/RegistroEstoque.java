package org.example.aula20;

public class RegistroEstoque implements ObservadorEstoque{

    @Override
    public void atualizarEstoque(int quantidade){
        System.out.println("Nova quantidade: " + quantidade);
    }
}
