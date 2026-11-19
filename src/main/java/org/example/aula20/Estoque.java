package org.example.aula20;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<ObservadorEstoque> observadores = new ArrayList<>();
    private int quantidade;

    public void adicionarObservador(ObservadorEstoque o){
        observadores.add(o);
    }

    public void setQuantidade(int quantidade){
        this.quantidade = quantidade;

        for(ObservadorEstoque observador : observadores){
            observador.atualizarEstoque(quantidade);
        }
    }
}
