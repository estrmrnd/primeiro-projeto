package org.example.aula16;
/*
1. Crie a classe Agendamento com TODOS estes atributos,
   recebidos num construtor só:

   - nomePet (String)
   - servico (String)
   - horario (String)
   - perfume (boolean)
   - laco (boolean)
   - hidratacao (boolean)
   - observacao (String)
   - desconto (double)

   Crie um método mostrar() que imprime tudo.

   Na Main, crie 3 agendamentos:
   a) Thor, banho, 14h, com perfume e laço, sem hidratação,
      "alérgico a shampoo", 10% de desconto
   b) Luna, tosa, 10h, sem nenhum extra, sem observação,
      sem desconto
   c) Mel, banho, 16h, só com hidratação, sem observação,
      sem desconto

   Agora responda:
   - Olhando só a linha do new, dá pra saber o que cada
     true/false significa?
   - Se você trocar a ordem do perfume e do laço sem querer,
     o código compila? Alguém perceberia o erro?
   - No agendamento b, quantos valores você digitou só pra
     dizer "não quero isso"?

   Guarda essa sensação.
 */

public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    boolean hidratacao;
    String observacao;
    double desconto;

    public Agendamento (String nomePet, String servico, String horario, boolean perfume, boolean laco, boolean hidratacao, String observacao, double desconto){
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.hidratacao = hidratacao;
        this.observacao = observacao;
        this.desconto = desconto;
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

    static void main(String[] args) {
        Agendamento thor = new Agendamento("Thor", "Banho", "14h", true, true, false, "Alérgico a shampoo", 0.10);
        thor.mostrar();

        Agendamento luna = new Agendamento("Luna", "Tosa", "10h", false, false, false, "", 0.0);
        luna.mostrar();

        Agendamento mel = new Agendamento("Nome", "Banho", "16h", false, false, true, "", 0.0);
        mel.mostrar();
    }
}



