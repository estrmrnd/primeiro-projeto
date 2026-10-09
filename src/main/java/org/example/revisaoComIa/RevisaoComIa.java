package org.example.revisaoComIa;

import java.util.Scanner;

public class RevisaoComIa {
    // parte 1: fácil

    static void exercicio1() {
        // Crie variáveis para armazenar: seu nome; sua idade; sua cidade sua profissão
        String nome = "Jurema";
        int idade = 18;
        String cidade = "Rio de Janeiro";
        String profissao = "Cozinheira";

        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, moro no " + cidade + " e sou " + profissao);
    }

    static void exercicio2() {
        // Crie duas variáveis inteiras e mostre na tela: soma, subtração, multiplicação, divisão, resto da divisão
        int numero = 4;
        int numero2 = 3;
        int resultadoSoma = numero + numero2;
        int resultadoSubtracao = numero - numero2;
        int resultadoMultiplicacao = numero * numero2;
        int resultadoDivisao = numero / numero2;
        int resultadoRestoDivisao = numero % numero2;

        System.out.println("Resultado soma: " + resultadoSoma);
        System.out.println("Resultado subtação: " + resultadoSubtracao);
        System.out.println("Resultado multiplicação: " + resultadoMultiplicacao);
        System.out.println("Resultado divisão: " + resultadoDivisao);
        System.out.println("Resultado do resto da divisão: " + resultadoRestoDivisao);
    }

    static void exercicio3() {
        // Crie três variáveis double representando notas. Calcule a média e mostre o resultado usando printf, com duas casas decimais.
        double nota1 = 0;
        double nota2 = 3.4;
        double nota3 = 7.2;
        double resultadoNota = (nota1 + nota2 + nota3) / 3;

        System.out.printf("A média das notas é %.2f:  ", resultadoNota);
    }

    static void exercicio4() {
        // Crie duas variáveis inteiras e faça o programa mostrar o resultado das seguintes comparações: primeiro número é maior que o segundo? primeiro número é menor que o segundo? são iguais? são diferentes? primeiro número é maior ou igual ao segundo? O resultado deve aparecer como true ou false.
        int a = 4;
        int b = 6;

        System.out.println(a > b);
        System.out.println(a < b);
        System.out.println(a == b);
        System.out.println(a != b);
        System.out.println(a >= b);

    }

    // parte 2: intermediário
    static void exercicio5() {
        // Utilizando Scanner, peça para a pessoa informar: nome; idade; altura. Depois mostre os dados digitados usando printf.
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeUsuario = sc.nextLine();
        System.out.println("Digite sua idade: ");
        int idadeUsuario = sc.nextInt();
        System.out.println("Digite sua altura");
        double alturaUsuario = sc.nextDouble();

        System.out.printf("Seu nome é: %s\nSua idade é: %d\nSua altura é: %.2f\n" ,nomeUsuario, idadeUsuario, alturaUsuario);
    }

    static void exercicio6() {
        // Pegue um numero inteiro e diga se ele é ímpar o par.
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroInteiro = sc2.nextInt();

        if(numeroInteiro % 2 == 0){
            System.out.println("O número digitado é par");
        }else{
            System.out.println("O número digitado é impar");
        }
    }

    static void exercicio7() {
        //Peça dois números inteiros. Utilizando estrutura de decisão, mostre: qual é o maior; ou informe que os dois são iguais.
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int pedido1 = sc3.nextInt();
        System.out.println("Digite novamente um número inteiro: ");
        int pedido2 = sc3.nextInt();

        if(pedido1 > pedido2){
            System.out.println(pedido1 + " é maior que " + pedido2);
        }else if(pedido1 == pedido2){
            System.out.println(pedido1 + " é igual a " + pedido2);
        }else {
            System.out.println(pedido2 + " é maior que " + pedido1);
        }
    }

    static void exercicio8() {
        //Peça três notas, calcule a média e mostre: Aprovada → média maior ou igual a 7; Recuperação → média entre 5 e 6.9; Reprovada → média menor que 5; Mostre também a média com duas casas decimais.
        Scanner sc4 = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double notaMedia1 = sc4.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double notaMedia2 = sc4.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double notaMedia3 = sc4.nextDouble();
        double resultadoFinal = (notaMedia1 + notaMedia2 + notaMedia3) / 3;

        if(resultadoFinal > 7){
            System.out.println("Aprovado!");
        }else if(resultadoFinal >= 5){
            System.out.println("Recuperação");
        }else{
            System.out.println("Reprovado");
        }
        System.out.printf("Resultado final %.2f: ", resultadoFinal);
    }

    static void main() {
        exercicio8();
    }
}
