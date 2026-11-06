package org.example.aula17.factory;

public class Main {
    static void main(String[] args) {
        Animal animal = AnimalFactory.getAnimal("gato");
        animal.emitirSom();

        Animal animal2 = AnimalFactory.getAnimal("cachorro");
        animal2.emitirSom();
    }
}
