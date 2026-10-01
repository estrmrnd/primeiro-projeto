package org.example.aula7;

public class EstruturasRepeticao {
    static void exercicio1() {
        // 1 - Mostre os números de 1 a 30, um por linha, usando for.
        for(int i = 1; i <= 30; i++){
            System.out.println("A sequência dos números são: " + i);
        }
    }

    static void exercicio2() {
        // 2 - Mostre a contagem regressiva de 10 até 1 e depois a palavra "Fim!".
        for(int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Fim!");
    }

    static void exercicio3() {
        // 3 - Faça o mesmo do exercício 1, agora usando while. Compare os dois códigos.
        int numeros = 1;
        while(numeros <= 30){
            System.out.println(numeros);
            numeros++;
        }
    }

    static void exercicio4() {
        // 4 -  Crie uma variável com um número e mostre a tabuada dele de 1 a 10.
        int tabuada = 2;
        for (int i = 1; i <= 10; i++){
            System.out.println("O resultado da tabuada do número: " + tabuada + " é: " + (tabuada * i));
        }

    }
    static void main() {
        exercicio4();

    }
}
