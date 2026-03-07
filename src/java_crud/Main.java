package java_crud;

import java.util.ArrayList; // Importa a lista dinâmica
import java.util.Scanner;   // Importa leitor de dados do teclado

public class Main {

    // Lista que armazena todos os utilizadores registados
    static ArrayList<User> users = new ArrayList<>();

    // Scanner para ler dados digitados pelo utilizador
    static Scanner scanner = new Scanner(System.in);

    // Contador automático de ID
    static int contadorId = 1;

    public static void main(String[] args) {

        int opcao; // Variável para guardar a opção do menu

        // Loop que mantém o programa rodando até escolher sair
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1 - Criar utilizador");
            System.out.println("2 - Listar utilizadores");
            System.out.println("3 - Atualizar utilizador");
            System.out.println("4 - Deletar utilizador");
            System.out.println("0 - Sair");
            System.out.print("Escolha: ");

            // Lê número digitado
            opcao = scanner.nextInt();
            scanner.nextLine(); 
            // Limpa o buffer do teclado (IMPORTANTE)

            // Switch decide qual método executar
            switch (opcao) {
                case 1 -> criar();
                case 2 -> listar();
                case 3 -> atualizar();
                case 4 -> deletar();
                case 0 -> System.out.println("Saiu...");
                default -> System.out.println("Opção inválida!");
            }

        } while (opcao != 0); // Continua até escolher 0
    }

    // ===============================
    // CREATE
    // ===============================
    public static void criar() {

        System.out.print("Nome: ");
        String nome = scanner.nextLine(); // Lê nome

        System.out.print("Email: ");
        String email = scanner.nextLine(); // Lê email

        // Cria novo objeto utilizador
        User user = new User(contadorId++, nome, email);

        // Adiciona na lista
        users.add(user);

        System.out.println("utilizador criado com sucesso!");
    }

    // ===============================
    // READ
    // ===============================
    public static void listar() {

        // Verifica se a lista está vazia
        if (users.isEmpty()) {
            System.out.println("Nenhum utilizador registado.");
        } else {
            // Percorre a lista e imprime cada utilizador
            users.forEach(System.out::println);
        }
    }

    // ===============================
    // UPDATE
    // ===============================
    public static void atualizar() {

        System.out.print("Digite o ID do utilizador: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // Percorre a lista procurando o ID
        for (User u : users) {
            if (u.getId() == id) {

                System.out.print("Novo nome: ");
                u.setNome(scanner.nextLine());

                System.out.print("Novo email: ");
                u.setEmail(scanner.nextLine());

                System.out.println("Atualizado com sucesso!");
                return; // Encerra o método
            }
        }

        // Se não encontrou o ID
        System.out.println("utilizador não encontrado.");
    }

    // ===============================
    // DELETE
    // ===============================
    public static void deletar() {

        System.out.print("Digite o ID do utilizador: ");
        int id = scanner.nextInt();
        scanner.nextLine();

        // removeIf percorre a lista e remove se a condição for verdadeira
        users.removeIf(u -> u.getId() == id);

        System.out.println("Se existia, foi removido.");
    }
}