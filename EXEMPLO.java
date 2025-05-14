package Aula0705;

import java.util.Scanner;

public class EXEMPLO {
	public static void main(String[] args) {
		
		int a[] = new int [5];
		Scanner ler = new Scanner (System.in);
		for (int i =0; i<5; i++) {
			System.out.println("Informe o valor " + i+ ":");
			a[i]= ler.nextInt();
		}
		for (int i =0; i<5; i++) {
			System.out.println(a[i]);
		}
		ler.close();
	}
}
