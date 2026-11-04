package org.example.aula16.builder;

public class Agendamento{
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;

    public static class Builder {
        private String nomePet;
        private String servico;
        private String horario;
        private boolean perfume;
        private boolean laco;
        private boolean hidratacao;
        private String observacao;
        private double desconto;


        public Builder nomePet(String nomePet) {
            this.nomePet = nomePet;
            return this;
        }

        public Builder servico(String servico) {
            this.servico = servico;
            return this;
        }

        public Builder horario(String horario) {
            this.horario = horario;
            return this;
        }

        public Builder perfume(boolean perfume) {
            this.perfume = perfume;
            return this;
        }

        public Builder laco(boolean laco) {
            this.laco = laco;
            return this;
        }

        public  Builder hidratacao(boolean hidratacao) {
            this.hidratacao = hidratacao;
            return this;
        }

        public Builder observacao(String observacao) {
            this.observacao = observacao;
            return this;
        }

        public Builder desconto(double desconto) {
            this.desconto = desconto;
            return this;
        }
        public Agendamento build(){
        return new Agendamento(this);
        }
    }

    public void mostrar(){
        System.out.println("Nome: " + nomePet);
        System.out.println("Serviço: " + servico);
        System.out.println("Horario: " + horario);
        System.out.println("Perfume: " + perfume);
        System.out.println("Laço: " + laco);
        System.out.println("Hidratação: " + hidratacao);
        System.out.println("Observação: " + observacao);
        System.out.println("Desconto: " + desconto);
    }


    private Agendamento (Builder builder) {
        this.nomePet = builder.nomePet;
        this.servico = builder.servico;
        this.horario = builder.horario;
        this.perfume = builder.perfume;
        this.laco = builder.laco;
        this.hidratacao = builder.hidratacao;
        this.observacao = builder.observacao;
        this.desconto = builder.desconto;
    }

    static void main(String[] args) {
        Agendamento thor = new Builder()
                .nomePet("Thor")
                .servico("Banho")
                .horario("14:00")
                .perfume(true)
                .laco(true)
                .observacao("Alérgio a shampoo")
                .desconto(0.10)
                .build();

        thor.mostrar();

        Agendamento luna = new Builder()
                .nomePet("Luna")
                .servico("Tosa")
                .horario("10h")
                .build();

        luna.mostrar();

        Agendamento mel = new Builder()
                .nomePet("Mel")
                .servico("Banho")
                .horario("16h")
                .hidratacao(true)
                .build();

        mel.mostrar();
    }

}
