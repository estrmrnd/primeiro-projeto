package org.example.aula14;

public class Encapsulamentos {
    static void main() {
        ContaBancaria c = new ContaBancaria();

        System.out.println(c.getTitular());
        System.out.println(c.getSaldo());

        c.setTitular("");
        System.out.println(c.getTitular());
        c.setTitular("Ana");
        System.out.println(c.getTitular());

        c.depositar(2000);
        c.sacar(2500);
        System.out.println(c.getSaldo());


        System.out.println("Número da conta: " + c.getNumeroConta());

        Produto p = new Produto();

        System.out.println(p.nome);
        System.out.println(p.preco);
        //System.out.println(p.codigoInterno);



    }
}
