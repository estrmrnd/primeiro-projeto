package org.example.aula12;
/*
5. Faça uma cadeia de três níveis:
   - Funcionario, com o atributo nome e o método baterPonto()
   - Gerente extends Funcionario, com aprovarFerias(String quem)
   - Diretora extends Gerente, com definirMeta(String meta)

   Na Main, crie uma Diretora, preencha o nome dela (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto. Herança em cadeia: ela tem tudo que vem de cima.
 */

public class Funcionario {
    String nome;
    String quem;
    public void baterPonto(){
        System.out.println(nome + " teve ponto batido!");
    }
}
