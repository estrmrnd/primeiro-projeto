package org.example.aula11;
// 5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar(). Crie Carro e Moto implementando os dois. Coloque numa lista e percorra com for-each chamando os dois métodos em cada um.

public class Carro implements  Veiculo {
    @Override
    public void ligar() {
        System.out.println("Ligando o carro");
    }

    public void acelerar() {
        System.out.println("Acelerando o carro");
    }
}
