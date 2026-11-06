package org.example.aula18;

public class MorangoDecorator extends AcaiDecorator {
    public MorangoDecorator(Acai acai){
        super(acai);
    }

    @Override
    public double getPreco(){
        return acaiEmbrulhado.getPreco() + 3.00;
    }

    @Override
    public String getDescricao(){
        return acaiEmbrulhado.getDescricao() + " + Morango";
    }
}
