package org.example.revisao4;

public abstract class Funcionario {
    private String nome;
    private double salarioBase;

    public Funcionario(String nome, double salarioBase){
        this.nome = nome;
        setSalarioBase(salarioBase);
    }

    public double getSalarioBase(){
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase){
        if(salarioBase < 0){
            System.out.println("Salário não pode ser negativo");
            return;
        }
        this.salarioBase = salarioBase;
    }

    public String getNome(){
        return nome;
    }

    public abstract double calcularSalario();
}
