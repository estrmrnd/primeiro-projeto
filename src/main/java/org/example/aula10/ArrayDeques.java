package org.example.aula10;
import java.util.ArrayDeque;
import java.util.List;

public class ArrayDeques {
    static void exercicio1() {
        //Crie uma fila e coloque três pessoas nela com add. Imprima a fila e quantas pessoas tem.
        ArrayDeque<String> pessoas = new ArrayDeque<>();
        pessoas.addLast("Tamara");
        pessoas.addLast("Mayara");
        pessoas.addFirst("Ana");
        System.out.println(pessoas);
        System.out.println(pessoas.size());
    }

    static void exercicio2() {
        //Crie uma fila com addAll. Use peek para mostrar quem é o próximo e imprima a fila logo depois. Repare que ela não mudou.
        ArrayDeque<String> pessoa = new ArrayDeque<>();
        pessoa.addAll(List.of("Jussara", "Sabrina", "Érica"));
        System.out.println(pessoa.peek());
        System.out.println(pessoa);
        //exercicio3: Mesma fila. Agora use poll para atender o primeiro e imprima a fila depois. Compare com o exercício 2.
        System.out.println(pessoa.poll());
        System.out.println(pessoa);
    }

    static void exercicio4() {
        //Crie uma fila com três nomes e atenda todos usando while (!fila.isEmpty()). No final, imprima "Fila vazia!".
        ArrayDeque<String> fila = new ArrayDeque<>(
                List.of("Janaina", "Fabiana", "Alessandra")
        );
        while(!fila.isEmpty()) {
            System.out.println(fila.poll());
        }
        System.out.println("Fila vazia!");
    }

    static void exercicio5() {
        //Crie uma fila com três nomes e use contains para responder duas perguntas: se "Bia" está na fila e se "Zoe" está.
        ArrayDeque<String> estaFila = new ArrayDeque<>(
                List.of("Beatriz", "Zoe","Eunice")
        );
        if(estaFila.contains("Zoe")){
            System.out.println("Está na fila");
        }else{
            System.out.println("Não está fila");
        }
        if(estaFila.contains("Bia")){
            System.out.println("Está na fila");
        }else{
            System.out.println("Não está na fila.");
        }
    }

    static void exercicio6() {
/*
   Crie uma fila vazia. Antes de usar o peek, teste com isEmpty():
   - se estiver vazia  -> "Não tem ninguém na fila."
   - se tiver gente    -> "Próximo: [nome]"
   Depois adicione uma pessoa e teste de novo.
*/
        ArrayDeque<String> filaVazia = new ArrayDeque<>();
        if(filaVazia.isEmpty()) {
            System.out.println("Não tem ninguém na fila");
        }else {
            System.out.println("Próximo: " + filaVazia.peek());
        }
        filaVazia.add("Josefina");
        if(filaVazia.isEmpty()) {
            System.out.println("Não tem ninguém na fila");
        }else {
            System.out.println("Próximo: " + filaVazia.peek());
        }
    }
    static void main() {
        exercicio6();
    }
}
