package org.example.revisao3;

import java.util.Scanner;

public class PetShop {
    static void PetShop() {
//1)
//   String nome = "Mel";
//   String especie = "Cachorro";
//   double peso = 4.50;
//
//   System.out.println("=== FICHA DO PET ===");
//   System.out.println("Nome: " + nome);
//   System.out.println("Especie: " + especie);
//   System.out.printf("Peso: %.1f%n", peso);

//2)

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Qual o nome do seu Pet: ");
//        String nome = sc.nextLine();
//        System.out.println("Que tipo é o seu Pet: ");
//        String especie =  sc.nextLine();
//        System.out.println("Qual o peso do seu Pet: ");
//        double peso = sc.nextDouble();
//
//
//        System.out.println("=== FICHA DO PET ===");
//        System.out.println("Nome: " + nome);
//        System.out.println("Especie: " + especie);
//        System.out.printf("Peso: %.1f%n", peso);
//

//3)

//        if(peso >= 30){
//            System.out.println("Porte: grande");
//        }else if(peso >= 15){
//            System.out.println("Porte: médio");
//        }else{
//            System.out.println("Porte: pequeno");
//        }

//6)
//        Pet[] pets = new Pet[5];
//        Pet pet = new Pet();
//        pets[0] = pet;
//
//        pet.nome = "Mel";
//        pet.especie = "Poodle";
//        pet.peso = 8.5;
//        pet.porte = pet.definirPorte();
//        System.out.println("=== FICHA DO PET ===");
//        System.out.println(pets[0].nome + " " + pets[0].especie + " " + pets[0].peso + " " + pets[0].porte);


//7)
        int opcao = -1;
        int total = 0;
        Scanner sc = new Scanner(System.in);
        Pet[] pets = new Pet[5];

        while(opcao != 0){
            System.out.println("Para cadastrar o pet, digite 1 e/ou para sair, digite 0: ");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1:
                    Pet pet = new Pet();
                    System.out.println("Digite o nome: ");
                    pet.nome = sc.nextLine();
                    System.out.println("Digite o peso: ");
                    pet.peso = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("Digite a espécie: ");
                    pet.especie = sc.nextLine();
                    pets[total] = pet;
                    total++;
                    System.out.println("Pet cadastrado com sucesso! Agora são " + total + " pets!");
                    break;
                case 0:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
                    break;
            }
        }




    }


    static void main() {
       PetShop();

//       Pet pet = new Pet();
//        pet.nome = "Mel";
//        pet.especie = "cachorro";
//        pet.peso = 24.5;
//
//
//        System.out.println("=== FICHA DO PET ===");
//        System.out.println("Nome: " + pet.nome);
//        System.out.println("Especie: " + pet.especie);
//        System.out.printf("Peso: %.1f%n", pet.peso);
//        pet.definirPorte();



    }
}
