/*
Tem-se um conjunto de dados contendo a altura e o gênero (M, F) de N pessoas. Fazer um programa
que calcule e escreva a maior e a menor altura do grupo, a média de altura das mulheres, e o número
de homens.
Exemplo:

Quantas pessoas serao digitadas? 5
Altura da 1a pessoa: 1.70
Genero da 1a pessoa: F
Altura da 2a pessoa: 1.83
Genero da 2a pessoa: M
Altura da 3a pessoa: 1.54
Genero da 3a pessoa: M
Altura da 4a pessoa: 1.61
Genero da 4a pessoa: F
Altura da 5a pessoa: 1.75
Genero da 5a pessoa: F
Menor altura = 1.54
Maior altura = 1.83
Media das alturas das mulheres = 1.69
Numero de homens = 2
---------------------------------------------------------------------------------------------------
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?: ");
		int n = sc.nextInt();
		
		Dados[] vect = new Dados[n];
		int countM = 0;
		int countH = 0;
		for(int i = 0; i < vect.length; i++) {
			System.out.print("Altura da " + (i + 1) + "a pessoa: ");
			double height = sc.nextDouble();
			System.out.print("Genero da " + (i + 1) + "a pessoa: ");
			char sex = sc.next().charAt(0);
			if(sex == 'F') {
				countM++;
			}
			else {
				countH++;
			}
			vect[i] = new Dados(height, sex);
		}
		
		double contMaior = 0;
		double contMenor = 3.0;
		double media = 0;
		double soma = 0;
		for(int i = 0; i < vect.length; i++) {
			if(vect[i].getSex() == 'F') {
				soma += vect[i].getHeight();
			}
			
			else if(contMaior < vect[i].getHeight()) {
				contMaior = vect[i].getHeight();
			}
			
			else if(contMenor > vect[i].getHeight()) {
				 contMenor = vect[i].getHeight();
			}
		}
		 
		media = soma / countM;
		System.out.println();
		System.out.println("Menor altura: " + contMenor);
		System.out.println("Maior altura: " + contMaior);
		System.out.printf("Media das alturas das mulheres: %.2f\n", media);
		System.out.print("Numero de Homens: " + countH);
		
		
		sc.close();

	}

}
