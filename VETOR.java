package Aula0705;

import java.util.Scanner;

public class VETOR {
	public static void main(String[] args) {
		Scanner scanner = new Scanner (System.in);
		int[] numeros = new int[5];
		int i;
		
		for (i=0; i<5; i++) {
		System.out.println("Digite o valor " + (i + 1) +": ");
		numeros[i] = scanner.nextInt();
		}
		
		System.out.println("\nValores multiplicados por 2:");
		for(i =0; i <5; i++) {
			System.out.println((numeros[i] * 2) + " ");
		}
		scanner.close();
	}
}
