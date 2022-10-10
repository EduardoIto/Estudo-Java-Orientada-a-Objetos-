/*
Fazer um programa para ler um vetor de N números inteiros. Em seguida, mostrar na tela a média
aritmética somente dos números pares lidos, com uma casa decimal. Se nenhum número par for
digitado, mostrar a mensagem "NENHUM NUMERO PAR"

Exemplo 1:
Quantos elementos vai ter o vetor? 6
Digite um numero: 8
Digite um numero: 2
Digite um numero: 11
Digite um numero: 14
Digite um numero: 13
Digite um numero: 20
MEDIA DOS PARES = 11.0

Exemplo 2:
Quantos elementos vai ter o vetor? 3
Digite um numero: 7
Digite um numero: 9
Digite um numero: 11
NENHUM NUMERO PAR
-----------------------------------------------------------------------------------------------
*/

package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos vai ter o vetor?: ");
		int n = sc.nextInt();
		double[] vect = new double[n];
		double soma = 0;
		int count = 0;
		
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Digite um numero: ");
			vect[i] = sc.nextDouble();
			if(vect[i] % 2 == 0) {
				soma += vect[i];
				count++;
			}
		}
		if(soma == 0) {
			System.out.println("NENHUM NUMERO PAR");
		}
		else {
			double media = soma / count;
			System.out.printf("MEDIA DOS PARES = %.1f%n", media);
		}
								
		sc.close();

	}

}
