Questão 1. Uma açaiteria vende açaí com qualquer combinação de adicionais: granola, leite ninho, morango, paçoca. Por que criar uma classe para cada combinação (AcaiComGranola, AcaiComGranolaEMorango, AcaiComMorangoEPacoca...) é um problema? O que o Decorator faz no lugar?
pq gera muitas classes para manter, codigo repetido, pouca flexibilidade para combinar os ingredientes e dificuldade para adicionar novos adicionais.
o decorator resolve permitindo adicionar cada ingrediente como uma camada ao objeto original, sem precisar criar uma classe para cada combinação.



Questão 2. Em um Decorator, por que a classe AcaiDecorator tem implements Acai?

a) Para poder ser criada com new
b) Para que um adicional também conte como açaí e possa ir dentro de outro adicional
c) Para herdar o preço do açaí simples
d) Para não precisar usar o super
LETRA B

Questão 3 (prática). O seu sistema já tem esta interface e estas duas classes:

public interface Acai {
String getDescricao();
double getPreco();
}

public class AcaiSimples implements Acai {
public String getDescricao() {
return "Açaí Simples";
}

    public double getPreco() {
        return 12.00;
    }
}

public abstract class AcaiDecorator implements Acai {
protected Acai acaiEmbrulhado;

    public AcaiDecorator(Acai acai) {
        this.acaiEmbrulhado = acai;
    }
}

No main:

Crie um açaí só com granola e imprima a descrição e o preço.
Crie um açaí com granola e morango (um adicional embrulhando o outro) e imprima a descrição e o preço.