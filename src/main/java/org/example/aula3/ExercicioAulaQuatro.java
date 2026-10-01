package org.example.aula3;

public class ExercicioAulaQuatro {
    static void main() {
        // Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.
        // OBS: == é igual a; != diferente de; > maior que; < menor que; >= maior ou igual; <= menor ou igual;


        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;

        double soma = nota1 + nota2 + nota3;
        double media = soma / 3;

        if(media >= 7){
            System.out.printf("Aprovado ");
        } else if(media >= 5){
            System.out.printf("Recuperação ");
        } else{
            System.out.printf("Reprovado ");
        }

        System.out.printf("Média: %.2f%n", media);
    }
}
