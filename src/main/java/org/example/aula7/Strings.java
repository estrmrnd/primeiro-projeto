package org.example.aula7;

import java.util.Scanner;

/* REFERÊNCIA:

String nome = "Maria Silva";
nome.length();                 // 11
nome.toUpperCase();            // MARIA SILVA
nome.toLowerCase();            // maria silva
nome.contains("Silva");        // true
nome.charAt(0);                // M
nome.substring(0, 5);          // Maria
nome.replace("Silva","Souza"); // Maria Souza
"  oi ".trim();               // "oi"
nome.equals("maria silva");           // false
nome.equalsIgnoreCase("maria silva"); // true

 */
public class Strings {
    static void exercicio1() {
        //1 — Peça o nome completo da pessoa e mostre quantas letras ele tem (contando os espaços).
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome completo:");
        String nomeCompleto = sc.nextLine();
        System.out.println("Seu nome: " +nomeCompleto + " tem " + nomeCompleto.length() + " caracteres.");
    }

    static void exercicio2() {
        // 2 — Peça o nome da pessoa e mostre ele todo em MAIÚSCULO e todo em minúsculo.
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite o seu nome completo:");
        String nomeCase = sc2.nextLine();
        System.out.println("Seu nome todo em maiúsculo: " + nomeCase.toUpperCase() + ". Seu nome todo minusculo: " + nomeCase.toLowerCase() + ".");
    }

    static void exercicio3() {
        // 3 — Peça o nome da pessoa e mostre a primeira letra dele.
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Digite o seu nome completo:" );
        String nomeLetra1 = sc3.nextLine();
        System.out.println("A primeira letra do seu nome é: " + nomeLetra1.charAt(0));
    }

    static void exercicio4() {
        // 4 — Peça uma frase e uma palavra. Diga se a palavra aparece dentro da frase.
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Digite uma frase: ");
        String frase = sc4.nextLine();
        System.out.println("Digite uma palavra: ");
        String palavra = sc4.nextLine();

        System.out.println("A palavra aparece na frase? " + frase.contains(palavra));
    }

    static void exercicio5() {
        //5 — Peça o nome da pessoa duas vezes e diga se os dois são iguais, ignorando maiúsculas e minúsculas.
        //Digite seu nome: Ana
        //Digite de novo: ANA
        //Os nomes são iguais? true
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = sc5.nextLine();
        System.out.println("Digite novamente: ");
        String novoNome = sc5.nextLine();

        System.out.println("Os nomes são iguais? " + nome.equalsIgnoreCase(novoNome));
    }

    static void main() {
        exercicio5();
    }
}

