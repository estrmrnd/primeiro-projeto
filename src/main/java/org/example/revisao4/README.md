Questão 1: Abstração
a) Explique, com suas palavras, o que é abstração em programação orientada a objetos.

É simplesmente esconder o que não é preciso ver.

b) Qual a diferença entre abstração e encapsulamento?

Encapsulamento diz quem pode mexer no quê e abstração é o que mostrar e o que esconder, não por segredo ou algo do tipo, mas para simplificar.

c) Quando você usa lista.add("Ana"), você sabe como o Java guarda esse elemento na memória? Por que isso é um exemplo de abstração?

Porque não precisamos saber como ele "add" na memória, não focando na complexidade e apenas no que queremos fazer.


Questão 2: SOLID
Para cada código abaixo, diga qual princípio do SOLID está sendo violado e explique como você corrigiria.

a)
java
class Relatorio {
void calcularTotais() { /* ... */ }
void formatarEmPdf() { /* ... */ }
void salvarNoDisco() { /* ... */ }
void enviarPorEmail() { /* ... */ }
}

S: a classe está fazendo quatro coisas diferentes e uma classe deveria ter apenas uma responsabilidade principal. 


b)
java
class EnviadorEmail {
void enviar(String tipo) {
if (tipo.equals("aniversario")) {
System.out.println("Feliz aniversário!");
} else if (tipo.equals("seguranca")) {
System.out.println("Alerta de segurança!");
} else if (tipo.equals("promocao")) {
System.out.println("Promoção imperdível!");
}
}
}

O: aberto e fechado: o codigo deve está aberto para extensão e fechado para modificação. o codigo acima, sempre que precisar enviar um novo email, precisará ser modificado. 

c)
java
class PedidoService {
private MySQLRepositorio repo = new MySQLRepositorio();

    void finalizar() {
        repo.salvar();
    }
}

D: o pedido service depende da implementação do mysql... e se quiser trocar por outro banco de dados, terá que modificar a classe.

Questão 3: Getters e Setters
Crie uma classe Produto com os atributos privados nome (String), preco (double) e quantidade (int).

Crie getters e setters para todos os atributos.
O setter de preco não deve aceitar valores menores ou iguais a zero.
O setter de quantidade não deve aceitar valores negativos.
No main, crie um produto, preencha os atributos pelos setters, tente colocar um preço negativo, e imprima os dados usando os getters.


Questão 4: Modificadores de acesso

Explique quem pode acessar um atributo ou método declarado com cada modificador:

a) private: pode ser acessado dentro da classe, outras precisariam de metodos acessiveis como getters.

b) default (sem modificador): pode ser acessado por outras classes que estejam no mesmo package.

c) protected: pode ser acessado por classes do mesmo package e por subclasses de outros packages, respeitando as regras de herança do java.

d) public: pode ser acessado por outras classes até mesmo de packages distintos, desde a classe produto, por exemplo, seja acessível.


Questão 5: Classe abstrata
a) Crie uma classe abstrata Forma com:

um atributo nome;
um construtor que recebe o nome;
um método normal exibirNome(), que imprime o nome da forma;
um método abstrato calcularArea(), que retorna um double.

b) Crie uma classe Retangulo que herda de Forma, tem os atributos largura e altura, e implementa calcularArea().

c) No main, crie um Retangulo, chame exibirNome() e imprima a área.

d) Agora tente escrever Forma f = new Forma("teste");. O que acontece? Por quê?


Questão 6: Exercício integrado (Sistema de Funcionários)

Faça em etapas.

Etapa 1. Crie uma classe abstrata Funcionario com atributos privados nome e salarioBase, um construtor que recebe os dois, getters, e um setter de salarioBase que não aceite valores negativos.

Etapa 2. Adicione à classe Funcionario um método abstrato calcularSalario().

Etapa 3. Crie duas classes que herdam de Funcionario:

Desenvolvedor: o salário é o salário base mais 20%. ( salario = salarioBase + (salarioBase * 0.20) ou

salario = salarioBase * 1.20

)
Gerente: o salário é o salário base mais 50%. (

salario = salarioBase + (salarioBase * 0.50) ou salario = salarioBase * 1.50 )


Etapa 4. Crie uma interface Notificador com o método notificar(String mensagem). Crie duas implementações: NotificadorEmail e NotificadorSms, cada uma imprimindo a mensagem de um jeito diferente.

Etapa 5. Crie uma classe FolhaPagamento que recebe um Notificador pelo construtor e tem um método pagar(Funcionario f), que calcula o salário e usa o notificador para avisar o funcionário.

Etapa 6. No main, crie um desenvolvedor e um gerente, pague os dois usando uma folha com notificação por email, e depois crie outra folha com notificação por SMS.

Pergunta final: quais princípios e conceitos de POO você usou em cada etapa?