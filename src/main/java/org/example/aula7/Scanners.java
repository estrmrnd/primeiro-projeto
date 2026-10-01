package org.example.aula7;
import java.util.Scanner;

public class Scanners {
    static void exercicio1() {
        // 1 - Peça o nome da pessoa e a idade dela. Exemplo: "Oi Ana, você tem 28 anos e vai fazer 29 no próximo aniversário."
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a sua idade: ");
        int idade = sc.nextInt();

        System.out.println("Oi, " + nome + "! Você tem " + idade + " anos e irá fazer " + (idade + 1) + " no próximo aniverśario!");

    }

    static void exercicio2() {
        // 2 - Peça dois números inteiros e mostre a soma, a subtração, a multiplicação, a divisão e o resto.
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int numero = sc2.nextInt();
        System.out.println("Digite um novo numero inteiro: ");
        int numero2 = sc2.nextInt();

        System.out.println("A soma dos números são: " + (numero + numero2) + "; a subtração é: " + (numero - numero2) + "; a multiplicação é: " +(numero * numero2) + " e a divisão é: " + (numero / numero2));
    }

    static void exercicio3() {
        // 3 - Peça a nota de uma aluna e mostre se ela foi aprovada (7 ou mais), ficou de recuperação (entre 5 e 6.9) ou foi reprovada.
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Digite a sua média final para saber se foi aprovada, em recuperação ou reprovada: ");
        double nota = sc3.nextDouble();
        if(nota >= 7){
            System.out.printf("Aprovada!");
        }else if(nota >= 5){
            System.out.printf("Recuperação!");
        }else {
            System.out.printf("Reprovada!");
        }
    }

    static void exercicio4() {
        // 4 - Peça um número e mostre a tabuada dele de 1 a 10.
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int tabuada = sc4.nextInt();
        for (int i = 1; i <= 10; i++){
            System.out.println("O resultado da tabuada do número: " + tabuada + " é: " + (tabuada * i));
        }

    }
    public static void main(String[] args) {
        exercicio4();
    }
}
