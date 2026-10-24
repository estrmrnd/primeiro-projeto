package org.example.revisao4;

public abstract class Forma {
    String nome; //atributo

    public Forma(String nome){
        this.nome = nome;
    } //construtor. o this.nome - atributo que pertence ao objeto; nome - parâmetro recebido pelo construtor, ou seja, guarde no atributo do objeto o nome que foi recebido.

    public void exibirNome(){
        System.out.println(nome);
    }

    public abstract double calcularArea();

}
