package org.example.aula12;
/*
3. Crie a classe Professora, também filha de Pessoa, com o atributo disciplina e o método lancarNota(String aluna, double nota), que imprime algo como "Flora lançou nota 9.5 para Ana". Use printf com %.1f. Na Main, crie uma aluna e uma professora e dê valor aos atributos de cada objeto:
   Professora flora = new Professora();
   flora.nome = "Flora";
   flora.idade = 30;
   flora.disciplina = "Java e IA";

   Faça o mesmo com a aluna e chame os métodos das duas.

4. (herança — quem não sobrescreve)

   Crie a classe Estagiaria, filha de Pessoa, que NÃO sobrescreve o apresentar() e não acrescenta nada. Na Main, crie o objeto, dê valor aos atributos, guarde ele numa variável do tipo da mãe e chame o método apresentar(). O que saiu? Por quê?

5. (herança — método que recebe a mãe)
   Crie um método na sua classe Main:

   static void mostrarFicha(Pessoa p) {
       p.apresentar();
   }

   Chame ele três vezes, passando a aluna, a professora e a estagiária.

   O método não sabe quem vai receber, e funciona pros três.

6. (interface)

   Crie a interface MeioDePagamento com pagar(double valor).
   Crie Pix e Boleto implementando ela, cada uma imprimindo uma
   mensagem diferente com printf e %.2f.

   Declare UMA variável do tipo da interface:

   MeioDePagamento forma;
   forma = new Pix();     forma.pagar(150.00);
   forma = new Boleto();  forma.pagar(150.00);


7. (a armadilha)

   Na Professora, troque o apresentar() sobrescrito por este,
   com um parâmetro a mais e SEM o @Override:

   void apresentar(String cargo) {
       System.out.println("Oi, sou " + nome + ", " + cargo);
   }

   Rode o exercício 3 de novo. O que a professora imprime agora?
   Deu algum erro?

   Depois coloque o @Override nesse método e veja o que o Java diz.

   Essa questão mostra por que o @Override existe.
 */
public class Polimorfismos {

    static void mostrarFicha(Pessoa p) {
        p.apresentar();
    }

    static void main() {

        Calculadora calculadora = new Calculadora();
        System.out.println(calculadora.calcularArea(4.4));
        System.out.println(calculadora.calcularArea(8.0));
        System.out.println(calculadora.calcularArea(7));

        Painel painel = new Painel();
        System.out.println(painel.exibir("Texto"));
        System.out.println(painel.exibir(8.0));
        System.out.println(painel.exibir(4));
        System.out.println(painel.exibir(true));

        Professora professora = new Professora();
        professora.nome = "Flora";
        professora.idade = 30;
        professora.apresentar("Prof");
        professora.disciplina = "Programação";
        Aluna aluna = new Aluna();
        aluna.nome = "Ester";
        aluna.nota = 8.7;
        professora.lancarNota(aluna.nome, aluna.nota);

        Pessoa estagiaria = new Estagiaria();
        estagiaria.nome = "Kris";
        estagiaria.idade = 25;
        estagiaria.apresentar();

        Aluna aluna1 = new Aluna();
        aluna1.nome = "Ivy";
        aluna1.curso = "ADS";
        mostrarFicha(aluna1);

        Professora professora1 = new Professora();
        professora1.nome = "Danielle";
        professora1.idade = 31;
        mostrarFicha(professora1);

        Estagiaria estagiaria1 = new Estagiaria();
        estagiaria1.nome = "Martina";
        estagiaria1.idade = 18;
        mostrarFicha(estagiaria1);

        MeioDePagamento forma;
        forma = new Pix();
        forma.pagar(255.00);

        forma = new Boleto();
        forma.pagar(50.00);


    }
}
