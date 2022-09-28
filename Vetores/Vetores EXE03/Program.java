/*
Problema "alturas"
Correção: https://github.com/acenelio/curso-algoritmos/blob/master/java/alturas.java
Fazer um programa para ler nome, idade e altura de N pessoas, conforme exemplo. Depois, mostrar na
tela a altura média das pessoas, e mostrar também a porcentagem de pessoas com menos de 16 anos,
bem como os nomes dessas pessoas caso houver.
Exemplo:

Quantas pessoas serao digitadas? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 15
Altura: 1.82
Dados da 2a pessoa:
Nome: Maria
Idade: 16
Altura: 1.60
Dados da 3a pessoa:
Nome: Teresa
Idade: 14
Altura: 1.58
Dados da 4a pessoa:
Nome: Carlos
Idade: 21
Altura: 1.65
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
Altura: 1.78

Altura média: 1.69
Pessoas com menos de 16 anos: 40.0%
Joao
Teresa
-------------------------------------------------------------------------------------------------
*/

package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Height;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantas pessoas serao digitadas?: ");
		int n = sc.nextInt();
		Height[] vect = new Height[n];
		
		double totalHeight = 0.0;
		double menor = 0.0;
		double percentual = 0.0;
		for (int i = 0; i < vect.length ; i++) {
			sc.nextLine();
			System.out.println("Dados da " + (i + 1) + "a pessoa:");
			System.out.print("Nome: ");
			String name = sc.nextLine();
			System.out.print("Idade: ");
			int age = sc.nextInt();
			System.out.print("Altura: ");
			double height = sc.nextDouble();
			vect[i] = new Height(name, age, height);
			totalHeight += vect[i].getHeight();
			if (vect[i].getAge() < 16) {
				menor++;}
		}
		
		System.out.println();
		double mediaHeight = totalHeight / vect.length;
		System.out.printf("Altura media: %.2f%n", mediaHeight);
		percentual = (menor / n) * 100;
		System.out.println("Pessoas com menos de 16 anos: " + percentual + "%");
		for(int i = 0; i < vect.length; i++) {
			if (vect[i].getAge() < 16) {
			System.out.println(vect[i].getName());
			}
		}
		
		
		
		sc.close();
	}

}
