package org.example.aula20;

public class Main {
    static void main(String[] args) {
        Voo voo = new Voo();

        Passageiro passageiro = new Passageiro();
        PainelAeroporto painel = new PainelAeroporto();

        voo.adicionarObservador(passageiro);
        voo.adicionarObservador(painel);

        voo.mudarStatus("Embarque iniciado");
        voo.adicionarObservador(painel);


        Estoque estoque = new Estoque();
        RegistroEstoque registroEstoque = new RegistroEstoque();

        estoque.adicionarObservador(registroEstoque);
        estoque.setQuantidade(50);
        estoque.setQuantidade(30);

    }
}
