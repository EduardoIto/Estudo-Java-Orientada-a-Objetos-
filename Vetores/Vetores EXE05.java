/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida, mostrar na tela
o maior número do vetor (supor não haver empates). Mostrar também a posição do maior elemento,
considerando a primeira posição como 0 (zero).
Exemplo:

Quantos numeros voce vai digitar? 6
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0
Digite um numero: 13.0
Digite um numero: 7.0

MAIOR VALOR = 14.0
POSICAO DO MAIOR VALOR = 3
------------------------------------------------------------------------------------------------
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros deseja digitar?: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		double maior = 0;
		int position = 0;
		for (int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if (vect[i] > maior) {
				maior = vect[i];
				position = i + 1;
			}
		}
		System.out.println();
		System.out.println("MAIOR VALOR = " + maior);
		System.out.println("POSICAO DO MAIOR VALOR = " + position);
		
		sc.close();

	}

}
