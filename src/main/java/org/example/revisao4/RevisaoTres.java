package org.example.revisao4;

public class RevisaoTres {
    static void main() {
        Produto p = new Produto();
        p.setNome("Caneta Bic");
        p.setQuantidade(10);
        p.setPreco(3.50);

        System.out.println(p.getNome());
        System.out.println("Quantidade: " + p.getQuantidade());
        System.out.println("Preço: " + p.getPreco());

        Retangulo r = new Retangulo("Retangulo", 10, 5);
        r.exibirNome();
        System.out.println("Area: " + r.calcularArea());

       // Forma f = new Forma("teste");

        Desenvolvedor d = new Desenvolvedor("Ana", 6500.50);
        Gerente g = new Gerente("Janice", 10230.80);
        Notificador email = new NotificadorEmail();
        FolhaPagamento folhaEmail = new FolhaPagamento(email);

        folhaEmail.pagar(d);
        folhaEmail.pagar(g);

        Notificador sms = new NotificadorSms();
        FolhaPagamento folhaSms = new FolhaPagamento(sms);

        folhaSms.pagar(d);
        folhaSms.pagar(g);



    }
}
