1 - Qual problema o padrão Observer resolve? Dê um exemplo do dia a dia que funcione como ele.

Ele resolve o problema dos "avise-me quando chegar", dando um exemplo prático de uma loja online, o Observer notifica o usuário que se cadastrou para receber o aviso, ao invés do próprio ter que ficar entrando no site de tempos em tempos para saber se o produto chegou.

2 - No Observer, o que é o Subject  e o que é o Observer? Como o Subject avisa os observadores sem conhecer as classes concretas deles?

Subject: tem o estado; Observer: é um contrato, é uma interface com o método que será chamado quando houver uma novidade. O subject guarda a lista de observers e oferece três operações: inscrever, desinscrever e notificar, e as classes implementam e a interface e reagem do seu jeito.

3 - Se você precisar adicionar um novo interessado, por exemplo um Entregador que também precisa saber quando o pedido muda de status, o que é preciso alterar na classe Pedido? Por quê?

Basta se "inscrever" na lista - pedido.adicionarObservador() - por exemplo, ele ativa o for quando o pedido é aprovado e avisa todo mundo que está lá, sem saber quem são. 


4 - A interface já está pronta:

public interface ObservadorVoo {
void atualizar(String status);

}

a) Crie uma classe Passageiro que implementa ObservadorVoo e, no atualizar, imprime "Passageiro avisado: " + o status.

b) Crie uma classe Voo com uma lista de ObservadorVoo, um método adicionarObservador(ObservadorVoo o) e um método mudarStatus(String status), que chama o atualizar de todos da lista.

c) No main, crie um voo, adicione um passageiro e mude o status para "Embarque iniciado".

5 - Crie uma classe PainelAeroporto que também implementa ObservadorVoo e imprime "Painel: " + o status. No main, adicione ao voo um passageiro um painel, e mude o status para "Atrasado". Os dois devem ser avisados.


6 - Agora monte o mesmo padrão do zero, com outro tema:

a) Crie uma interface ObservadorEstoque com o método void atualizar(int quantidade).

b) Crie uma classe RegistroEstoque que implementa a interface e imprime "Nova quantidade: " + a quantidade.

c) Crie uma classe Estoque com uma lista de observadores, um método adicionarObservador e um método setQuantidade(int quantidade), que avisa todos da lista.

d) No main, adicione um RegistroEstoque e mude a quantidade duas vezes.