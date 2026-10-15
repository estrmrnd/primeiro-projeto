package org.example.revisao3;

public class Pet {
//4)
    String nome;
    String especie;
    double peso;
    String porte;

//5)
    public String definirPorte() {
        if(peso >= 30){
            return "Porte: grande";
        }else if(peso >= 15){
            return "Porte: médio";
        }else{
            return "Porte: pequeno";
        }
    }
}
