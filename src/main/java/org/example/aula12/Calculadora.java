package org.example.aula12;

public class Calculadora {
    //1. (mesma classe — muda a QUANTIDADE de parâmetros)
    //   Crie a classe Calculadora com TRÊS métodos chamados calcularArea():
    //   - recebe um double (lado do quadrado)  -> lado * lado
    //   - recebe dois double (base e altura)   -> base * altura
    //   - recebe um int (raio do círculo)      -> 3.14159 * raio * raio
    //   Chame os três na Main e imprima os resultados.

    public double calcularArea(double lado){
        return lado * lado;
    }

    public double calcularArea(double base, double lado){
        return base * lado;
    }

    public double calcularArea(int raio){
        return 3.14159 * raio * raio;
    }

}
