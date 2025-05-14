package Aula0705;

import java.util.Scanner;

public class ATIVIDADE2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] numeros = new int[5]; 
        int soma = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Digite o " + (i + 1) + "º número inteiro: ");
            numeros[i] = scanner.nextInt(); 
            soma += numeros[i]; 
        }
        
        if (soma > 30) {
            System.out.println("\nA soma dos valores é: " + soma);
        } else {
            System.out.println("\nA soma (" + soma + ") não é maior que 30.");
        }

        scanner.close(); 
    }
}