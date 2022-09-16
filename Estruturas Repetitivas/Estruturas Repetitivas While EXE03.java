/*
Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes. Escreva
um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel
4.Fim). Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até
que seja válido). O programa será encerrado quando o código informado for o número 4. Deve ser escrito a
mensagem: "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível, conforme exemplo.
Exemplo:

Entrada:            Saída:
8                   MUITO OBRIGAD
1                   Alcool: 1
7                   Gasolina: 2
2                   Diesel: 0
2
4

------------------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int sa = 0;
		int sg = 0;
		int sd = 0;
		
		while (cod != 4) {
			switch(cod) {
			case 1:
				sa = sa + 1;
				break;
			case 2:
				sg = sg + 1; 
				break;
			case 3:
				sd = sd + 1;
				break;
			case 4:
				break;
			}
			cod = sc.nextInt();	
		}
		
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + sa);
		System.out.println("Gasolina: " + sg);
		System.out.println("Diesel: " + sd);
		
		sc.close();

	}

}
