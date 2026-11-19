package org.example.aula20;

public class PainelAeroporto implements ObservadorVoo{

    @Override
    public void atualizar(String status){
        System.out.println("Painel: " + status);
    }
}
