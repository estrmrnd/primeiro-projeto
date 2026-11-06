package org.example.aula18;

public class Decorator {
    static void main(String[] args) {
        Acai pedido1 = new AcaiSimples();
        pedido1 = new GranolaDecorator(pedido1);

        System.out.println(pedido1.getDescricao());
        System.out.println(pedido1.getPreco());

        Acai pedido2 = new AcaiSimples();
        pedido2 = new GranolaDecorator(pedido2);
        pedido2 = new MorangoDecorator(pedido2);

        System.out.println(pedido2.getDescricao());
        System.out.println(pedido2.getPreco());
    }
}
