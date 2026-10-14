package org.example.aula12;

public class Herancas {
    static void main() {
    /*
    1. Crie a classe Pessoa com os atributos nome e idade, e o método apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos." Crie a classe Aluna que SÓ faz extends Pessoa, sem acrescentar nada. Na Main, crie uma aluna, preencha nome e idade, e chame apresentar(). Repare: você não escreveu nome, idade nem apresentar() na Aluna, e os três funcionaram.
    */
        Aluna aluna1 = new Aluna();
        aluna1.nome = "Jana";
        aluna1.idade = 18;
        aluna1.apresentar();

    /*
    2. Acrescente na Aluna o atributo curso e o método estudar(), que imprime "[nome] está estudando [curso]." Preencha os três atributos no objeto e chame os dois métodos. Repare que o estudar() usa o nome, que veio da mãe.
    */
        aluna1.estudar();

    /*
    3. Crie a classe Professora, também filha de Pessoa, com o atributo disciplina e o método lancarNota(String aluna, double nota), que imprime algo como "Flora lançou nota 9.5 para Ana". Use printf com %.1f. Na Main, crie uma aluna e uma professora, preencha os atributos de cada objeto e chame os métodos das duas.
     */
        Professora professora1 = new Professora();
        professora1.nome = "Flora";
        professora1.apresentar();
        professora1.lancarNota("May", 9.0);

    /*
    5. Faça uma cadeia de três níveis:
    - Funcionario, com o atributo nome e o método baterPonto()
    - Gerente extends Funcionario, com aprovarFerias(String quem)
    - Diretora extends Gerente, com definirMeta(String meta)

    Na Main, crie uma Diretora, preencha o nome dela (carla.nome = "Carla";) e chame OS TRÊS métodos no mesmo objeto. Herança em cadeia: ela tem tudo que vem de cima.
    */
    Diretora diretora1 = new Diretora();
    diretora1.nome = "Carla";
    diretora1.definirMeta("Vender 50k na primeira semana de Novembro/26");
    diretora1.aprovarFerias("Lívia");
    diretora1.baterPonto();

/*
    6. Crie duas interfaces:
    - Notificavel, com notificar(String mensagem)
    - Exportavel, com exportar()

    Faça o Gerente do exercício 5 implementar as duas, SEM tirar o extends Funcionario: class Gerente extends Funcionario implements Notificavel, Exportavel

    Na Main, crie um gerente, preencha o nome e chame os quatro métodos nele: baterPonto(), aprovarFerias(), notificar() e exportar().

    UMA herança (extends), VÁRIAS interfaces (implements). Depois tente colocar uma segunda classe no extends: extends Funcionario, Pessoa Veja o que o Java responde.
*/
    Gerente gerente2 = new Gerente();
    gerente2.nome = "Julia";
    gerente2.aprovarFerias("Viviane");
    gerente2.baterPonto();
    gerente2.notificar("Aviso! Recesso de fim de ano!");
    gerente2.exportar();

    }
}
