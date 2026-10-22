package org.example.revisao3;

public class Pet {
//4)
    String nome;
    String especie;
    double peso;
    String porte;

//5)
    public String definirPorte() {
        if(peso >= 25){
            return "grande";
        }else if(peso >= 10){
            return "médio";
        }else{
            return "pequeno";
        }
    }

    public void emitirSom(){
        System.out.println("Emitindo som");
    }
}
