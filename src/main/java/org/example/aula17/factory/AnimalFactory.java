package org.example.aula17.factory;

public class AnimalFactory {
    public static Animal getAnimal(String tipo){
        if(tipo.equalsIgnoreCase("gato")){
            return new Gato();
        } else if(tipo.equalsIgnoreCase("cachorro")){
            return new Cachorro();
        }

        throw new IllegalArgumentException("Animal desconhecido.");
    }
}
