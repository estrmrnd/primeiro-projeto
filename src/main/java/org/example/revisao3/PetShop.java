package org.example.revisao3;

import java.util.*;

public class PetShop {
    static int cadastrarPet(Scanner sc, Pet[] pets, int total){
        Pet pet;
        System.out.println("Digite o nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite a espécie: ");
        String especie = sc.nextLine();
        if(especie.equalsIgnoreCase("Cachorro")){
            pet = new Cachorro();
        } else if(especie.equalsIgnoreCase("Gato")){
            pet = new Gato();
        }else{
            pet = new Pet();
        }
            pet.nome = nome;
            pet.especie = especie;
        System.out.println("Digite o peso: ");
        pet.peso = sc.nextDouble();
        sc.nextLine();
        pet.porte = pet.definirPorte();
        System.out.println("Porte: " +  pet.porte);
        pet.emitirSom();
        pets[total] = pet;
        total++;
        return total;
    }
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
        ArrayDeque<String> filaBanho = new ArrayDeque<>();
        ArrayList<Servico> servicos = new ArrayList<>(List.of(new Banho(), new Consulta(), new Tosa()));

        while(opcao != 0) {
            System.out.println("=== PETSHOP ===\n" +
                    "Para cadastrar o pet, digite 1\n" +
                    "Para listar os pets, digite 2\n" +
                    "Para buscar algum pet, digite 3\n" +
                    "Para verificar espécies cadastradas, digite 4\n" +
                    "Para adicionar o pet a fila, digite 5\n" +
                    "Para atender o próximo pet, digite 6\n" +
                    "Para executar os serviços, digite 7\n" +
                    "e/ou para sair, digite 0: ");
    //10)
            try {
                opcao = sc.nextInt();
                sc.nextLine();
                String nomeBusca;

                switch (opcao) {
                    case 1:
                        if (total >= pets.length) {
                            System.out.println("Lista de cadastro cheia!");
                        } else {
                            total = cadastrarPet(sc, pets, total);
                            System.out.println("Pet cadastrado com sucesso! Agora são " + total + " pets!");
                        }
                        break;
                    case 0:
                        System.out.println("Até logo!");
                        break;
//8)
                    case 2:
                        if (total == 0) {
                            System.out.println("Nenhum pet cadastrado!");
                        } else {
                            for (int i = 0; i < total; i++) {
                                System.out.println(pets[i].nome + " (" + pets[i].especie + ") " + "Peso: " + pets[i].peso + " Porte: " + pets[i].porte);
                                pets[i].emitirSom();
                                mostrarFicha(pets[i]);
                                mostrarFicha(pets[i], "=== FICHA DO PET ===");
                            }
                        }
                        break;
                    case 3:
                        boolean acharPet = false;
                        System.out.println("Qual o nome do pet?");
                        nomeBusca = sc.nextLine();
                        for (int i = 0; i < total; i++) {
                            if (pets[i].nome.equalsIgnoreCase(nomeBusca)) {
                                System.out.println("Pet " + pets[i].nome + " encontrado!" + " Espécie: " + pets[i].especie + " Peso: " + pets[i].peso + "  Porte: " + pets[i].porte);
                                acharPet = true;
                                break;
                            }
                        }
                        if (!acharPet) {
                            System.out.println("Nenhum pet encontrado!");
                        }
                        break;
//11)
                    case 4:
                        HashSet<String> especies = new HashSet<>();
                        for(int i = 0; i < total; i++){
                        especies.add(pets[i].especie);
                    }
                        for (String especie : especies){
                            System.out.println(especie);
                        }
                        System.out.println("Total de espécies diferentes: " + especies.size());
                    break;
                    case 5:
                        System.out.println("Digite o nome do pet que irá entrar na fila: ");
                        String filaNome = sc.nextLine();
                        filaBanho.add(filaNome);
                        System.out.println(filaNome + " entrou na fila. Fila atualizada: " + filaBanho);
                    break;
                    case 6:
                        if(!filaBanho.isEmpty()) {
                            System.out.println("Próximo da fila: " + filaBanho.peek());
                            System.out.println("Atendendo: " + filaBanho.poll());
                            System.out.println("Fila agora: " + filaBanho);
                        }else{
                            System.out.println("Fila vazia.");
                        }
                        break;
                    default:
                        System.out.println("Opção inválida, tente novamente.");
                        break;
                    case 7:
                        System.out.println("Digite o nome do pet: ");
                        String nomePet = sc.nextLine();

                        for(Servico servico : servicos){
                            servico.executar(nomePet);
                        }
                        break;
                }
            }catch (InputMismatchException e){
                System.out.println("Digite apenas números!");
                sc.nextLine();
            }
        }




    }

    static void mostrarFicha(Pet pet){
        System.out.println(pet.nome);
    }

    static void mostrarFicha(Pet pet, String titulo){
        System.out.println(titulo + "Nome: " + pet.nome
        + "\nEspécie: " + pet.especie + "\nPeso: " + pet.peso + "\nPorte: " + pet.porte);
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
