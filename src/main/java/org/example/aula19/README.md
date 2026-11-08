1.(Cenário Real) A equipe mexeu na classe CalculadoraFrete para adicionar entrega por Drone, mas sem querer estragou o cálculo antigo do Sedex. Qual é a principal vantagem de ter Testes Unitários nesse momento?
A) O teste unitário corrige o código do Sedex sozinho usando Inteligência Artificial.
B) O teste apita Vermelho imediatamente na máquina da programadora antes de o bug ir para o cliente (evitando regressão).
C) O teste substitui a necessidade de usar interfaces e princípios S.O.L.I.D. no projeto.
D) O teste deixa o banco de dados do sistema duas vezes mais rápido.

LETRA B

2. Olhando para a Pirâmide de Testes, por que os Testes Unitários ficam na base (representando cerca de 70% dos testes de uma empresa)?
   A) Porque eles testam a tela inteira clicando nos botões como um humano.
   B) Porque eles exigem que o banco de dados oficial esteja ligado.
   C) Porque eles testam pequenas partes isoladas do código, rodando em milissegundos e sendo muito mais baratos e fáceis de manter.
   D) Porque são feitos manualmente usando System.out.println no main.

LETRA C

   /Quiz Rápido: Vamos testar o conhecimento? (2/3)/
3. No JUnit 5, nós organizamos nosso método de teste seguindo o padrão AAA (Arrange, Act, Assert). O que fazemos na etapa "Assert"?
   A) Damos new na classe que queremos testar e preparamos as variáveis.
   B) Usamos os comandos do JUnit (como assertEquals ou assertTrue) para verificar se o resultado obtido bateu com o esperado.
   C) Apagamos os dados do banco de dados após o teste terminar.
   D) Imprimimos o resultado no console com System.out.println para conferir no olho.

LETRA B


4. Qual comando do JUnit 5 você deve usar para garantir que o método conta.sacar(-50.0) bloqueia a operação lançando uma exceção (IllegalArgumentException)?
   A) assertEquals(-50.0, conta.sacar(-50.0));
   B) assertFalse(conta.sacar(-50.0));
   C) assertNull(conta.sacar(-50.0));
   D) assertThrows(IllegalArgumentException.class, () -> conta.sacar(-50.0));

LETRA D

   /Quiz Rápido: Vamos testar o conhecimento? (3/3)/
5. No TDD (Test-Driven Development), trabalhamos no ciclo Red ➡️ Green ➡️ Refactor. O que significa a etapa "GREEN" (Verde)?
   A) Escrever o teste primeiro e ver ele falhar porque a classe ainda não existe.
   B) Escrever o código mais simples e direto possível na classe principal apenas para fazer o teste passar e ficar verde.
   C) Limpar o código, tirar repetições e aplicar boas práticas sem alterar o resultado.
   D) Enviar o código direto para o servidor de produção sem testar.

LETRA B

6. Responda:Na sinceridade: Por que testar o sistema apenas dando System.out.println() dentro do método main ("teste no olho") não funciona quando o projeto cresce na empresa?

PQ NÃO TEM GARANTIA QUE TODOS OS CENÁRIOS FORAM TESTADOS, ALÉM DE TER FALHA HUMANA E DEMANDAR MUITO TEMPO.

Detetive de Código: Uma colega escreveu um método de teste perfeito com assertEquals, clicou para rodar a classe de teste, mas o JUnit ignorou o método dela completamente! Qual anotação ela esqueceu de colocar em cima do método?

@TEST

Refatoração sem medo: No ciclo do TDD, por que a gente só faz o Refactor (deixar o código bonito e limpo) depois que o teste já ficou Verde?

PQ É PRECISO GARANTIR PRIMEIRO QUE O CÓDIGO FUNCIONE.

/Atividade Prática: Meu Primeiro TDD com JUnit 5/
Mão na massa: A Calculadora de Descontos
Vamos desenvolver uma classe CalculadoraDesconto usando os 3 passos (AAA) do JUnit!

Regras de Negócio que nossa classe deve ter:
Método aplicarDesconto(double valorCompra, boolean clienteVip):
Se a compra for menor que R$ 100,00 e o cliente não for VIP, não tem desconto (retorna o próprio valorCompra).
Se o cliente for VIP, ganha 10% de desconto em qualquer valor (multiplica por 0.90).
Se o valorCompra passado for zero ou negativo (<= 0), deve lançar um erro: IllegalArgumentException.


Sua Missão na classe CalculadoraDescontoTest:Teste 1 (@Test): Prepare uma compra de R$ 50.0 para cliente comum (false) e use assertEquals para garantir que retorna 50.0.Teste 2 (@Test): Prepare uma compra de R$ 200.0 para cliente VIP (true) e use assertEquals para garantir que retorna 180.0.Teste 3 (@Test): Use assertThrows para garantir que passar -10.0 lança IllegalArgumentException!