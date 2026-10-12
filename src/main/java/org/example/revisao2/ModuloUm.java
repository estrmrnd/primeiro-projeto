package org.example.revisao2;
/*
11Tratamento de exceções
Peça dois números e mostre a divisão. Trate o caso de a pessoa digitar 0 no segundo.

Crie um array com 5 notas. Peça uma posição e mostre a nota. Trate posição inválida.

Peça a idade com nextInt(). Trate o caso de a pessoa digitar texto.

Crie String nome = null; e tente imprimir nome.length(). Trate a exceção.

Crie um array com 3 nomes e tente imprimir a posição 5. Trate a exceção e, depois do try/catch, imprima "O programa continua funcionando."

🔥 Mini-desafio — Faça um programa com um try e três catch diferentes: um para divisão por zero, um para posição inválida de array e um genérico (Exception) no final. Teste cada situação e veja qual catch é acionado.

💡 O catch (Exception e) pega qualquer erro, então ele precisa ser o último. Se vier antes dos outros, o código nem compila — os de baixo nunca seriam alcançados.



🏆 Desafio Final — Meu Catálogo de Filmes
Esse é o desafio que junta tudo do módulo num programa só. Não é obrigatório, e não precisa fazer de uma vez.

Construa por partes. Faça um pedaço, rode, confira, e só então siga.

O que o programa faz
Um catálogo onde você cadastra os filmes que assistiu, com nota e gênero, e consegue consultar depois.

A classe
Crie uma classe Filme, em arquivo separado e sem main, com:

titulo (texto)

genero (texto)

nota (decimal)

classificacao (texto)

O menu
O programa mostra o menu e fica rodando até a pessoa escolher sair:

=== MEU CATÁLOGO ===
1 - Cadastrar filme
2 - Listar filmes
3 - Buscar por título
4 - Estatísticas
5 - Sair
Escolha:

O que cada opção faz
1 — Cadastrar

Pede título, gênero e nota. Guarda o gênero em maiúsculo. A classificação o programa define sozinho, a partir da nota:

8 ou mais → Ótimo

5 a 7.9 → Bom

menos de 5 → Ruim

2 — Listar

Mostra todos os filmes cadastrados, um por linha:

Matrix [FICÇÃO] - Nota 9.0 - Ótimo Titanic [DRAMA] - Nota 6.5 - Bom
3 — Buscar por título

Pede um título e mostra os dados daquele filme. A busca deve funcionar mesmo se a pessoa digitar em minúsculo. Se não achar, avisa.

4 — Estatísticas

Mostra:

quantos filmes estão cadastrados

a média das notas, com duas casas decimais

o título do filme com a maior nota

quantos filmes são "Ótimo"

5 — Sair

Mensagem de despedida e encerra.

Qualquer outro número → "Opção inválida"

Regras obrigatórias
Use um array para guardar os filmes (comece com 5 posições)
​2. Use um contador pra saber quantos foram cadastrados de verdade

A classificação é calculada por um método que recebe a nota e devolve o texto

Use printf com duas casas decimais na média e uma na nota

Se a pessoa digitar letra no menu, o programa não pode quebrar — trate a exceção

Não deixe cadastrar mais filmes do que o array comporta

Exemplo de execução
Escolha: 1 Título: Matrix Gênero: ficção Nota (0 a 10): 9 Filme cadastrado! Escolha: 4 Total de filmes: 2 Média das notas: 7.75 Melhor filme: Matrix Filmes ótimos: 1 de 2 Escolha: x Digite apenas números!
Dicas
💡 Comece pelo menu vazio. Faça o while com o switch e cada case só imprimindo "cheguei aqui". Rode. Depois preencha um de cada vez.

💡 Para achar o filme com a maior nota, guarde a posição do melhor, não só a nota. Assim você consegue acessar o título depois.

💡 No laço, use i < total, não i < filmes.length. As posições vazias dariam erro.

💡 Depois do nextInt() do menu, coloque um sc.nextLine() pra limpar. Sem isso, a pergunta do título é pulada.

💡 Dentro do catch também precisa de sc.nextLine(). Sem ele, vira loop infinito.

💡 Criar o array de filmes não cria os filmes automaticamente! Antes de preencher o título e a nota de um filme novo, você precisa instanciá-lo na posição correta (ex: filmes[i] = new Filme();).

Se terminar e quiser ir além
Não deixe cadastrar nota fora do intervalo de 0 a 10

Acrescente uma opção que lista só os filmes de um gênero

Acrescente um atributo assistido (verdadeiro ou falso) e mostre na ficha

Mostre também o pior filme nas estatísticas

Deixe listar os filmes em ordem da maior nota para a menor
 */

import java.util.Scanner;

public class ModuloUm {
// Variáveis e tipos
    static void exercicio1() {
        // Crie variáveis com seu nome, sua idade, sua altura e se você já programou antes. Imprima cada uma.
        String nome = "Ester";
        int idade = 28;
        double altura = 1.70;
        boolean jaProgramou = true;
        String resposta;

        if(jaProgramou != false){
           resposta = "sim";
        }else{
            resposta = "nao";
        }

        System.out.println("Meu nome é " + nome + ", tenho " + idade + " anos, " + altura + " e " + resposta + " já programei antes.");
    }

    static void exercicio2() {
        // Crie uma variável cidade e imprima: "Eu moro em Salvador."
        String cidade = "Salvador";

        System.out.println("Eu moro em " + cidade);
    }

    static void exercicio3() {
        // Crie primeiroNome e sobrenome e imprima o nome completo numa linha só.
        String primeiroNome = "Ester";
        String sobrenome = "Miranda";

        System.out.println("Nome completo: " + primeiroNome + " " + sobrenome);
    }

    static void exercicio4() {
        // Crie uma variável preco com 29.90 e imprima o valor dela numa frase.
        double preco = 29.90;

        System.out.printf("O valor do lanche é de R$%.2f", preco);
    }

    static void exercicio5() {
        // Crie uma variável temCarteira com true e imprima.
        boolean temCarteira = true;

        if(temCarteira == true){
            System.out.println("Tem carteira.");
        }else{
            System.out.println("Não tem carteira.");
        }
    }

    static void desafioUm() {
        //🔥 Mini-desafio — Você tem a = 10 e b = 20. Faça a valer 20 e b valer 10, sem escrever os números 10 e 20 de novo.
        //💡 Se você fizer a = b, o valor antigo de a se perde. Você vai precisar de uma terceira variável pra guardar alguma coisa antes.
        int a = 10;
        int b = 20;
        int auxiliar = a;

        a = b;
        b = auxiliar;

        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }

// Operadores

    static void exercicio6() {
        // Crie a = 15 e b = 4. Imprima a soma, a subtração, a multiplicação, a divisão e o resto.
        int c = 15;
        int d = 4;
        int soma = c + d;
        int subtracao = c - d;
        int multiplicacao = c * d;
        int divisao = c / d;
        int resto = c % d;

        System.out.println("Soma: " + soma + " Subtração: " + subtracao + " Multiplicação: " + multiplicacao + " Divisão: " + divisao + " Resto: " + resto);
    }

    static void exercicio7() {
        // Crie saldo = 1000. Use += para somar 250 e -= para tirar 380. Imprima o saldo final.
        int saldo = 1000;
        saldo += 250;
        saldo -= 380;

        System.out.println(saldo);
    }

    static void exercicio8() {
        // Crie a = 10 e b = 10. Imprima o resultado de a == b, a != b, a > b e a >= b.
        int e = 10;
        int f = 10;

        System.out.println(e == f);
        System.out.println(e != f);
        System.out.println(e > f);
        System.out.println(e < f);
        System.out.println(e >= f);
    }

    static void exercicio9() {
        // Crie idade = 20 e temCarteira = true. Imprima o resultado de idade >= 18 && temCarteira.
        int idadeDeVida = 20;
        boolean temCnh = true;
        System.out.println(idadeDeVida >= 18 && temCnh);
    }

    static void exercicio10() {
        // Crie um número e imprima o resto da divisão dele por 2.
        int numero = 9;
        double restoDoNumero = numero % 2;
        System.out.println(restoDoNumero);
    }

    static void exercicio11() {
        // Calcule e imprima o total de uma compra: 3 pacotes de arroz a R$ 5.50 cada.
        double pacote1 = 5.50;
        double pacote2 = 5.50;
        double pacote3 = 5.50;
        double totalCompra = pacote1 + pacote2 + pacote3;

        System.out.printf("O total da compra: 3 pacotes de arroz R$ %.2f", totalCompra);
    }

    static void desafioDois() {
        //Mini-desafio — Crie uma variável com um número qualquer e, sem usar if, imprima true ou false para a pergunta: esse número é divisível por 3 e por 5 ao mesmo tempo?
        //Uma comparação já produz true ou false sozinha — não precisa de if pra isso. E um número é divisível por outro quando o resto da divisão é zero.
        // OBS: == é igual a; != diferente de; > maior que; < menor que; >= maior ou igual; <= menor ou igual;
        int numeroQualquer = 15;
        System.out.println(numeroQualquer % 3 == 0 && numeroQualquer % 5 == 0);


    }
// Concatenação e printf

    static void exercicio12() {
        // Com seu nome e sua idade em variáveis, imprima: "Ana tem 28 anos."
        String meuNome = "Ester";
        int minhaIdade = 28;
        System.out.printf("%s tem %d anos.", meuNome, minhaIdade);
    }

    static void exercicio13() {
        //Crie nota1 = 8.0 e nota2 = 7.0. Calcule a média e imprima com duas casas decimais.
        double nota1 = 8.0;
        double nota2 = 7.0;
        double mediaNotas = (nota1 + nota2) / 2;
        System.out.printf("Média total das notas: %.2f", mediaNotas);
    }

    static void exercicio14() {
        // Crie uma variável com o preço de um produto e imprima com duas casas decimais.
        double produtoX = 13678.48;
        System.out.printf("O preço do produto X é: %.2f", produtoX);
    }

    static void exercicio15() {
        // Usando printf, imprima numa linha só o nome, a idade e a altura.
        String nomeQualquer = "Assucena";
        int idadeQualquer = 25;
        double alturaQualquer = 1.79;
        System.out.printf("%s tem %d anos e mede %.2f metros.", nomeQualquer, idadeQualquer, alturaQualquer);
    }

    static void desafioTres() {
        // Mini-desafio — Crie variáveis para três produtos (nome e preço) e imprima um recibo. Cada linha deve ter o nome e o preço, e a última linha mostra o total, tudo com duas casas decimais.Crie uma variável total começando em zero, antes dos produtos, e vá somando cada preço nela.

        double total = 0;
        String nomeProduto1 = "Moldura A4";
        double precoProduto1 = 40.49;
        String nomeProduto2 = "Massa Cerâmica Fria 500g";
        double precoProduto2 = 29.90;
        String nomeProduto3 = "Kit Pincéis 12 Unidades";
        double precoProduto3 = 40;
        total += precoProduto1;
        total += precoProduto2;
        total += precoProduto3;

        System.out.printf("_____RECIDO COMPRAS_____\n %s - R$%.2f\n %s - R$%.2f\n %s - R$%.2f\n R$%.2f",
                nomeProduto1, precoProduto1, nomeProduto2, precoProduto2, nomeProduto3, precoProduto3, total);
    }

// Scanner
    static void exercicio16() {
        //Pergunte o nome da pessoa e responda: "Olá, [nome]!"
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nomeScanner = sc.nextLine();
        System.out.println("Olá, " +  nomeScanner);
    }

    static void exercicio17() {
        // Pergunte a idade e responda quantos anos ela vai fazer no próximo aniversário.
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Qual a sua idade?");
        int idadeScanner = sc2.nextInt();
        System.out.println("No seu próximo aniverśario, você fará " + (idadeScanner+1) + " anos!");
    }

    static void exercicio18() {
        // Pergunte dois números e mostre a soma.
        Scanner sc3 = new  Scanner(System.in);
        System.out.println("Digite um número: ");
        double numeroQualquer = sc3.nextDouble();
        System.out.println("Digite um novo número: ");
        double outroNumeroQualquer = sc3.nextDouble();
        double totalDaSoma = numeroQualquer + outroNumeroQualquer;
        System.out.println(totalDaSoma);
    }

    static void exercicio19() {
        // Pergunte a altura e o peso e imprima os dois numa frase.
        Scanner sc4 = new  Scanner(System.in);
        System.out.println("Qual a sua altura? ");
        double alturaQualquer = sc4.nextDouble();
        System.out.println("Qual o seu peso? ");
        double pesoQualquer = sc4.nextDouble();
        System.out.printf("Sua altura e peso, respectivamente são: %.2f, %.2f",  alturaQualquer, pesoQualquer);
    }

    static void desafioQuatro() {
        //Mini-desafio — Faça um programa que peça, nesta ordem: a idade (número), o nome (texto) e a cidade (texto). Depois imprima tudo numa ficha.
        // 💡 Rode primeiro sem nenhum cuidado especial e veja o que acontece com a pergunta do nome. Quando você digita um número e aperta Enter, o nextInt() pega o número e deixa o Enter para trás. O nextLine() seguinte encontra esse Enter e acha que você não digitou nada.
        Scanner sc5 = new  Scanner(System.in);
        System.out.println("Digite a sua idade: ");
        int idadeDeNovo = sc5.nextInt();
        sc5.nextLine();
        System.out.println("Digite o seu nome: ");
        String nomeDeNovo = sc5.nextLine();
        System.out.println("Digite a sua cidade:");
        String cidade = sc5.nextLine();

        System.out.println("Sua idade é " + idadeDeNovo + ", seu nome é " + nomeDeNovo + " e onde vive é em/no " + cidade);

    }

    // Condicionais
    static void exercicio20() {
        //Peça a idade e diga se a pessoa é maior ou menor de idade.
        Scanner sc6 = new  Scanner(System.in);
        System.out.println("Digite sua idade: ");
        int idadeMaisUmaVez = sc6.nextInt();

        if (idadeMaisUmaVez >= 18) {
            System.out.println("Você é maior de idade");
        }else{
            System.out.println("Você é menor");
        }
    }

    static void exercicio21() {
        //Peça um número e diga se ele é par ou ímpar.
        Scanner sc7 = new  Scanner(System.in);
        System.out.println("Digite um número: ");
        int ehPar = sc7.nextInt();

        if(ehPar % 2 == 0){
            System.out.println("É par");
        }else{
            System.out.println("É ímpar");
        }
    }

    static void exercicio22() {
        //Peça uma nota e mostre "Aprovada" (7 ou mais), "Recuperação" (5 a 6.9) ou "Reprovada".
        Scanner sc8 = new  Scanner(System.in);
        System.out.println("Digite a nota: ");
        double nota = sc8.nextDouble();
        if(nota >= 7){
            System.out.println("Aprovada!");
        }else if(nota <= 6.9 && nota >= 5){
            System.out.println("Recuperação!");
        }else{
            System.out.println("Reprovado!");
        }
    }

    static void exercicio23() {
        //Peça um número de 1 a 3 e, usando switch, mostre um sabor de sorvete pra cada opção.
        Scanner sc9 = new  Scanner(System.in);
        System.out.println("Digite de 1 a 3 para escolher um sabor de sorvete:");
        int opcao = sc9.nextInt();
        switch (opcao){
            case 1:
                System.out.println("Baunilha");
                break;
            case 2:
                System.out.println("Morango");
            break;
            case 3:
                System.out.println("Chocolate");
                break;
            default:
                System.out.println("Opção inválida.");
        }
    }

    static void desafioCinco() {
        //Mini-desafio — Peça os três lados de um triângulo e classifique: todos iguais → Equilátero; dois iguais → Isósceles; todos diferentes → Escaleno.
        //A ordem dos testes importa. Repare que um triângulo equilátero também tem dois lados iguais — então, se o teste do isósceles vier primeiro, nenhum equilátero vai ser encontrado.
        Scanner sc10 = new Scanner(System.in);

        System.out.println("Digite o primeiro lado:");
        double lado1 = sc10.nextDouble();

        System.out.println("Digite o segundo lado:");
        double lado2 = sc10.nextDouble();

        System.out.println("Digite o terceiro lado:");
        double lado3 = sc10.nextDouble();

        if (lado1 <= 0 || lado2 <= 0 || lado3 <= 0 ||
                lado1 + lado2 <= lado3 ||
                lado1 + lado3 <= lado2 ||
                lado2 + lado3 <= lado1) {

            System.out.println("Os lados não formam um triângulo.");

        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("Triângulo Equilátero");

        } else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3) {
            System.out.println("Triângulo Isósceles");

        } else {
            System.out.println("Triângulo Escaleno");
        }
    }

// Loops
    static void exercicio24() {
        //Imprima os números de 1 a 20, um por linha.
        for (int i = 1; i <= 20; i++){
            System.out.println(i);
        }
    }

    static void exercicio25() {
        //Imprima a contagem regressiva de 10 até 1 e depois "Fim!"
        for (int i = 10; i >= 1; i--){
            System.out.println(i);
        }
        System.out.println("Fim!");
    }

    static void exercicio26() {
        // Peça um número e mostre a tabuada dele de 1 a 10.
        int tabuada = 5;
        for(int i = 1; i <= 10; i++){
            System.out.println(tabuada * i);
        }
    }

    static void exercicio27() {
        // Imprima só os números pares de 1 a 30.
        for(int i = 2; i <= 30; i += 2)
            System.out.println(i);
    }

    static void exercicio28() {
        //Usando for, some todos os números de 1 a 100 e mostre o resultado.
        int soma = 0;
        for(int i = 1; i <= 100; i++){
            System.out.println(soma += i);
        }
    }

    static void exercicio29() {
        // Refaça o primeiro exercício com while. Compare os dois códigos.
        int numero = 1;
        while(numero <= 20){
            System.out.println(numero);
            numero++;
        }
    }

    static void exercicio30() {
        //Crie energia = 3. Usando do while, imprima "Jogando..." e diminua 1 enquanto for maior que 0.
        int energia = 3;
        do{
            System.out.println("Jogando....");
            energia--;
        }while(energia > 0);
    }

    static void desafioSeis() {
        //Mini-desafio — Peça um número e desenhe um triângulo de asteriscos com essa altura:
        //Digite a altura: 5 * ** *** **** *****
        //Você vai precisar de um laço dentro do outro. O de fora controla a linha; o de dentro imprime os asteriscos daquela linha. Repare que a quantidade de asteriscos muda conforme a linha.
        Scanner sc11 = new Scanner(System.in);
        System.out.println("Digite o número 5 para formar um triângulo:");
        int numeroTriangulo = sc11.nextInt();
                for(int i = 1; i <= numeroTriangulo; i++){
                    for(int j = 1; j <= i; j++){
                        System.out.print("*");
                    }
                    System.out.println();
                }
    }

    // Arrays

    static void exercicio31() {
        // Crie um array com 5 nomes. Imprima o primeiro, o terceiro e o último.
        String[] nomes = {"Ester", "Tainara", "Ariel", "Ingrid", "Mariane"};
        System.out.println(nomes[0] + " " + nomes[2] + " " + nomes[4]);
    }

    static void exercicio32() {
        // Crie um array com as notas {8, 6, 10, 7, 9} e imprima todas usando um laço.
        int[] notas = {8, 6, 10, 7, 9};
        for(int i = 0; i < notas.length; i++){
            System.out.println(notas[i]);
        }
        // exercicio 33: Com o mesmo array, calcule e imprima a soma e a média.
        int soma = 0;
        for(int i = 0; i < notas.length; i++){
            soma += notas[i];
        }
        double medias = soma / notas.length;
        System.out.println("Média: " + medias);
        System.out.println("Soma: " + soma);
    }

    static void exercicio34() {
        // Crie um array com 5 números e descubra qual é o maior.
        int[] numeros = {1, 2, 3, 4, 5};
        int maior = numeros[0];
        for(int i = 0; i < numeros.length; i++){
            if(numeros[i] > maior){
                maior = numeros[i];
            }
        }
        System.out.println(maior);
    }

    static void exercicio35() {
        // Com {8, 5, 10, 4, 7}, conte quantas notas são maiores ou iguais a 7.
        int[] numbers = {8, 5, 10, 4, 7};
        int contador = 0;
        int maiorOuIgual = numbers[4];
        for(int i = 0; i < numbers.length; i++){
            if(numbers[i] >= maiorOuIgual) {
                contador++;
            }
        }
        System.out.println(contador);
    }

    static void desafioSete() {
        //Mini-desafio — Crie um array com 5 nomes. Peça um nome pra pessoa e diga em qual posição ele está. Se não estiver na lista, avise.
        // Crie uma variável valendo -1 antes do laço — ela significa "ainda não encontrei". Se achar, guarde a posição nela. Depois do laço, se ela ainda valer -1, é porque não estava na lista.
        String[] buscaNomes = {"Alice", "Joanna", "Iza", "Emiliana", "Jussara"};
        Scanner sc12 = new Scanner(System.in);
        System.out.println("Digite um nome para buscar no array: ");
        String buscaNome = sc12.nextLine();
        int posicao = -1;

        for(int i = 0; i < buscaNomes.length; i++){
            if(buscaNome.equals(buscaNomes[i])){
                posicao = i;
            }
        }
        if(posicao == -1){
            System.out.println("Nome não encontrado.");
        }else{
            System.out.println("Nome encontrado: " + buscaNomes[posicao]);
        }
    }

// Strings
    static void exercicio36() {
        // Peça o nome completo e mostre quantas letras ele tem.
        Scanner sc13 = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        String nomeCompleto = sc13.nextLine();
        System.out.println("O nome possui " + nomeCompleto.length() + " letras");
    }

    static void exercicio37() {
        // Peça o nome e mostre em MAIÚSCULO e em minúsculo.
        Scanner sc14 = new Scanner(System.in);
        System.out.println("Digite uma palavra qualquer: ");
        String palavraQualquer = sc14.nextLine();
        System.out.println(palavraQualquer.toUpperCase() + " " + palavraQualquer.toLowerCase());
    }

    static void exercicio38() {
        // Peça o nome e mostre a primeira letra.
        Scanner sc15 = new Scanner(System.in);
        System.out.println("Escreva uma palavra: ");
        String palavra = sc15.nextLine();
        System.out.println(palavra.charAt(0));
    }

    static void exercicio39() {
        // Peça uma frase e uma palavra. Diga se a palavra aparece na frase.
        Scanner sc16 = new Scanner(System.in);
        System.out.println("Escreva uma frase: ");
        String frase = sc16.nextLine();
        System.out.println("Escreva uma palavra para vermos se está na frase: ");
        String palavraVermos = sc16.nextLine();
        System.out.println(frase.contains(palavraVermos));
    }

    static void exercicio40() {
        // Peça o nome duas vezes e diga se os dois são iguais, ignorando maiúsculas.
        Scanner sc17 = new Scanner(System.in);
        System.out.println("Digite um nome ou palavra: ");
        String palavra = sc17.nextLine();
        System.out.println("Digite um nome ou palavra novamamente, podendo ser igual ou não: ");
        String palavraNovamente = sc17.nextLine();
        System.out.println(palavra.equalsIgnoreCase(palavraNovamente));
    }

    static void exercicio41() {
        // Peça um nome e mostre em maiúsculo, sem espaços nas pontas (dois métodos encadeados).
        Scanner sc18 = new Scanner(System.in);
        System.out.println("Digite um nome ou palavra: ");
        String nomeOuPalavra = sc18.nextLine();
        System.out.println(nomeOuPalavra.toUpperCase().trim());
    }

    static void desafioOito() {
        //Mini-desafio — Peça uma palavra e diga se ela começa e termina com a mesma letra, ignorando maiúscula e minúscula.
        //Exemplos: ana → sim · Ovo → sim · casa → não
        //A primeira letra está na posição 0. A última está na posição length() - 1, porque a contagem começa no zero. E pra ignorar maiúscula, converta a palavra inteira antes de comparar.
        Scanner sc19 = new Scanner(System.in);
        System.out.println("Digite uma palavra ou nome: ");
        String palavraOuNome = sc19.nextLine();
        palavraOuNome = palavraOuNome.toLowerCase();
        char primeiraLetra = palavraOuNome.charAt(0);
        char ultimaLetra = palavraOuNome.charAt(palavraOuNome.length() - 1);
        if(primeiraLetra == ultimaLetra){
            System.out.println("Começa e termina com a mesma letra");
        }else {
            System.out.println("Não começa e nem termina com a mesma letra");
        }
    }

   // Classes e objeto
    static void exercicio42() {
        //Crie uma classe Pet com nome, raca e peso. Em outra classe, crie um objeto, preencha e imprima tudo.
        Pet meuPet = new Pet();

        meuPet.nome = "Maylon";
        meuPet.raca = "Poodle";
        meuPet.peso = (double) 1.50;

        System.out.println(meuPet.nome + " " + meuPet.raca + " " + meuPet.peso);
        // exercicio43: Continuando, crie dois pets diferentes e imprima as duas fichas.
        Pet segundoPet = new Pet();

        segundoPet.nome = "Thor";
        segundoPet.raca = "Shitzu";
        segundoPet.peso = (double) 2.50;

        System.out.println(segundoPet.nome + " " +  segundoPet.raca + " " + segundoPet.peso);
    }

    static void exercicio44() {
        // Crie uma classe Produto com nome, preco e quantidade. Imprima o valor total em estoque.
        Produto produto = new Produto();
        produto.nomeProduto = "Mouse";
        produto.precoProduto = (double) 79.90;
        produto.qntdProduto = 95;
        double valorEstoque = produto.precoProduto *  produto.qntdProduto;

        System.out.printf("Valor do estoque de %s: R$%.2f", produto.nomeProduto, valorEstoque);
    }

    static void exercicio45() {
        // Crie uma classe Aluna com nome, nota1, nota2 e media. Calcule a média e imprima a ficha.
        Aluna aluna = new  Aluna();
        aluna.nomeAluna = "Jurema";
        aluna.nota1 = 4.5;
        aluna.nota2 = 8.5;
        aluna.media = (aluna.nota1 + aluna.nota2) / 2;

        System.out.printf("Aluna %s Nota: %.2f", aluna.nomeAluna, aluna.media);
    }

    //Mini-desafio — Crie uma classe Jogadora com nome e pontos. Crie três jogadoras com pontuações diferentes e descubra qual tem a maior pontuação. Imprima o nome dela.
    //Compare os atributos pontos de cada objeto, igual você compararia números comuns. Guarde numa variável o nome da jogadora com a maior pontuação encontrada até agora.

    static void desafioNove() {
        Jogadora jogadoraUm = new Jogadora();
        jogadoraUm.nomeJogadora = "Daiane dos Santos";
        jogadoraUm.pontosJogadora = 10;

        Jogadora jogadoraDois = new Jogadora();
        jogadoraDois.nomeJogadora = "Rebeca Andrade";
        jogadoraDois.pontosJogadora = 9.9;

        Jogadora jogadoraTres = new Jogadora();
        jogadoraTres.nomeJogadora = "Flávia Saraiva";
        jogadoraTres.pontosJogadora = 9.8;

        double maiorPontuacao = jogadoraUm.pontosJogadora;
        String nomeVencedora = jogadoraUm.nomeJogadora;

        if(jogadoraDois.pontosJogadora > maiorPontuacao) {
            maiorPontuacao = jogadoraDois.pontosJogadora;
            nomeVencedora = jogadoraDois.nomeJogadora;
        }
        if (jogadoraTres.pontosJogadora > maiorPontuacao) {
            maiorPontuacao = jogadoraTres.pontosJogadora;
            nomeVencedora = jogadoraTres.nomeJogadora;
        }
        System.out.printf("A jogadora campeã é: %s com nota %.1f", nomeVencedora, maiorPontuacao);
    }

    /*
    10-Métodos
💡 Lembrete: se for criar e chamar os métodos dentro do mesmo arquivo onde está o main, não esqueça de colocar a palavra static antes deles (ex: static void mostrarBoasVindas()).
Crie dois métodos somar: um que recebe dois números e outro que recebe três.

🔥 Mini-desafio — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. Depois crie outro método, liberarEntrada(int idade), que chama o primeiro e imprime se a pessoa pode entrar ou não. No main, chame apenas o segundo.

💡 Um método pode chamar outro normalmente, basta escrever o nome dele. E como o primeiro devolve true ou false, esse resultado pode ir direto dentro de um if.
     */
    static void mostrarBoasVindas() {
        //exercicio 46: Crie um método mostrarBoasVindas() que imprime uma mensagem. Chame no main.
        System.out.println("Boas vindas!");
    }

    static void saudacao(String nome) {
        //exercicio 47: Crie saudacao(String nome) que imprime "Olá, [nome]!". Chame três vezes com nomes diferentes.
        System.out.println("Olá, " + nome);
    }

    static int dobro(int numero) {
        //exercicio 47: Crie dobro(int numero) que devolve o dobro. Mostre o resultado no main.
        numero = numero * 2;
        return numero;
    }
    static double calcularMedia(double n1, double n2){
        //exercicio 48: Crie calcularMedia(double n1, double n2) que devolve a média. Mostre com duas casas decimais.
        n1 = n1 + n2;
        n2 = n1 / 2;
        return n2;
    }

    static boolean ehPar(int numero) {
        //exercicio 49: Crie ehPar(int numero) que devolve true ou false. Use o retorno dentro de um if.
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    static void main() {
        if (ehPar(4)) {
            System.out.println("É par");
        } else {
            System.out.println("É ímpar");
        }
    }

}
