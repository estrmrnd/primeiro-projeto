package org.example.revisao4;

public class FolhaPagamento {
    private Notificador notificador;

    public FolhaPagamento(Notificador notificador){
        this.notificador = notificador;
    }


    public void pagar(Funcionario f){  //funcionario é classe abstrada, nao pode usar o new
        double salario = f.calcularSalario();

        notificador.notificar("Pagamento realizado para " + f.getNome() + ". Salário de: R$" + salario);
    }
}
