# Projeto Petshop — Lista de Atividades


Essa lista é um sistema que vai crescendo.

Cada questão parte de onde a anterior parou. No final você vai ter um programa completo, que usa tudo que a gente viu até agora.

Se travar em alguma questão, não tente adivinhar. Leia a mensagem de erro com calma, ela quase sempre diz exatamente o que está faltando.

E se não entender a mensagem, copia ela e pergunta: no canal, pra mim, ou pro Gemini pedindo pra explicar como se você tivesse 10 anos.

Use IA apenas depois de tentar fazer a questão algumas vezes e ler cada frase com calma, escrevendo o código frase a frase.


**Como fazer:**


- Crie um package petshop e trabalhe sempre dentro dele. Não apague nada entre uma questão e outra.
- Faça uma questão por vez. Escreva, rode, compare com a saída esperada, e só então vá pra próxima.


**Cada questão tem:**


O que fazer: as instruções

**Saída esperada: pra você conferir sozinha se acertou**


**Referência: a sintaxe do assunto, pra consulta**


A referência mostra um exemplo de como a estrutura se escreve.

Não precisa terminar tudo. Vá até onde der e estude o que não der.



## Questão 1 — A primeira ficha


Crie a classe Petshop com o main e imprima a ficha de um pet com dados fixos guardados em variáveis:

- nome
- espécie
- peso

O peso deve sair com uma casa decimal.


**Saída esperada:**


=== FICHA DO PET ===
Nome: Mel
Espécie: Cachorro
Peso: 8.5 kg

Dica: se aparecer 8,5 em vez de 8.5, está certo. É o seu computador configurado em português.


**Referência:**


\n pula linha
```java
String texto = "valor";
double numero = 1.5;
System.out.println("Rótulo: " + texto);
System.out.printf("Rótulo: %.1f unidade\n", numero);
```



## Questão 2 — Perguntando os dados


Agora, ao invés de dados fixos, peça ao usuário:

- nome
- espécie
- peso


**Saída esperada:**


Nome do pet: Mel
Espécie: Cachorro
Peso (kg): 8.5

=== FICHA DO PET ===
Nome: Mel
Espécie: Cachorro
Peso: 8.5 kg

Dica: se der erro ao digitar o peso com ponto (8.5), digite com vírgula (8,5).


**Referência:**


```java
import java.util.Scanner;
```

```java
Scanner sc = new Scanner(System.in);
```

```java
System.out.print("Pergunta: ");
String texto = sc.nextLine();
```

```java
System.out.print("Pergunta: ");
double numero = sc.nextDouble();
```

Se depois de ler um número você for ler um texto, o programa pula a pergunta. Lembram do bug do nextLine? Um sc.nextLine() sozinho resolve.



## Questão 3 — O porte do pet


Antes de mostrar a ficha, descubra o porte do pet pelo peso e acrescente essa informação na ficha:

menos de 10 kg → Pequeno
de 10 a menos de 25 kg → Médio
25 kg ou mais → Grande

Teste com 5, com 15 e com 30.


**Saída esperada (com peso 8.5):**


=== FICHA DO PET ===
Nome: Mel
Espécie: Cachorro
Peso: 8.5 kg
Porte: Pequeno


**Referência:**


```java
if (condicao) {
    ...
} else if (outraCondicao) {
    ...
} else {
    ...
}
```



## Questão 4 — Juntando tudo num objeto


Agora são quatro informações sobre o mesmo pet, em quatro variáveis soltas.

Crie a classe Pet com os atributos nome, especie, peso e porte. Essa classe não tem main, ela não roda sozinha.

No Petshop, substitua as variáveis soltas pelos atributos do objeto. A saída continua idêntica.


**Saída esperada: a mesma da questão 3.**



**Referência:**


```java
// nova classe
public class Exemplo {
    String atributo;
    double outroAtributo;
}
```

```java
// no main
Exemplo umExemplo = new Exemplo();
umExemplo.atributo = "valor";
System.out.println(umExemplo.atributo);
```



## Questão 5 — Tirando o porte do main


O main está ficando grande. Tire o cálculo do porte de lá.

Crie um método definirPorte dentro da classe Pet que olha o peso do próprio pet e devolve o porte. Como o método está dentro da classe, ele enxerga os atributos direto. Não precisa receber nada.

No main, todo aquele if vira uma linha só:

```java
meuPet.porte = meuPet.definirPorte();
```

Atenção: preencha o peso antes de chamar o método. Senão ele calcula o porte de um peso que ainda não existe.


**Saída esperada: a mesma.**



**Referência:**


```java
String nomeDoMetodo() {
    if (atributo < 10) {
```
        return "primeiro valor";
```java
    } else if (atributo < 25) {
```
        return "segundo valor";
```java
    } else {
```
        return "terceiro valor";
```java
    }
}
```



## Questão 6 — Vários pets


Crie um array do tipo Pet com espaço pra 5 pets e guarde o pet já cadastrado na primeira posição.

Depois imprima os dados dele pegando direto do array, pela posição.

Dica: o tipo do array, ao invés de ser String ou int, será a sua classe Pet. Não muda nada do que vocês já usam: um array de String também é um array de uma classe. Ao invés de int[] ou String[], é Pet[].


**Saída esperada:**


--- PETS CADASTRADOS ---
Mel (Cachorro) - 8.5 kg - Porte Pequeno



**Referência:**

Como criar um array do tipo de um objeto? Como mostrar um atributo dele?

```java
Oftalmologista[] lista = new Oftalmologista[5]; // criei um array do tipo de uma classe
Oftalmologista ana = new Oftalmologista();      // instanciei um objeto dessa classe
```

```java
ana.nome = "Ana";   // a classe Oftalmologista tem o atributo nome. Preenchi ele no objeto ana
lista[0] = ana;     // guardei o objeto ana na posição 0 do array
```

```java
System.out.println(lista[0].nome); // mostrei o atributo nome do objeto que está na posição 0
```



## Questão 7 — O menu


Deixe o programa rodando até a pessoa escolher sair.

Faça um menu com duas opções: cadastrar pet e sair. Use while pra repetir e switch pra tratar a escolha. Mova o cadastro pra dentro do case.

A opção de sair é sempre o 0. Assim, por mais opções que você acrescente depois, o sair nunca muda de número.

Agora que dá pra cadastrar vários, cada pet novo precisa ir pra uma posição diferente do array. Crie uma variável que conte quantos já foram cadastrados e use ela como posição. Depois de guardar, some 1 nela.

No fim de cada cadastro, avise quantos pets existem.

Dica: cada vez que você cadastrar um novo pet, a variável deve somar (incrementar) mais um: total++

Dica: a variável opcao começa valendo -1. Se começasse em 0, o while (opcao != 0) nem entraria na primeira vez.


**Saída esperada:**


=== PETSHOP ===
1 - Cadastrar pet
0 - Sair
Escolha: 1
```java
...
```
Pet cadastrado! Agora são 1 pet(s).

=== PETSHOP ===
1 - Cadastrar pet
0 - Sair
Escolha: 1
```java
...
```
Pet cadastrado! Agora são 2 pet(s).

=== PETSHOP ===
1 - Cadastrar pet
0 - Sair
Escolha: 0
Até logo!


**Referência:**


```java
int opcao = -1;
int total = 0;
```

```java
while (opcao != 0) {
    // mostra o menu
    System.out.print("Escolha: ");
```
    opcao = sc.nextInt();
    sc.nextLine();

```java
    switch (opcao) {
        case 1:
            ...
            lista[total] = objeto;
```
            total++;
```java
            break;
        case 0:
            ...
            break;
        default:
            System.out.println("Opção inválida.");
    }
}
```

Dica: O sc.nextLine() depois do nextInt() é obrigatório. Sem ele, a pergunta do nome é pulada.

Dica: O break sai só do switch, não do while. Quem encerra o programa é a condição do while quando opcao vale 0.



## Questão 8 — Listando os pets


Acrescente uma opção no menu que mostra todos os pets cadastrados.

Percorra o array com for, indo só até o total de pets cadastrados (não até o tamanho do array, senão você tenta ler posições vazias).

Se ainda não tiver nenhum pet, avise.


**Saída esperada:**


=== PETSHOP ===
1 - Cadastrar pet
2 - Listar pets
0 - Sair
Escolha: 2

--- PETS CADASTRADOS ---
Mel (Cachorro) - 8.5 kg - Porte Pequeno
Thor (Gato) - 4.0 kg - Porte Pequeno



**Caso nenhum pet:**


Nenhum pet cadastrado.


**Referência:**


```java
for (int i = 0; i < total; i++) {
    System.out.println(lista[i].atributo + " - " + lista[i].outroAtributo);
}
```



## Questão 9 — Buscar pelo nome


Acrescente uma opção no menu que pergunta um nome e procura esse pet na lista.

A busca deve ignorar maiúsculas e minúsculas. Se achar, mostra os dados. Se não achar, avisa.

Teste buscando com letra minúscula.


**Saída esperada:**


Qual pet você procura? mel
Encontrado: Mel (Cachorro) - 8.5 kg

Qual pet você procura? zeca
Pet não encontrado.


**Referência:**


boolean achou = false;

```java
for (int i = 0; i < total; i++) {
    if (lista[i].atributo.equalsIgnoreCase(busca)) {
        // mostra
```
        achou = true;
```java
    }
}
```

```java
if (!achou) {
    System.out.println("Não encontrado.");
}
```



## Questão 10 — Trate erros do menu


Se alguém digitar uma letra onde o programa espera um número, ele quebra.

Proteja a leitura da opção do menu com try / catch. O programa deve avisar e continuar funcionando.

Teste digitando uma letra no menu.

Dica: faça o erro acontecer e copie o nome do erro que aparecer pra dentro do catch.

Dica: o switch vai dentro do try, junto com a leitura. Assim, se a leitura der erro, o switch nem roda.


**Saída esperada:**


Escolha: abc
Digite apenas números!

=== PETSHOP ===
1 - Cadastrar pet
```java
...
```


**Referência:**


```java
import java.util.NomeDoSeuErro;
```

```java
while (opcao != 0) {
    // mostra o menu
```
    try {
        opcao = sc.nextInt();
        sc.nextLine();

```java
        switch (opcao) {
            ...
        }
    } catch (NomeDoSeuErro e) {
        System.out.println("Mensagem de aviso");
```
        sc.nextLine();
```java
    }
}
```

Dica: O sc.nextLine() dentro do catch é essencial. Sem ele vira loop infinito: o nextInt() tenta ler a mesma letra pra sempre.



## Questão 11 — Quantas espécies diferentes


Acrescente uma opção que mostra quais espécies estão cadastradas, sem repetir.

Percorra os pets guardando a espécie de cada um num HashSet, e depois mostre o conteúdo dele com for-each. Mostre também quantas espécies diferentes existem.

Cadastre dois cachorros e um gato antes de testar.


**Saída esperada:**


--- ESPÉCIES CADASTRADAS ---
- Gato
- Cachorro
  Total de espécies diferentes: 2

Dica: usamos o HashSet pra que cada espécie só seja contada uma vez. O HashSet descarta valores repetidos.

Dica: o HashSet não guarda ordem. Se aparecer Cachorro antes de Gato, também está certo.

Dica: pro HashSet, "cachorro" e "Cachorro" são textos diferentes. Cadastre sempre do mesmo jeito pra testar.


**Referência:**


```java
import java.util.HashSet;
```

```java
HashSet<String> conjuntos = new HashSet<>(); // criei um HashSet
```

```java
for (int i = 0; i < total; i++) {
    conjuntos.add(lista[i].nome); // adicionei no HashSet só o atributo nome dos objetos do array
}
```

```java
for (String conjunto : conjuntos) {
    System.out.println(conjunto);
}
```

```java
System.out.println(conjuntos.size());
```



## Questão 12 — A fila de banho


Acrescente duas opções no menu: entrar na fila de banho e atender o próximo.

A fila guarda nomes. Quem entra primeiro é atendido primeiro. Ao atender, mostre quem está sendo atendido e como ficou a fila.

Antes de atender, verifique se a fila não está vazia.


**Saída esperada:**


Nome do pet pra entrar na fila: Mel
Mel entrou na fila.
Fila agora: [Mel]

Nome do pet pra entrar na fila: Thor
Thor entrou na fila.
Fila agora: [Mel, Thor]

Próximo da fila: Mel
Atendendo Mel...
Fila agora: [Thor]


**Referência:**


```java
import java.util.ArrayDeque;
```

```java
ArrayDeque<String> fila = new ArrayDeque<>();
```

```java
fila.add("valor");   // entra no fim
fila.peek();         // olha o primeiro, sem tirar
fila.poll();         // tira o primeiro e devolve
fila.isEmpty();      // diz se está vazia
```

Dica: peek e poll numa fila vazia devolvem null sem dar erro. Por isso o isEmpty() vem antes.



## Questão 13 — Os serviços do petshop


O petshop oferece banho, tosa e consulta. Cada um faz uma coisa diferente, mas todos são um serviço que pode ser executado.

Crie uma interface Servico com um método executar que recebe o nome do pet.

Crie três classes, Banho, Tosa e Consulta, que implementam ela, cada uma imprimindo uma mensagem diferente.

Acrescente uma opção no menu que pergunta o nome de um pet e executa os três serviços nele. Guarde os três serviços num ArrayList do tipo Servico e percorra com for-each.


**Saída esperada:**


Nome do pet: Mel
Dando banho em Mel...
Tosando Mel...
Levando Mel para a consulta...


**Referência:**


```java
// arquivo Contrato.java
```
package petshop;

```java
public interface Contrato {
```
    void metodo(String parametro);
```java
}
```

```java
// no Petshop
import java.util.ArrayList;
```

```java
ArrayList<Contrato> lista = new ArrayList<>();
```
lista.add(new Implementacao());
lista.add(new OutraImplementacao());

```java
for (Contrato item : lista) {
```
    item.metodo("valor");
```java
}
```

Dica: os métodos que vierem da interface precisam ser public nas classes.

Dica: o ArrayList é do tipo da interface, mas guarda objetos das classes que implementam ela.



## Questão 14 — Cachorro e gato


Todo pet tem nome, espécie, peso e porte. Mas cachorro e gato fazem sons diferentes.

Acrescente na classe Pet um método emitirSom() que imprime algo genérico.

Crie as classes Cachorro e Gato, filhas de Pet, cada uma sobrescrevendo o emitirSom() com o som dela. A mensagem deve incluir o nome do pet. Use @Override.

No cadastro, em vez de sempre criar um Pet, escolha a classe de acordo com a espécie que a pessoa digitou. Se não for nem cachorro nem gato, cria um Pet mesmo.

Dica: use equalsIgnoreCase pra comparar a espécie, igual na busca.


**Saída esperada: nenhuma ainda. Por enquanto o programa só precisa continuar rodando igual.**



**Referência:**


```java
public class Filha extends Mae {
    @Override
```
    void metodoDaMae() {
```java
        ...
    }
}
```

--------------------------------------------

```java
Mae variavel;
```

```java
if (condicao) {
    variavel = new Filha();
} else if (condicao) {
    variavel = new OutraFilha();
} else {
    variavel = new Mae();
}
```

variavel.atributoDaMae = "valor";

Dica: as filhas usam o nome sem declarar esse atributo. Ele veio da mãe.

Dica: repare que a variável é do tipo da mãe, mas o objeto pode ser de uma filha. O array continua sendo de Pet e aceita os três.



## Questão 15 — Cada um responde do seu jeito


Na opção de listar pets, chame o emitirSom() de cada um, logo depois de mostrar os dados.

Cadastre um cachorro e um gato antes de testar.


**Saída esperada:**


--- PETS CADASTRADOS ---
Mel (Cachorro) - 8.5 kg - Porte Pequeno
Mel faz: Au au!
Thor (Gato) - 4.0 kg - Porte Pequeno
Thor faz: Miau!


**Referência: nada novo. É o laço da questão 8, chamando o método.**




## Questão 16 — Duas fichas, um nome só


Crie dois métodos com o mesmo nome na classe Petshop, fora do main:

- um que recebe só o pet e mostra apenas o nome
- um que recebe o pet e um título, e mostra o título seguido da ficha completa

Chame os dois e veja o Java escolher.


**Saída esperada:**


Nome: Mel
---
=== FICHA DO PET ===
Nome: Mel
Espécie: Cachorro
Peso: 8.5 kg
Porte: Pequeno


**Referência:**


```java
static void mesmoNome(Coisa c) {
    ...
}
```

```java
static void mesmoNome(Coisa c, String texto) {
    ...
}
```

Dica: mesmo nome, quantidades diferentes de parâmetro. O Java escolhe pelo que você passou. Isso é SOBRECARGA.




## Conteúdos praticados


Você construiu um sistema completo usando:

- [x] Variáveis, tipos e printf
- [x] Scanner
- [x] Condicionais (if e switch)
- [x] Loops (while e for)
- [x] Arrays
- [x] Strings e seus métodos
- [x] Classes e objetos
- [x] Métodos com parâmetro e retorno
- [x] Tratamento de exceções
- [x] for-each
- [x] Set (sem repetidos)
- [x] Queue (fila)
- [x] ArrayList
- [x] Interface e implements
- [x] Herança e extends
- [x] @Override
- [x] Polimorfismo e sobrecarga



## Desafios extras


- [ ] Não deixe cadastrar mais pets do que o array comporta. Avise "Cadastro cheio!"
- [ ] Acrescente uma opção que mostra quantos pets estão cadastrados.
- [ ] Crie uma classe Vacina que também implementa Servico e coloque ela na lista de serviços. Repare quantas linhas do código antigo você precisou mudar.
- [ ] Acrescente um método só na classe Cachorro, tipo buscarBolinha(). Depois tente chamar ele a partir do array de pets. Leia o erro com atenção e pense no porquê.
- [ ] Acrescente uma opção que mostra só os pets de um porte específico.
- [ ] Acrescente uma opção "atender todos" que esvazia a fila de banho de uma vez.
- [ ] Faça "cachorro" e "Cachorro" contarem como a mesma espécie na questão 11.
- [ ] Troque o array de pets por um ArrayList<Pet>. O que ficou mais simples?