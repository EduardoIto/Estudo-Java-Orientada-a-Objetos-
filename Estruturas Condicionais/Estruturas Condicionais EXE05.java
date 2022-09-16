/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
seguir, calcule e mostre o valor da conta a pagar.
Exemplos:

CODIGO 	 ESPECIFICAÇÃO      PREÇO
1	 CACHORRO QUENTE    R$4.00
2	 X-SALADA	    R$4.50
3	 X-BACON	    R$5.00
4	 TORRADA SIMPLES    R$2.00
5	 REFRIGERANTE	    R$1.50


Entrada: 		Saída:
3 2 			Total: R$ 10.00

Entrada: 		Saída:
2 3 			Total: R$ 13.50
---------------------------------------------------------------------------------------------------------------
*/

import java.util.Locale;
import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o COD do item e a quantidade desejada: ");
						
		int cod, qtd;
		double total = 0;
		
		cod = sc.nextInt();
		qtd = sc.nextInt();
		
		if (cod == 1) {
			total = qtd * 4.00;			
		}
		else if (cod == 2) {
			total = qtd * 4.50 ;
		}
		else if (cod == 3) {
			total = qtd * 5.00 ;
		}
		else if (cod == 4) {
			total = qtd * 2.00;
		}
		else if (cod == 5) {
			total = qtd * 1.50;
		}
		else {
			System.out.println("COD INEXISTENTE");
		}
		
		System.out.printf("TOTAL: R$ %.2f", total);
		
		sc.close();
	}

}
