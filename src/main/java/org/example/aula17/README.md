
Factory

Questão 1. Explique com suas palavras qual problema o Factory resolve. O que aconteceria se os ifs que decidem qual objeto criar ficassem espalhados pelo main e por outras partes do programa, e depois surgisse um tipo novo?
um código cheio de de ifs e responsabilidades na criação de objetos não é o ideal em nenhuma aplicação. se surgir um novo tipo, será necessário procurar todos os lugares que fazem essa verificação e alterar o código em vários pontos.


Questão 2. O método da fábrica normalmente devolve o objeto criado com qual tipo?
• a) O tipo da classe concreta (ex.: Cachorro)
• b) O tipo da interface (ex.: Animal)
• c) String
• d) Não devolve nada (void)

LETRA B


Questão 3 (prática). Implemente a interface e as classes abaixo:

public interface Animal {
void emitirSom();
}


public class Cachorro implements Animal {
@Override
public void emitirSom() {
System.out.println("Au au!");
}
}


public class Gato implements Animal {
@Override
public void emitirSom() {
System.out.println("Miau!");
}
}


Crie a classe AnimalFactory com um método getAnimal(String tipo):
• se o tipo for "cachorro", devolve um Cachorro;
• se o tipo for "gato", devolve um Gato.
No main, use a fábrica para criar um cachorro e um gato e chame emitirSom() nos dois. O main não pode ter new Cachorro() nem new Gato().



Adapter

Questão 4. Seu sistema precisa usar uma classe de pagamento de outra empresa, mas ela não implementa a sua interface. Por que não dá para simplesmente escrever implements na classe dela? O que você faz no lugar?
Porque provavelmente os métodos recebem nomes diferentes. O ideal é usar uma classe adaptadora que implementa a interface pelo meu sistema e utiliza o serviço da outra empresa.

Questão 5. Em um Adapter, onde fica a tradução (por exemplo, a conversão de dólar para real)?
• a) Na classe de fora
• b) Na interface
• c) No método implementado da interface, dentro do adapter
• d) No main, antes de chamar o método
LETRA C


Questão 6 (prática). O seu sistema usa esta interface:
public interface Pagamento {
void pagar();
}
Você recebeu esta classe de outra empresa. Ela não pode ser alterada:
public class PayPalAPI {
public void sendPayment() {
System.out.println("Pagamento enviado pelo PayPal.");
}
}
Crie a classe PayPalAdapter, para que o sistema consiga usar o PayPal como um Pagamento. Não precisa fazer nenhuma conversão: o método pagar() só precisa chamar o método da classe de fora.
No main:
1. Escreva, como comentário, a linha que tentaria usar PayPalAPI direto como Pagamento (a que não compila).
2. Crie uma variável do tipo Pagamento usando o adapter e chame pagar().


Facade

Questão 7. Explique com suas palavras qual problema o Facade resolve. Se quiser, use o exemplo do síndico do condomínio ou crie outro.
O facade esconde a complexidade de um sistema atrás de uma única interface mais simples.

Questão 8. Marque V (verdadeiro) ou F (falso):
• (F) A fachada precisa implementar uma interface.
• (V) A fachada guarda as classes envolvidas no processo em atributos.
• (F) Depois que a fachada existe, é proibido usar as outras classes diretamente.


Questão 9 (prática). Você já tem estas três classes:
public class Despertador {
public void desligar() {
System.out.println("Despertador desligado.");
}
}
public class Cafeteira {
public void fazerCafe() {
System.out.println("Café pronto.");
}
}
public class Chuveiro {
public void ligar() {
System.out.println("Chuveiro ligado.");
}
}
Crie a classe ManhaFacade com um método acordar() que desligue o despertador, faça o café e ligue o chuveiro, nessa ordem.
No main, use só a fachada: crie um objeto ManhaFacade e chame acordar().