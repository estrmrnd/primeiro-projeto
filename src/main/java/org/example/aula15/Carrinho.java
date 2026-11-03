package org.example.aula15;
/*
7. Crie uma classe Singleton chamada Carrinho que:
   -tenha um atributo quantidadeItens, começando em 0;
   -tenha um método adicionarItem() que soma 1 à quantidade;
   -tenha um método getQuantidadeItens() que devolve a quantidade.

No main, obtenha o carrinho em duas variáveis diferentes, telaProdutos e telaPromocoes, adicione itens usando as duas, e imprima a quantidade final. O resultado deve mostrar que as duas telas usam o mesmo carrinho.

Exemplo de saída esperada:

Itens no carrinho: 4
 */

public class Carrinho {
    private static Carrinho instancia;

    private Carrinho(){
    }

    public static Carrinho getInstancia(){
        if(instancia == null){
            instancia = new Carrinho();
        }
        return instancia;
    }

    private int quantidadeItens = 0;
    public void adicionarItem(){
        quantidadeItens++;
    }

    public int getQuantidadeItens(){
        return quantidadeItens;
    }

    static void main(String[] args) {
        Carrinho telaProdutos =  Carrinho.getInstancia();
        Carrinho telaPromocoes =  Carrinho.getInstancia();

        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();

        System.out.println("Itens no carrinho:" +  telaPromocoes.getQuantidadeItens());
    }

    /*
    Para fixar:
    Imagine um carrinho de compras de verdade - Você está em uma loja virtual e tem duas telas:
- telaProdutos → onde você vê os produtos.
- telaPromocoes → onde você vê as promoções.
Você adiciona 3 produtos pela primeira tela e 1 pela segunda.

Quando você abre o carrinho, quantos produtos aparecem?

Quatro! Porque você não tem um carrinho para cada tela. As duas telas compartilham o mesmo carrinho.
     */
}

