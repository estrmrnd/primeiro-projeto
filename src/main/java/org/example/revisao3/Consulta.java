package org.example.revisao3;

public class Consulta implements Servico{
    @Override
    public void executar (String nomePet) {
        System.out.println("Levando " + nomePet + " para consulta...");
    }
}
