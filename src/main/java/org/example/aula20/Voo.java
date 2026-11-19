package org.example.aula20;

import java.util.ArrayList;
import java.util.List;

public class Voo {

    private List<ObservadorVoo> observadores = new ArrayList<>();

    public void adicionarObservador(ObservadorVoo o){
        observadores.add(o);
    }
        public void mudarStatus(String status){
            for(ObservadorVoo observador : observadores){
                observador.atualizar(status);
            }
        }
}
