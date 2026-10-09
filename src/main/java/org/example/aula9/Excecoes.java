package org.example.aula9;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Excecoes {
    static void exercicio1() {
        // 1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");
        int primeiro = sc.nextInt();
        System.out.println("Digite o segundo numero: ");
        int segundo = sc.nextInt();

        try{
            int divisao = primeiro / segundo;
            System.out.println(divisao);
        }catch(ArithmeticException e){
            System.out.println("Não dá pra dividir por zero.");
        }finally{
            sc.close();
        }
    }

    static void exercicio2() {
        //2 — Crie um array com 5 notas. Peça uma posição para a pessoa e mostre a nota daquela posição. Se a posição não existir, trate a ArrayIndexOutOfBoundsException e avise que o array só vai de 0 a 4.
        double[] notas = {5, 7, 2, 8, 7};
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Escolha uma posição de 0 a 4:");
        int posicao = sc2.nextInt();

        try{
            System.out.println(notas[posicao]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Posição inválida. Escolha de zero a quatro.");
        }finally{
            sc2.close();
        }
    }

    static void exercicio3() {
        // 3 — Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.

        Scanner sc3 = new Scanner(System.in);
        boolean idadeValida = false;

        while(!idadeValida){
            System.out.println("Digite sua idade: ");

            try {
                int idade = sc3.nextInt();
                idadeValida = true;
                System.out.println("Sua idade é: " + idade);
            } catch (InputMismatchException e) {
                System.out.println("Apenas números inteiros são válidos. Tente novamente.");
                sc3.next();
            }
        }
    }

    static void exercicio4() {
        // 4 — Crie uma variável String nome = null; e tente imprimir nome.length(). Trate a NullPointerException e mostre "O nome não foi preenchido."
        String nome = null;

        try{
            System.out.println(nome.length());
        }catch(NullPointerException e){
            System.out.println("O nome não foi preenchido.");
        }
    }

    static void exercicio5() {
        // 5 — Peça um número para a pessoa e mostre o resto da divisão de 100 por esse número. Trate a ArithmeticException para o caso de ela digitar 0.

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int numeroInteiro =  sc5.nextInt();
        int restoDivisao = 100;

        try{
            int resultado = restoDivisao % numeroInteiro;
            System.out.println(resultado);
        }catch(ArithmeticException e){
            System.out.println("O número zero não pode ser dividido.");
        }
    }

    static void exercicio6() {
        // 6 — Crie um array com 3 nomes. Mostre o nome da posição 5 de propósito e trate a ArrayIndexOutOfBoundsException com a mensagem "Essa posição não existe." Depois do try/catch, imprima "O programa continua funcionando."
        String [] nomes = {"Alice", "Ariel", "Tainara"};

        try{
            System.out.println(nomes[5]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Essa posição não existe");
        }
        System.out.println("O programa continua funcionando.");
    }
    public static void main(String[] args) {
        exercicio6();
    }
}
