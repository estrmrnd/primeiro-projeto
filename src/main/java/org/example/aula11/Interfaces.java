package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

public class Interfaces {
    //1. Crie uma interface Animal com o método emitirSom(). Crie a classe Cachorro que implementa ela e imprime "Au au!". Na Main, crie um cachorro e chame o método. Não esqueça do @Override.

    //2. Agora acrescente a classe Gato, que implementa a mesma interface e
    //   imprime "Miau!". Na main, declare as duas variáveis como Animal:
    //
    //   Animal bidu = new Cachorro();
    //   Animal salem= new Gato();
    //
    //   Chame emitirSom() nas duas.

    //3. Crie um ArrayList<Animal>, coloque um cachorro e um gato dentro, e percorra com for-each chamando emitirSom(). Repare que não tem nenhum if. Dica:
    // animais.add(new Cachorro());

    //4. Crie uma interface Notificacao com o método enviar(String mensagem). Crie duas classes que implementam ela: Email e SMS. Cada uma imprime de um jeito. Adicione as duas num ArrayList<Notificacao> e percorra com for-each, enviando a mesma mensagem.
    //   Saída esperada: E-mail enviado: Sua compra foi aprovada! SMS enviado: Sua compra foi aprovada!

    //5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar(). Crie Carro e Moto implementando os dois. Coloque numa lista e percorra com for-each chamando os dois métodos em cada um.

    static void main() {
        //1)
        Animal cachorro = new Cachorro();
        cachorro.emitirSom();

        //2)
        Animal bidu = new Cachorro();
        Animal salem = new Gato();

        bidu.emitirSom();
        salem.emitirSom();

        //3)
        ArrayList<Animal> animais = new ArrayList<>();
        animais.add(new Cachorro());
        animais.add(new Gato());
        for(Animal animal : animais){
            animal.emitirSom();
        }

        // 4)
        ArrayList<Notificacao> notificacoes = new ArrayList<>(
                List.of(new Email(), new SMS())
        );

        for (Notificacao notificacao : notificacoes) {
            notificacao.enviar("Sua compra foi aprovada!");
        }

        // 5) 5. Crie uma interface Veiculo com DOIS métodos: ligar() e acelerar(). Crie Carro e Moto implementando os dois. Coloque numa lista e percorra com for-each chamando os dois métodos em cada um.
        ArrayList<Veiculo> veiculos = new ArrayList<>(
                List.of(new Carro(), new Moto())
        );
        for (Veiculo veiculo : veiculos) {
            veiculo.ligar();
            veiculo.acelerar();
        }


    }
}
