package org.example.aula15;
/*
6.  Crie uma classe Singleton chamada ContadorVisitas que:
    -tenha um atributo total, começando em 0;
    -tenha um método registrarVisita() que soma 1 ao total;
    -tenha um método getTotal() que devolve o total.

Depois, no main, obtenha ele duas vezes em variáveis diferentes pagina1 e pagina2, registre visitas usando as duas, e imprima o total. O resultado deve mostrar que as duas variáveis usam o mesmo contador.

Exemplo de saída esperada:

Total de visitas: 3

Dica: Para instanciar(criar) não use o new. Classe v1 = Classe.getInstancia();
*/

public class ContadorVisitas {
        private static ContadorVisitas instancia;

        private ContadorVisitas(){
        }

        public static ContadorVisitas getInstancia(){
                if(instancia == null){
                        instancia = new ContadorVisitas();
                }
                return instancia;
        }

        private int total = 0;
        public void registrarVisita(){
                total++;
        }

        public int getTotal(){
                return total;
        }


        static void main(String[] args) {
            ContadorVisitas pagina1 = ContadorVisitas.getInstancia();
            ContadorVisitas pagina2 = ContadorVisitas.getInstancia();

            pagina1.registrarVisita();
            pagina1.registrarVisita();
            pagina2.registrarVisita();

                //System.out.println(pagina1.getTotal());
                System.out.println(pagina2.getTotal());
        }

        // NO SINGLETON O PAGINA1 E PAGINA2 SÃO O MESMO OBJETO! ESSE É O SEGREDO
}



