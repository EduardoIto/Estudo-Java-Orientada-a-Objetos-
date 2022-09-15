/*
Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
Exemplo:

Entrada:            Saída:
3                   -1.5
3 -2                divisao impossivel
-8 0                0.0
0 8
-----------------------------------------------------------------------------------------------------------
*/

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			double a = sc.nextDouble();
			double b = sc.nextDouble();
			double div = a / b;
			if (b == 0) {
				System.out.println("Divisao Impossivel");
			}
			else {
				System.out.printf("%.1f", div);
			}
		}
		
		sc.close();

	}

}
