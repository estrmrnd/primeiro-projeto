package org.example.aula11;
/*
Referência:
For-each:
for (tipo apelido : coleção) {

 }
Array normal:
String[] nomeDoArray = {"Ana", "Maria"};

ArrayList:
ArrayList<String> lista = new ArrayList<>();
 */

import java.util.ArrayList;
import java.util.List;

public class ForEaches {
    static void exercicio1() {
        // Crie um array (não arrayList, array normal) com 4 nomes e imprima todos usando for-each, um por linha.
        String [] nome = {"Maria", "Julia", "Flávia", "Gilmara"};
        for(String nomes : nome){
            System.out.println("For-each: " + nomes);
        }

        //exercicio5: Pegue o exercício 1 e escreva ele DE NOVO com o for normal, usando o índice. Deixe os dois na mesma classe e compare.
        for(int i = 0; i < nome.length; i++){
            System.out.println(nome[i]);
        }
    }

    static void exercicio2() {
        // Crie um ArrayList com 5 notas e imprima todas usando for-each.
        ArrayList<Double> notas = new ArrayList<>(
                List.of(5.6, 6.0, 7.8, 5.4, 7.1)
        );
        for(Double nota : notas){
            System.out.println("For: " + nota);
        }
    }

    static void exercicio3() {
        //Com o array de notas {8, 6, 10, 7}, use for-each para somar todas e mostrar a soma e a média.
        int[] nota = {8, 6, 10, 7};
        int soma = 0;
        for(int notas : nota){
            soma +=notas;
            System.out.println("Notas: " + notas);
        }
        double media = (double) soma / nota.length;
        System.out.println("Soma das notas: " + soma);
        System.out.println("Média das notas: " + media);
    }

    static void exercicio4() {
        //Com um array de nomes, use for-each e um if para contar quantos têm mais de 5 letras. Mostre o total. Dica: usem o método length.
        String[] qntdLetras = {"Paola", "Rosa", "Sarah", "Constância"};
        for(String letras : qntdLetras){
            if(letras.length() >= 5){
                System.out.println("Tem mais de 5 letras: " + letras);
            }else{
                System.out.println("Tem menos de 5 letras:" + letras);
            }
        }
    }

    static void main() {
        exercicio1();
    }
}
