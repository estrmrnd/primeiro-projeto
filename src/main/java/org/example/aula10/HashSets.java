package org.example.aula10;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class HashSets {
    static void exercicio1() {
        //Crie um HashSet de nomes e adicione quatro valores, sendo um deles repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu com o repetido.
        HashSet<String> nomes = new HashSet<>();
        nomes.add("Josefa");
        nomes.add("Maria de Fátima");
        nomes.add("Lúcia Maria");
        nomes.add("Josefa");
        System.out.println(nomes);
        System.out.println("Quantidade de nomes:" +  nomes.size());
    }

    static void exercicio2() {
        //Crie um HashSet de cores usando addAll. Depois use contains dentro de um if para avisar se a cor "verde" já está no conjunto ou não.
        HashSet<String> cores = new HashSet<>();
        cores.addAll(List.of("Vermelho", "Amarelo", "Verde", "Azul"));
        if(cores.contains("Verde")){
            System.out.println("Essa cor está no conjunto");
        }else{
            System.out.println("Essa cor não está no conjunto");
        }
    }

    static void exercicio3() {
        //Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para tirar os repetidos. Imprima os dois e compare.
        ArrayList<String> nome = new ArrayList<>(
                List.of("Joanna", "Beatriz", "Emanuele", "Alice", "Joanna")
        );
        HashSet<String> nomeUnico = new HashSet<>(nome);
        System.out.println(nome.size());
        System.out.println(nomeUnico.size());

    }

    static void exercicio4() {
        //Crie um HashSet com três CPFs e imprima. Depois remova um deles e imprima de novo, junto com o tamanho.
        HashSet<String> cpf = new HashSet<>();
        cpf.add("12345678900");
        cpf.add("12345678901");
        cpf.add("12345678902");
        System.out.println(cpf);
        cpf.remove("12345678901");
        System.out.println(cpf);
        System.out.println(cpf.size());
    }

    static void exercicio5() {
        //Crie um HashSet com três frutas e percorra ele com for, imprimindo uma por linha.
        HashSet<String> frutas = new HashSet<>();
        frutas.add("Banana");
        frutas.add("Maçã");
        frutas.add("Melão");
        for(String fruta : frutas){
            System.out.println(fruta);
        }
    }

    static void exercicio6() {
        //Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e imprima o isEmpty() de novo.
        HashSet<String> vazio = new HashSet<>();
        System.out.println(vazio.isEmpty());
        vazio.add("Tem certeza?");
        System.out.println(vazio.isEmpty());

    }
    static void main() {
        exercicio6();
    }
}
