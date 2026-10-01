package org.example.aula2;

// OPERADORES RELACIONAIS

/* Relacionais:
1- Crie variáveis para as notas de duas alunas. Mostre na tela o resultado de: são iguais, são diferentes, a primeira é maior, a primeira é menor para quando:
- a = 10, b = 3
- a = 3, b = 10
- a = 5, b = 5

OBS: == é igual a; != diferente de; > maior que; < menor que; >= maior ou igual; <= menor ou igual;
 */

public class ExercicioAulaTres {
    public static void main(String[] args) {
        double notaA1 = 10;
        double notaB1 = 3;
        // cenário 1:
        System.out.println("Cenário 1:");
        System.out.println("As notas são iguais? " + (notaA1 == notaB1));
        System.out.println("As notas são diferentes? " + (notaA1 != notaB1));
        System.out.println("A primeira é maior? " + (notaA1 > notaB1));
        System.out.println("A primeira é menor? " + (notaA1 < notaB1));

        double notaA2 = 3;
        double notaB2 = 10;
        // cenário 2:
        System.out.println("Cenário 2:");
        System.out.println("As notas são iguais? " + (notaA2 == notaB2));
        System.out.println("As notas são diferentes? " + (notaA2 != notaB2));
        System.out.println("A primeira é maior? " + (notaA2 > notaB2));
        System.out.println("A primeira é menor? " + (notaA2 < notaB2));

        double notaA3 = 5;
        double notaB3 = 5;
        // cenário 3:
        System.out.println("Cenário 3:");
        System.out.println("As notas são iguais? " + (notaA3 == notaB3));
        System.out.println("As notas são diferentes? " + (notaA3 != notaB3));
        System.out.println("A primeira é maior? " + (notaA3 > notaB3));
        System.out.println("A primeira é menor? " + (notaA3 < notaB3));

        //2- Exiba na tela  a == b, sendo a = 10 e b 3.

        int exibir1= 10;
        int exibir2= 3;
        System.out.println("Exibição na tela: " + (exibir1 == exibir2));

        //3- Exiba na tela a = b, sendo a = 10 e b = 3.
        int exibir3= 10;
        int exibir4= 3;
        System.out.println("Exibição na tela: " + (exibir3 = exibir4));

        // 4- Dado boolean chovendo = true, retorne na tela o resultado de !chovendo
        boolean chovendo = true;
        System.out.println("Resultado de !chovendo: " + !chovendo);

    }

}
