/*
Fazer um programa para ler um conjunto de nomes de pessoas e suas respectivas idades. Os nomes
devem ser armazenados em um vetor, e as idades em um outro vetor. Depois, mostrar na tela o nome
da pessoa mais velha.
Exemplo:
Quantas pessoas voce vai digitar? 5
Dados da 1a pessoa:
Nome: Joao
Idade: 16
Dados da 2a pessoa:
Nome: Maria
Idade: 21
Dados da 3a pessoa:
Nome: Teresa
Idade: 15
Dados da 4a pessoa:
Nome: Carlos
Idade: 23
Dados da 5a pessoa:
Nome: Paulo
Idade: 17
PESSOA MAIS VELHA: Carlos
------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;
import entities.Dados;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas voce deseja digitar?: ");
		int n = sc.nextInt();
		Dados[] vect = new Dados[n];
		
		int maior = 0;
		String nome = null;
		for(int i = 0; i< vect.length; i++) {
			sc.nextLine();
			System.out.println("Dados da " + i + "a pessoa:" );
			String name = sc.nextLine();
			int age = sc.nextInt();
			vect[i] = new Dados(name, age);
			if(vect[i].getAge() > maior) {
				maior = vect[i].getAge();
				nome = vect[i].setName();
			}
			
		}
		
		System.out.print(maior );
		System.out.println("PESSOA MAIS VELHA: " + nome);
		sc.close();

	}

}
