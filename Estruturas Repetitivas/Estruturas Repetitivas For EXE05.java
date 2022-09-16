/*/
Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
Lembrando que, por definição, fatorial de 0 é 1.
Exemplos:
Entrada: 			    Saída:
4 			    	    24
Entrada:			    Saída:
1 				        1
Entrada: 			    Saída:
5				          120
Entrada: 			    Saída:
0 				        1
-----------------------------------------------------------------------------------------------------------------
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int f = 1;
				
		if (n == 0) {
			f = 1;
		}
		else {
			for (int i = n ; i > 1; i--) {
				f *= i;								
			 }
		}
		 System.out.println("Fatorial " + n + "!= " + f);
		 		
		sc.close();

	}

}
