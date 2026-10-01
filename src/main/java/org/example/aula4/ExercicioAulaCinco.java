package org.example.aula4;

/*
    OBS: == é igual a; != diferente de; > maior que; < menor que; >= maior ou igual; <= menor ou igual;
 */

public class ExercicioAulaCinco {
    static void main() {
        // 1 — Crie uma variável idade e mostre a categoria de uma pessoa: menos de 13 anos é "Criança", de 13 a 17 é "Adolescente", de 18 a 59 é "Adulto" e 60 ou mais é "Idoso".
        int idade = 20;

        if(idade < 13){
            System.out.println("É criança");
        } else if (idade <= 17){
            System.out.println("É adolescente");
        } else if (idade <= 59){
            System.out.println("É adulto");
        } else {
            System.out.println("É idoso");
        }

        // 2 — Crie variáveis para o saldo da conta (R$ 500.00) e o valor de uma compra (R$ 320.00). Se o saldo for suficiente, mostre "Compra aprovada!" e o saldo restante. Se não for, mostre "Saldo insuficiente" e quanto está faltando.

        double saldoConta = 500;
        double valorCompra = 320;
        double totalCompra = saldoConta - valorCompra;

        if (valorCompra < saldoConta){
            System.out.println("Compra aprovada! Valor restante R$" + totalCompra);
        } else {
            System.out.println("Compra reprovada!");
        }

        // 3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".

        int opcao = 2;

        switch (opcao){
            case 1:
                System.out.println("Café");
                break;
            case 2:
                System.out.println("Cappuccino");
                break;
            case 3:
                System.out.println("Chocolate Quente");
                break;
            case 4:
                System.out.println("Chá");
                break;
            default:
                System.out.println("Opção inválida.");
                break;
        }

        // 4 — Crie variáveis idade (17) e temAutorizacao (true). Mostre se a pessoa pode entrar na festa: precisa ter 18 anos ou ter autorização. Faça o mesmo para
        //precisa ter 18 anos e ter autorização.
        //     OBS: == é igual a; != diferente de; > maior que; < menor que; >= maior ou igual; <= menor ou igual;

        int idadeEntrada = 17;
        boolean temAutorizacao = true;

        if(idadeEntrada >= 18 || temAutorizacao == true){
            System.out.println("Entrada liberada.");
        } else {
            System.out.println("Precisa ser maior de 18 anos ou ter autorização");
        }

        //Desafio: Crie variáveis para três notas de uma aluna. Calcule a média e mostre: "Aprovada" se for 7 ou mais, "Recuperação" entre 5 e 6.9, e "Reprovada" abaixo de 5. Mostre também a média na tela. Valores: nota1 = 5.3, nota2 = 7.8 , nota3 = 4.5.
        //
        //Ps: Utilize double para o valor das notas. Para controlar as casas decimais, use printf com o marcador %.2f onde você quer que apareça a média no seu texto (Troquem ele de lugar pra ver o que acontece), onde 2 é a quantidade de casas que você quer (Experimentem trocar por 3 e ver o que acontece). O texto e a pontuação vão dentro das aspas, e o \n no final pula a linha (ele funciona como  um enter para que tudo não fique colado um do lado do outro):
        //
        //System.out.printf("Sua média é: %.2f\n", media);

        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;
        double mediaNota = (nota1 + nota2 + nota3) / 3;

        if(mediaNota >= 7) {
            System.out.printf("Aprovado! Média %.2f ", mediaNota);
        }else if (mediaNota >= 5 && mediaNota <= 6.9){
            System.out.printf("Recuperação! A média é %.2f ", mediaNota);
        } else{
            System.out.printf("Reprovado! A média é %.2f ", mediaNota);
        }
    }
}
