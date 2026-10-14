package org.example.aula14;
/*
Referência geral:

class Coisa {
    private String atributo;          // fechado pra fora

    public String getAtributo() {     // getter: devolve
        return atributo;
    }

    public void setAtributo(String atributo) {   // setter: recebe
        this.atributo = atributo;     // this: qual é qual
    }
}



5. (os modificadores lado a lado)

   Crie a classe Produto com TRÊS atributos, cada um com um
   modificador diferente:

   private String codigoInterno = "X-99";
   String nome = "Caneta";            // sem modificador: default
   public double preco = 5.50;

   Na Main (mesmo package), tente imprimir os três.

   Quais funcionaram? Qual deu erro?

   Saída esperada:

   Caneta
   5.5
   error: codigoInterno has private access in Produto

    No MESMO package, default e public se comportam igual. A
      diferença entre eles só aparece quando você sai do package.


6. (nem todo atributo precisa de setter)

   Na ContaBancaria, acrescente o atributo numeroConta, private,
   já com um valor fixo:

   private String numeroConta = "001-X";

   Crie o GETTER dele. NÃO crie o setter.

   Na Main, mostre o número da conta. Depois tente mudar ele:

   c.setNumeroConta("999-Z");

   Saída esperada:

   Numero da conta: 001-X
   error: cannot find symbol
     symbol:   method setNumeroConta(String)

    Getter e setter não são um par obrigatório. Número de conta,
      CPF e data de cadastro são informações que podem ser LIDAS,
      mas não deveriam mudar depois. Você decide isso simplesmente
      não escrevendo o setter.
 */
public class Encapsulamentos {
    static void main() {
        ContaBancaria c = new ContaBancaria();

        System.out.println(c.getTitular());
        System.out.println(c.getSaldo());

        c.setTitular("");
        System.out.println(c.getTitular());
        c.setTitular("Ana");
        System.out.println(c.getTitular());



    }
}
