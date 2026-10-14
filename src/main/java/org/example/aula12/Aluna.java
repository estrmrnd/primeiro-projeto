package org.example.aula12;
/*
1. Crie a classe Pessoa com os atributos nome e idade, e o método apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos." Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada. Na Main, crie uma aluna, preencha nome e idade, e chame apresentar(). Repare: você não escreveu nome, idade nem apresentar() na Aluna, e os três funcionaram.

   2. Acrescente na Aluna o atributo curso e o método estudar(), que imprime "[nome] está estudando [curso]." Preencha os três atributos no objeto e chame os dois métodos.Repare que o estudar() usa o nome, que veio da mãe.
 */
public class Aluna extends Pessoa{
    String curso = "Ciência da Computação";
    double nota;
    public void estudar(){
        System.out.println(nome + " está estudando " + curso);
    }
}
