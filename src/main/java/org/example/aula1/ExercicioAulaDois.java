package org.example.aula1;

public class ExercicioAulaDois {
    static void main() {
        // 1- Crie variáveis para um nome, uma cidade e uma idade. Mostre em uma única linha: "Meu nome é Ana, moro em Salvador e tenho 28 anos."

        String nome = "Flora";
        String cidade = "Salvador";
        int idade = 30;

        System.out.println("Olá! Meu nome é " + nome + ", moro em " + cidade + " e tenho " + idade + " anos!");

        // 2 — Crie variáveis para o nome de um produto ("Caneca"), o preço (12.50) e a quantidade (4). Mostre: "Comprei 4 unidades de Caneca por R$ 12.5 cada. Total: R$ 50.0"

        String produto = "caneca";
        double preco = 12.50;
        int quantidade = 4;
        double total = preco * quantidade;

        System.out.println("Comprei " + quantidade + " " + produto + "s por R$" + preco + " cada. O total foi de: R$" + total);

        // 3- Crie duas variáveis com números inteiros. Mostre a soma em uma frase completa, assim: "A soma de 15 e 4 é igual a 19."

        int soma1 = 15;
        int soma2 = 4;
        int resultado = soma1 + soma2;

        System.out.println("A soma de 15 e 4 é igual a " + resultado);

        /*         0- Rode esse código:
        System.out.println("2 + 2 = " + 2 + 2);.
        Agora rode:
        System.out.println("2 + 2 = " + (2 + 2));
        Explique em um comentário por que deram resultados diferentes.

        Os resultados são diferentes pois a primeira variável não faz a operação por conta do ( ), apenas concatena
        e a segunda variável faz a operação justamamente por conta do ().
        */


        // 1- Crie variáveis para dois números inteiros de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.

        int a = 10;
        int b = 3;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        System.out.println("Resultado da soma: " + soma);
        System.out.println("Resultado da subtação " + subtracao);
        System.out.println("Resultado da multiplicação " + multiplicacao);
        System.out.println("Resultado da divisão: " + divisao);
        System.out.println("Resultado da resto: " + resto);

        // 2- Crie variáveis para dois números decimais de valor a = 10 e b = 3 e mostre na tela: soma, subtração, multiplicação, divisão e resto.

        double c = 10;
        double d = 3;
        double soma3 = c + d;
        double subtracao3 = c - d;
        double multiplicacao3 = c * d;
        double divisao3 = c / d;
        double resto3 = c % d;

        System.out.println("Resultado da soma: " + soma3);
        System.out.println("Resultado da subtação " + subtracao3);
        System.out.println("Resultado da multiplicação " + multiplicacao3);
        System.out.println("Resultado da divisão: " + divisao3);
        System.out.println("Resultado da resto: " + resto3);

        // 3- Crie variáveis para três notas (8, 6 e 10). Mostre a soma e a média.

        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 10;
        int somaNota = nota1 + nota2 + nota3;
        double mediaNota = somaNota / 3;

        System.out.println("A soma das notas são: " + somaNota);
        System.out.println("A média das notas são: " + mediaNota);

        // 4- Faça a operação a + b * c, sendo a = 3, b = 4 e c = 5.

        int operacao1 = 3;
        int operacao2 = 4;
        int operacao3 = 5;
        int resultadoFinal = operacao1 + operacao2 * operacao3;

        System.out.println("Resultado final: " + resultadoFinal);

        // 5- Faça a operação (a + b) * c, sendo a = 3, b = 4 e c = 5.

        int operacao4 = 3;
        int operacao5 = 4;
        int operacao6 = 5;
        int resultadoFinal2 = (operacao4 + operacao5) * operacao6;

        System.out.println("Resultado final: " + resultadoFinal);

        /*
        Desafio: Crie uma variável com 3785 segundos. Mostre quantos minutos inteiros isso dá e quantos segundos sobram.

        Dica: segundos/60 dá os minutos. segundos % 60 mostra os segundos restantes.
        */

        int segundos = 3785;
        int minutos = segundos / 60;
        int segundosRestante = segundos % 60;

        System.out.println("Resultado final em minutos: " + minutos);
        System.out.println("Resultado final em segundos: " + segundosRestante);

    }
}
