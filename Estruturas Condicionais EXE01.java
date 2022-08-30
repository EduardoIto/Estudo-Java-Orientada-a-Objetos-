/*
Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.
Exemplos:

Entrada: 		Saída:
-10			NEGATIVO

Entrada: 		Saída:
8 			NAO NEGATIVO

Entrada: 		Saída:
0 			NAO NEGATIVO

---------------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		
		System.out.println("Digite um numero inteiro: ");
		number = sc.nextInt();
		
		if (number >= 0) {
			System.out.println("Não Negativo");
		}
		else {
			System.out.println("Negativo");
		}
		
		sc.close();
	}

}
