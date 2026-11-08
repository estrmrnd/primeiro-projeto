package org.example.aula19;

public class CalculadoraDesconto {
    public double aplicarDesconto(double valorCompra, boolean clienteVip){
        if(valorCompra <= 0){
            throw new IllegalArgumentException("Valor inválido");
        } else if (clienteVip) {
            double desconto = valorCompra * 0.90;
            return desconto;
        }else{
            return valorCompra;
        }
    }
}
