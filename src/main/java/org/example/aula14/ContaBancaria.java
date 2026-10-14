package org.example.aula14;
/*
 1. (sentir o private na pele)
    Crie a classe ContaBancaria com os atributos titular (String) e saldo (double), os DOIS private. Na Main, crie uma conta e tente fazer estas duas linhas:
    System.out.println(c.titular);
    c.saldo = -5000;

    Rode e LEIA o erro. Saída esperada:

    error: titular has private access in ContaBancaria
    error: saldo has private access in ContaBancaria

    Agora a classe está fechada demais — não dá pra fazer nada com ela. As próximas questões abrem as portas, uma por uma.

2. (abrir a porta de leitura)

   Crie um getter para cada atributo.
   Na Main, apague as duas linhas que davam erro e mostre o titular e o saldo usando os getters. Saída esperada:
   Titular: null
   Saldo: 0.0

   Olha o que apareceu. O objeto existe, mas está VAZIO — ninguém preencheu nada ainda. O null e o 0.0 são os valores que o Java coloca sozinho quando você dá new.

   No IntelliJ: alt + insert (ou Cmd + N no Mac) -> Getter. Mas escreva o primeiro na mão, pra ver como ele é por dentro.

3. (a porta de escrita, com porteiro)

   Crie um setter para o titular que RECUSA valor vazio. Se vier vazio, avisa e mantém o que já estava. Na Main, chame ele duas vezes: uma com "" e uma com "Ana". Mostre o titular depois de cada uma. Saída esperada:

   Titular inválido! Mantido null
   Titular: Ana

   Referência:

   public void setAtributo(String atributo) {
       if (atributo == null || atributo.isEmpty()) {
           System.out.println("Inválido! Mantido " + this.atributo);
           return;
       }
       this.atributo = atributo;
   }

    O return sozinho sai do método na hora, sem fazer o resto.

    Compare com a questão 1: lá, c.saldo = -5000 passava direto.
      Aqui o objeto conferiu antes de aceitar.

4. (métodos que fazem o trabalho sujo)

   Crie na ContaBancaria:

   PÚBLICOS:
   - depositar(double valor)   -> recusa valor menor ou igual a zero
   - sacar(double valor)       -> recusa se não tiver saldo

   PRIVADOS:
   - temSaldo(double valor)    -> devolve true ou false
   - registrarLog(String acao) -> imprime "[LOG] Ana: saque de 200.0"

   O sacar() usa o temSaldo() pra decidir, e os dois chamam o registrarLog() quando dá certo. Na Main: deposite 500, tente depositar -100, tente sacar 2000, saque 200.

   Saída esperada:
   [LOG] Ana: deposito de 500.0
   Saldo: 500.0
   Valor inválido!
   Saldo insuficiente!
   [LOG] Ana: saque de 200.0
   Saldo: 300.0

   Depois tente chamar c.registrarLog("teste") lá da Main: error: registrarLog(String) has private access in ContaBancaria

    Quem usa a sua classe vê só depositar() e sacar(). O resto é maquinário interno e nem aparece no autocompletar.

*/

public class ContaBancaria {
    private String titular;
    private double saldo;

    public String getTitular() {
        return titular;
    }

    public double getSaldo(){
        return saldo;
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
    }
    public void sacar(double valor){
        if(saldo < valor){
            System.out.println("Saldo insuficiente");
            return;
        }
        this.saldo -= valor;
    }

}


