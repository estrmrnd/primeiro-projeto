package org.example.aula17.facade;

public class ManhaFacade {
    private Despertador despertador = new Despertador();
    private Cafeteira cafeteria = new Cafeteira();
    private Chuveiro chuveiro = new Chuveiro();

    public void acordar(){
        despertador.desligar();
        cafeteria.fazerCafe();
        chuveiro.ligar();
    }
}
