package org.example.revisao4;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        if(preco <= 0){
            System.out.println("Preço inválido");
            return;
        }
        this.preco = preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setQuantidade(int quantidade){
        if(quantidade < 0){
            System.out.println("Apenas valores positivos");
            return;
        }
        this.quantidade = quantidade;
    }
}
