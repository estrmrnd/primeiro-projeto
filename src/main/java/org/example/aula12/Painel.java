package org.example.aula12;
//2. (mesma classe — muda o TIPO do parâmetro)
//
//   Crie a classe Painel com QUATRO métodos chamados exibir, cada um recebendo um tipo diferente: String, int, boolean e double. Cada um imprime de um jeito, dizendo que tipo recebeu. Chame os quatro. Depois pense: por que o System.out.println() aceita texto, número, boolean e objeto, ao invés de ter um método println para cada? É exatamente isso que vocês acabaram de fazer.

public class Painel {
    public String exibir(String texto){
        return "";
    }

    public int exibir(int numero){
        return 0;
    }

    public boolean exibir(boolean estado){
        return false;
    }

    public double exibir(double decimal){
        return 0;
    }
}
