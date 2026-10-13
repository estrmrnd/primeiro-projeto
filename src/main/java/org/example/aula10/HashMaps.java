package org.example.aula10;

import java.util.HashMap;

public class HashMaps {
    static void exercicio1() {
        //Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa inteiro e depois use get para mostrar a idade de uma delas.
        HashMap<String, Integer> nomeIdade = new HashMap<>();
        nomeIdade.put("Ana", 26);
        nomeIdade.put("Josefina", 23);
        nomeIdade.put("Ethel", 28);
        System.out.println(nomeIdade);
        System.out.println(nomeIdade.get("Ana"));
    }

    static void exercicio2() {
        // Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00, imprima, e depois faça put de "café" DE NOVO com valor 7.50. Imprima outra vez e veja o que aconteceu com o tamanho.
        HashMap<String, Double> produto = new HashMap<>();
        produto.put("Café", 5.00);
        System.out.println(produto);
        produto.put("Café", 7.50);
        System.out.println(produto);
        System.out.println(produto.size());
    }

    static void exercicio3() {
        //Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey dentro de um if para mostrar o telefone de alguém que está na agenda e de alguém que não está.
        HashMap<String, Long> agenda = new HashMap<>();
        agenda.put("Renata", 21912345678L);
        agenda.put("Monica", 21998765432L);
        if(agenda.containsKey("Renata")) {
            System.out.println("Está na agenda, telefone: " + agenda.get("Renata"));
        }else{
            System.out.println("Não está na agenda");
        }
    }

    static void exercicio4() {
        //Crie um HashMap de estoque (produto -> quantidade) com dois itens. Use getOrDefault para mostrar a quantidade de um produto que existe e de um que não existe (devolvendo 0). Depois tente com get normal no que não existe e compare.
        HashMap<String, Integer> estoque = new  HashMap<>();
        estoque.put("Arroz", 5);
        estoque.put("Feijão", 4);
        System.out.println(estoque.getOrDefault("Arroz", 5));
        System.out.println(estoque.getOrDefault("Filé de frango", 0));
        System.out.println(estoque.get("Arroz"));
        System.out.println(estoque.get("Filé de frango"));
    }

    static void exercicio5() {
        // Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho. Remova uma delas e imprima de novo
        HashMap<String, Double> nota = new HashMap<>();
        nota.put("Veronica",5.6);
        nota.put("Benedita", 8.7);
        nota.put("Mariele",6.3);
        System.out.println(nota);
        System.out.println(nota.size());
        nota.remove("Veronica");
        System.out.println(nota);
        System.out.println(nota.size());
    }

    static void main() {
        exercicio5();
    }

}
