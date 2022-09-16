/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
situação.
Exemplos:

    y
 Q2 | Q1
____|____ x
    |
 Q3 | Q4

Entrada: 		Saída:
4.5 -2.2 		Q4

Entrada: 		Saída:
0.1 0.1 		Q1

Entrada: 		Saída:
0.0 0.0			Origem

---------------------------------------------------------------------------------------------------------------
*/

import java.util.Locale;
import java.util.Scanner;

public class Main6 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		float x, y;
		
		System.out.println("Digite 2 valores com uma casa decimal (X e Y): ");
		
		x = sc.nextFloat();
		y = sc.nextFloat();
		
		if ((x == 0) && (y == 0)) {
			System.out.println("Origem");
		}
		else if ((x > 0) && (y > 0)) {
			System.out.println("Q1");
		}
		else if ((x < 0) && (y > 0)) {
			System.out.println("Q2");
		}
		else if ((x < 0) && (y < 0)) {
			System.out.println("Q3");
		}
		else {
			System.out.println("Q4");
		}		
		
		sc.close();

	}

}
