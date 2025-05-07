package Aula0705;

import java.util.Scanner;

public class ATIV1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nomes = new String[5]; 


        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine(); 
        }

        
        System.out.println("\nNomes digitados:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Nome " + (i + 1) + ": " + nomes[i]);
        }

        scanner.close(); 
    }
}
