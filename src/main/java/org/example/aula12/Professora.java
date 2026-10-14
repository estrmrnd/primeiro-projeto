package org.example.aula12;
/*
3. Crie a classe Professora, também filha de Pessoa, com o atributo disciplina e o método lancarNota(String aluna, double nota), que imprime algo como "Flora lançou nota 9.5 para Ana". Use printf com %.1f. Na Main, crie uma aluna e uma professora, preencha os atributos de cada objeto e chame os métodos das duas.


4. Na Professora, sobrescreva o apresentar() usando @Override, pra imprimir "Oi, sou [nome] e ensino [disciplina]."Chame apresentar() na aluna e na professora e compare as saídas.
 */

public class Professora extends Pessoa{
    String disciplina = "Cálculo 1";
    public void lancarNota(String aluna, double nota){
        System.out.printf("%s lançou nota %.1f para %s\n", nome, nota, aluna);
    }

    /*@Override
    public void apresentar(){
        System.out.println("Oi, sou " + nome + " e ensino " + disciplina + ".");
    }*/
    void apresentar(String cargo) {
        System.out.println("Oi, sou " + nome + ", " + cargo);
    }
}
