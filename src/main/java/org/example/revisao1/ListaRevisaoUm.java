package org.example.revisao1;
import java.util.Scanner;

public class ListaRevisaoUm {
    static void exercicio1() {
        System.out.println("Executando exercício 1");
        // 1 - Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
        //Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o nome do lanche:");
        String nomeLanche = sc.nextLine();
        System.out.println("Digite o valor do lanche ");
        double valorLanche = sc.nextDouble();

        double descontoLanche = 5;
        double aplicaDesconto;



        if(valorLanche > 30){
            aplicaDesconto = valorLanche - descontoLanche;
            System.out.printf("O lanche " + nomeLanche + " custa R$%.2f ", aplicaDesconto);
        } else{
            System.out.printf("O lanche " + nomeLanche + " custa R$%.2f ", valorLanche);
        }
    }

    static void exercicio2() {
        System.out.println("Executando exercício 2");
        // 2 - Faça um programa que use um laço for para contar de 1 até 15. Dentro do for, coloque um if para verificar se o número atual é par ou ímpar (dica: use o operador de resto da divisão % 2 == 0).
        //Imprima na tela o número e a palavra correspondente.
        //Exemplo de saída:
        //"1 é Ímpar"
        //"2 é Par"

        for (int i = 1; i <= 15; i++){
      // for (início; condição; atualização)
            if( i % 2 == 0){
                System.out.println(i + " é par");
            }else{
                System.out.println(i + " é impar");
            }
        }
    }

    static void exercicio3() {
        System.out.println("Executando exercício 3");
        Scanner sc = new Scanner(System.in);
        //3 - Usando um do-while e um switch, crie um menu interativo. O menu deve oferecer três opções:
        //1 - Ver camisas
        //2 - Ver calças
        //3 - Sair
        //Se a pessoa digitar 1 ou 2, exiba uma mensagem confirmando a escolha. Se digitar uma opção inválida, avise. O laço só deve ser quebrado (encerrado) quando a pessoa digitar 3.

        int opcao;

        do{
            System.out.println("Digite uma opção de 1 a 3");
            opcao = sc.nextInt();
        switch (opcao) {
            case 1:
                System.out.println("Ver Camisas");
                break;
            case 2:
                System.out.println("Ver Calças");
                break;
            case 3:
                System.out.println("Sair");
                break;
            default:
                System.out.println("Opção inválida.");
        }
            }while (opcao != 3);
    }

    static void exercicio4() {
        System.out.println("Executando exercício 4");
        // 4 - Crie uma classe chamada Pet.
        //
        //Dê a ela três atributos: nome (String), raca (String) e peso (double).
        //
        //Em outra classe, instancie (crie) dois objetos diferentes dessa classe (por exemplo, um cachorro e um gato).
        //
        //Atribua valores para os atributos de cada um deles.
        //
        //Imprima os dados dos dois pets concatenando textos e variáveis.

        Pet pet1 = new Pet();
        Pet pet2 = new Pet();

        pet1.raca = "poodle";
        pet1.nome = "Maylon";
        pet1.peso = 5.6;

        pet2.raca = "siamês";
        pet2.nome = "xaninha";
        pet2.peso = 4;

        System.out.println("Pet 1: " + pet1.nome + " raça: " + pet1.raca + " peso: " + pet1.peso);
        System.out.println("Pet 2: " + pet2.nome + " raça: " + pet2.raca + " peso: " + pet2.peso);


    }

    static class Pet{
        String raca;
        String nome;
        double peso;
    }

    static void exercicio5() {
        System.out.println("Executando exercício 5");
        //5 - Crie uma classe chamada Produto com os atributos nome (String) e preco (double).
        //Na classe principal, faça um laço for que repita 3 vezes.
        //A cada repetição, o programa deve usar o Scanner para perguntar o nome e o preço de um produto.
        //Instancie um novo Produto e guarde nele os valores digitados.
        //Logo em seguida, faça um if: se o preço do produto for maior que 100, imprima "Produto caro!". Se for menor ou igual, imprima "Produto com preço acessível!". Use printf para mostrar o valor.

        class Produto {
            String nomeProduto;
            double preco;
        }
          //for (início; condição; atualização)
            for(int i = 1; i <= 3; i++) {
                Scanner sc2 = new Scanner(System.in);

                System.out.println("Digite o nome do produto: ");
                String nomeProduto = sc2.nextLine();
                System.out.println("Digite o preço do produto: ");
                double precoProduto = sc2.nextDouble();

                Produto produto1 = new Produto();

                produto1.nomeProduto = nomeProduto;
                produto1.preco = precoProduto;

                if (precoProduto > 100) {
                    System.out.printf("Produto caro! Valor do produto %s é de R$ %.2f ", nomeProduto, precoProduto);
                } else {
                    System.out.printf("Produto com preço acessível! O produto %s é de R$%.2f ", nomeProduto, precoProduto);
                }
            }
    }

    static void exercicio6() {
        System.out.println("Executando exercício 6");
        // 6 - Crie um programa para cadastrar um usuário. Siga exatamente esta ordem:
        //Peça para o usuário digitar o seu Ano de Nascimento (leia usando nextInt()).
        //Logo em seguida, peça para ele digitar o seu Nome Completo (leia usando nextLine()).
        //Por fim, imprima uma mensagem concatenada: "O usuário [NOME] nasceu em [ANO]."
        Scanner sc3 = new Scanner(System.in);
        System.out.println("Qual o seu nome completo?");
        String nomeUsuario = sc3.nextLine();
        System.out.println("Em que ano você nasceu?");
        int anoNascimento = sc3.nextInt();

        System.out.println("O usuário " + nomeUsuario + " nasceu em " + anoNascimento + ".");
    }

    static void exercicio7() {
        System.out.println("Executando exercício 6");
        class Aluno{
            String nomeAluno;
            double nota;
            double nota2;
            double mediaNota;
            boolean foiAprovado;

        }
        System.out.println("Bem vindo ao sistema de notas!");
        int iniciar = 0;
        int contador = 0;

        while(iniciar != 2){
            Scanner sc4= new Scanner(System.in);
            System.out.println("Aperte 1 para iniciar, 2 para sair ou 3 para saber quantidade cadastrada.");
            iniciar = sc4.nextInt();
            sc4.nextLine();

            switch (iniciar){
                case 1: Aluno aluno = new Aluno();
                    System.out.println("Digite o nome da(o) aluna(o): ");
                    aluno.nomeAluno = sc4.nextLine();
                    System.out.println("Digite a primeira nota:");
                    aluno.nota = sc4.nextDouble();

                    while(aluno.nota < 0 || aluno.nota > 10){
                        System.out.println("Nota inválida. Cadastre a nota novamente.");
                        aluno.nota = sc4.nextDouble();
                    }

                    System.out.println("Digite a segunda nota:");
                    aluno.nota2 = sc4.nextDouble();

                    while(aluno.nota2 < 0 || aluno.nota2 > 10){
                        System.out.println("Nota inválida. Cadastre a nota novamente.");
                        aluno.nota2 = sc4.nextDouble();
                    }

                    aluno.mediaNota = (aluno.nota + aluno.nota2) / 2;
                    aluno.foiAprovado = false;

                    if(aluno.mediaNota >= 6){
                        aluno.foiAprovado = true;
                        System.out.printf("A(O) aluna(o) %s tem a primeira nota: %.1f, a segunda nota: %.1f e a média %.1f. Aluna(o) aprovada(o)! %b\n", aluno.nomeAluno, aluno.nota, aluno.nota2, aluno.mediaNota, aluno.foiAprovado);
                    }else{
                        aluno.foiAprovado = false;
                        System.out.printf("A(O) aluna(o) %s tem a primeira nota: %.1f, a segunda nota: %.1f e a média %.1f. Aluna(o) reprovada(o)! %b\n", aluno.nomeAluno, aluno.nota, aluno.nota2, aluno.mediaNota, aluno.foiAprovado);
                    }
                    contador++;
                    break;
                case 2:
                    System.out.println("Obrigada por entrar no sistema de notas, até breve!");
                    break;
                case 3:
                    System.out.println("Quantidade de cadastros são " + contador);
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }



/*7 -  DESAFIO — Sistema de Cadastro de Alunas
Você vai construir um programa que cadastra alunas, calcula a média delas e diz se foram aprovadas. O programa fica rodando até a pessoa escolher sair.

Este desafio tem regras de construção obrigatórias. Não é só fazer funcionar, é fazer funcionando do jeito pedido. Sigam as instruções solicitadas, pois o objetivo é praticar as estruturas que vimos essa semana.

O que o programa faz
Pergunta se a pessoa quer iniciar: 1 para continuar, 2 para sair
Se escolher 1:
pede a primeira nota
pede a segunda nota
calcula a média
pede o nome da aluna
decide se ela foi aprovada (média 6 ou mais)
mostra uma frase com o nome, as duas notas, a média e se foi aprovada
volta pro menu
Se escolher 2: mostra uma mensagem de despedida e encerra
Se digitar qualquer outra coisa: avisa que a opção é inválida e volta pro menu


Regras obrigatórias:
1. Crie uma classe Aluna com cinco atributos: nome, nota, nota2, media e passou (passou sendo boolean).
2. Toda informação fica nos atributos do objeto. Nada de criar variáveis soltas tipo double nota1 = sc.nextDouble(). O valor lido vai direto pro atributo: aluna.nota = sc.nextDouble().
3. Use while para manter o programa rodando até a pessoa escolher sair.
4. Use switch para tratar as opções do menu. Todos os casos precisam de break, e precisa ter um default.
5. Instancie a Aluna dentro do loop, no momento do cadastro. Cada volta cria uma aluna nova. (Ainda não estudamos como guardar vários valores, por enquanto, cada aluna é mostrada na tela e descartada na próxima iteração do loop.)
6. Calcule a média dentro do programa. Nada de pedir a média pronta pra pessoa.
7. Use if / else para definir se a aluna passou. A média mínima para aprovação é 6. Se a média for 6 ou mais, passou recebe true; se for menor, recebe false. O programa decide sozinho — não pergunte isso para a pessoa.
8. Use printf para mostrar o resultado: %s para o nome (String), %.1f para as notas e a média, e %b para o passou (boolean).
Exemplo de execução:
Deseja iniciar? Pressione 1 continuar, 2 para sair
1
Nota 1:
8.0
Nota 2:
7.0
Nome da Aluna:
Maria Silva
O nome da aluna é Maria Silva, sua primeira nota foi 8.0, sua segunda nota foi 7.0,
e sua média final foi 7.5. Aluna aprovada: true
Deseja iniciar? Pressione 1 continuar, 2 para sair
5
Opção inválida.
Deseja iniciar? Pressione 1 continuar, 2 para sair
2
Encerrando o sistema. Até logo!

Bônus:
Se terminar e quiser ir além
Faça o programa mostrar "Aprovada" ou "Reprovada" em vez de true / false,
Adicione uma opção no menu que mostra quantas alunas já foram cadastradas até agora
Não deixe cadastrar nota menor que 0 ou maior que 10

⚠️ Dica: Você vai precisar de um scanner.nextLine() sozinho. Lembram do bug do scanner.nextLine?  Ler número e depois texto tem uma armadilha: sobra um Enter no caminho e o programa pula a pergunta do nome. É ai que entra o sc.nextLine() sozinho pra limpar antes de ler o nome. Descubra onde ele vai.
 */

    }


    public static void main(String[] args) {

        exercicio7();
    }
}
