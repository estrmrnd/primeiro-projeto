package org.example.aula8;

/* ⚠️ O método vai fora do main, mas dentro da classe, no mesmo nível do main, logo abaixo dele. Se você tentar criar um método dentro do main, não compila.

Nos próximos, crie uma classe separada para guardar os métodos (pode ser uma só, chamada Utilidades, ou uma por exercício, você decide). Lembre que para chamar, você precisa escrever o nome da classe na frente: Utilidades.dobro(5)
 */

public class Metodos {

    static void exercicio1() {
        // 1 — Na mesma classe do main, crie um método chamado mostrarBoasVindas() que imprime "Bem-vinda ao curso de Java!". Chame ele no main.
        System.out.println("Bem-vinda ao curso de Java!");
    }

    static void exercicio2(String saudar) {
        // 2 — Crie um método saudar(String nome) que imprime "Olá, [nome]! Tudo bem?". Chame ele três vezes, passando nomes diferentes.

        System.out.println("Olá, " + saudar + "! Tudo bem?");
    }

    static int exercicio3(int numero) {
        //3 — Crie um método dobro(int numero) que devolve o dobro do número recebido. No main, chame ele e mostre o resultado.
        return(numero * 2);
    }

    static double exercicio4(double n1, double n2) {
        // 4 — Crie um método calcularMedia(double n1, double n2) que devolve a média das duas notas. No main, peça as duas notas com Scanner e mostre a média com duas casas decimais.
        return((n1 + n2) / 2);
    }

    static boolean exercicio5(int idade) {
        //5 — Crie um método ehMaiorDeIdade(int idade) que devolve true ou false. No main, peça a idade e use o retorno do método dentro de um if para imprimir se a pessoa é maior ou menor de idade.
        return (idade >= 18);
    }

    static int exercicio6(int i1, int i2) {
        /*6 — Crie três métodos com o mesmo nome somar:
        um que recebe dois inteiros
        um que recebe três inteiros
        um que recebe dois decimais
        No main, chame os três e veja o Java escolher sozinho qual usar.
         */
        return(i1 + i2);
    }
    static int exercicio6(int i1, int i2, int i3){
        return(i1 + i2 + i3);
    }
    static double exercicio6(double i1, double i2){
        return(i1 + i2);
    }

    // exercicio 7
    //7 — Crie dois métodos chamados saudacao:
    //um sem parâmetro, que imprime "Olá!"
    //um que recebe um nome, e imprime "Olá, [nome]!"
    static void saudacao() {
        System.out.println("Bem vinda!");
    }

    static void saudacao(String nome) {
        System.out.println("Bem vinda, " + nome + "!");
    }

    static void main() {
        /* exercicio2("Jurema");
        exercicio2("Açucena");
        exercicio2("Josefa");
         */
        // System.out.println(exercicio3(2));

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Digite a primeira nota: ");
        double n1 = sc.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2 = sc.nextDouble();
        System.out.printf("A média é %.2f: ", exercicio4(n1, n2));
         */
        /*Scanner sc2 = new Scanner(System.in);
        System.out.println("Digite a sua idade:");
        int idade = sc2.nextInt();
        if(exercicio5(idade)) {
            System.out.println("É maior de idade.");
        }else{
            System.out.println("É menor de idade.");
        }
         */
        /* System.out.println(exercicio6(2,6));
        System.out.println(exercicio6(2,3,5));
        System.out.println(exercicio6(2.2,3.4));
         */
        saudacao();
        saudacao("Julia");

    }
}
