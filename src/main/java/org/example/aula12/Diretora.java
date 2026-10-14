package org.example.aula12;
/*
5. Faça uma cadeia de três níveis:
   - Funcionario, com o atributo nome e o método baterPonto()
   - Gerente extends Funcionario, com aprovarFerias(String quem)
   - Diretora extends Gerente, com definirMeta(String meta)

   Na Main, crie uma Diretora, preencha o nome dela (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto. Herança em cadeia: ela tem tudo que vem de cima.
 */
public class Diretora extends Gerente{
    public void definirMeta(String meta){
        System.out.println(meta +" tem meta definido!");
    }
}
