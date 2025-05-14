package Aula0705;

import java.util.Scanner;

public class ATIVIDADE3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] c = new int[10];

        // Entrada de dados para vetor A
        System.out.println("Digite 5 números inteiros para o vetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print("A[" + i + "]: ");
            a[i] = scanner.nextInt();
        }

        // Entrada de dados para vetor B
        System.out.println("\nDigite 5 números inteiros para o vetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print("B[" + i + "]: ");
            b[i] = scanner.nextInt();
        }

        // União dos vetores A e B em C
        for (int i = 0; i < 5; i++) {
            c[i] = a[i];         // Primeiros 5 elementos de A
            c[i + 5] = b[i];     // Próximos 5 elementos de B
        }

        // Exibição dos vetores
        System.out.println("\nVetor A:");
        for (int i = 0; i < 5; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.println("\n\nVetor B:");
        for (int i = 0; i < 5; i++) {
            System.out.print(b[i] + " ");
        }

        System.out.println("\n\nVetor C (União de A e B):");
        for (int i = 0; i < 10; i++) {
            System.out.print(c[i] + " ");
        }

        scanner.close();
    }
}
