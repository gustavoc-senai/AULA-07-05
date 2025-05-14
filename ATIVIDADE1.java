package Aula0705;

import java.util.Scanner;

public class ATIVIDADE1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // para ler entrada do usuário

        String[] nomes = new String[5]; // vetor para armazenar 5 nomes

        // Leitura dos nomes
        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine(); // lê o nome e armazena no vetor
        }

        // Exibição dos nomes armazenados
        System.out.println("\nNomes digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }

        scanner.close(); // fecha o Scanner
    }
}