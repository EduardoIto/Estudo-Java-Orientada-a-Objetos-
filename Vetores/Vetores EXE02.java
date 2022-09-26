/*
Faça um programa que leia N números reais e armazene-os em um vetor. Em seguida:
- Imprimir todos os elementos do vetor
- Mostrar na tela a soma e a média dos elementos do vetor
Exemplo:

Quantos numeros voce vai digitar? 4
Digite um numero: 8.0
Digite um numero: 4.0
Digite um numero: 10.0
Digite um numero: 14.0

VALORES = 8.0 4.0 10.0 14.0
SOMA = 36.00
MEDIA = 9.00
--------------------------------------------------------------------------------
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos numeros voce deseja digitar?: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.print("VALORES = ");
		double soma = 0;
		for(int i = 0; i < n; i++) {
			System.out.print(vect[i] + " ");
			soma += vect[i];
		}
		double media = soma / n;
		
		System.out.println();
		System.out.printf("SOMA: %.2f%n", soma);
		System.out.printf("MEDIA: %.2f%n", media);
		
		sc.close();

	}

}


