package org.example.aula12;
/*
6. Crie duas interfaces:
   - Notificavel, com notificar(String mensagem)
   - Exportavel, com exportar()

   Faça o Gerente do exercício 5 implementar as duas, SEM tirar o extends Funcionario: class Gerente extends Funcionario implements Notificavel, Exportavel

   Na Main, crie um gerente, preencha o nome e chame os quatro métodos nele: baterPonto(), aprovarFerias(), notificar() e exportar().

   UMA herança (extends), VÁRIAS interfaces (implements). Depois tente colocar uma segunda classe no extends: extends Funcionario, Pessoa Veja o que o Java responde.
*/

public interface Notificavel {
    public void notificar(String mensagem);
}
