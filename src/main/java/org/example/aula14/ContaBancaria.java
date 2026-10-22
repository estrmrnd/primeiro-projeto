package org.example.aula14;


public class ContaBancaria {
    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getTitular() {
        return titular;
    }

    public double getSaldo(){
        return saldo;
    }

    public String getNumeroConta(){
        return numeroConta;
    }

    public void setTitular(String titular){
        if(titular == null || titular.isEmpty()){
            System.out.println("Inválido! Mantido " + this.titular);
            return;
        }
        this.titular = titular;
    }

    public void depositar(double valor){
        if(valor <= 0){
            System.out.println("Valor inválido");
            return;
        }
        this.saldo += valor;
        registrarLog("Depósito de R$" + valor);
    }

    private boolean temSaldo(double valor){
        if(saldo >= valor && valor > 0){
            return true;
        }
        return false;
    }

    public void sacar(double valor){
        if(!temSaldo(valor)){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
        registrarLog("Saque de R$" + valor);
    }

    private void registrarLog(String acao){
        System.out.println("[LOG] " + titular + ": " + acao);
    }

}


