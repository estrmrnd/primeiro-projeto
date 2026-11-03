1. O que o padrão Singleton garante?
   a) Que a classe tenha vários construtores
   b) Que exista apenas um objeto da classe no programa ESSA É A RESPOSTA
   c) Que a classe não tenha atributos
   d) Que a classe possa ser herdada


2. Por que o construtor de um Singleton é private?
   para impedir que outras classes criem instancias dela usando 'new'. o objetivo é garantir que exista uma única instância da classe, com um ponto de acesso global a ela.

3. Complete a lacuna:

java
private __static__ Configuracao instancia;
a) final
b) public
c) static
d) void

4. O que acontece se alguém tentar escrever isto fora da classe?

java
Configuracao c = new Configuracao();

apresentará um erro, pq o construtor é privado e só pode ser acessado dentro da própria classe 'Configuracao'

5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?
   a) new Configuracao()
   b) Configuracao.getInstancia()  ESSA É A RESPOSTA
   c) Configuracao.instancia
   d) this.getInstancia()

6.  Crie uma classe Singleton chamada ContadorVisitas que:
    -tenha um atributo total, começando em 0;
    -tenha um método registrarVisita() que soma 1 ao total;
    -tenha um método getTotal() que devolve o total.

Depois, no main, obtenha ele duas vezes em variáveis diferentes pagina1 e pagina2, registre visitas usando as duas, e imprima o total. O resultado deve mostrar que as duas variáveis usam o mesmo contador.

Exemplo de saída esperada:

Total de visitas: 3

Dica: Para instanciar(criar) não use o new. Classe v1 = Classe.getInstancia();


7. Crie uma classe Singleton chamada Carrinho que:
   -tenha um atributo quantidadeItens, começando em 0;
   -tenha um método adicionarItem() que soma 1 à quantidade;
   -tenha um método getQuantidadeItens() que devolve a quantidade.

No main, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes, adicione itens usando as duas, e imprima a quantidade final. O resultado deve mostrar que as duas telas usam o mesmo carrinho.

Exemplo de saída esperada:

Itens no carrinho: 4
