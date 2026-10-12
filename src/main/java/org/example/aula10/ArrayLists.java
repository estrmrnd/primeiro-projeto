package org.example.aula10;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Referência:

nomes.add("Carla");          // adiciona no fim
nomes.get(0);                // pega pela posição
nomes.size();                // quantos tem
nomes.set(0, "Zoe");         // troca o valor da posição
nomes.remove(1);             // remove pela posição
nomes.contains("Ana");       // true ou false
nomes.indexOf("Bia");        // em que posição está
nomes.isEmpty();             // true se está vazia
 */
public class ArrayLists {
    static void exercicio1() {
        // Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Mariane");
        lista.add("Tainara");
        lista.add("Ariel");

        System.out.println(lista);
    }

    static void exercicio2() {
        //Crie uma lista já preenchida com quatro frutas. Imprima a primeira, a última e quantas frutas tem.
        List<String> fruta = List.of("Banana", "Maça", "Uva Roxa", "Melancia");
        System.out.println(fruta.get(0));
        System.out.println(fruta.get(3));
        System.out.println(fruta.size());
    }

    static void exercicio3() {
        //Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
        List<String> nomes = new ArrayList<>(
                List.of("Janice", "Assucena", "Jurema", "Jussara")
        );
        System.out.println(nomes);
        nomes.set(2, "Josefa");
        System.out.println(nomes);
    }

    static void exercicio4() {
        // Crie uma lista com quatro cidades. Remova a da posição 1 e imprima quantas sobraram.
        List<String> cidade = new ArrayList<>(
                List.of("Rolandia - PR", "Pintópolis - MG", "Piranhas - AL", "Anta Gorda - RS")
        );
        cidade.remove(1);
        System.out.println(cidade);
    }

    static void exercicio5() {
        // Crie uma lista com seis nomes e imprima todos usando um laço, no formato `"0: Ana"`. (Dica: i + ": " + comando para pegar posição da lista)
        List <String> nome = new ArrayList<>(
                List.of("Rosalia", "Beyoncé", "Erika Badu", "Luedji Luna", "Nathy Peluso", "Lady Gaga")
        );
            for(int i = 0; i < nome.size(); i++){
                System.out.println(i +": " + nome.get(i));
            }
    }

    static void exercicio6() {
        // Crie uma lista com cinco nomes. Peça um nome à pessoa e diga se ele está na lista e em qual posição. Se não estiver, avise.
        List<String> listaNome = new ArrayList<>(
                List.of("Janaina", "Déia", "Camila", "Gabi", "Joanna")
        );
        Scanner sc = new Scanner(System.in);
        System.out.println("Escreva um nome: ");
        String escrevaNome = sc.nextLine();
        boolean encontrado = false;

        for(int i = 0; i < listaNome.size(); i++){
        if(escrevaNome.equalsIgnoreCase(listaNome.get(i))){
            encontrado = true;
            System.out.println("Seu nome aparece na lista");
        }
        }
        if (encontrado != true){
            System.out.println("Seu nome não aparece na lista");
        }
    }
    static void main() {
        exercicio6();
    }

}
