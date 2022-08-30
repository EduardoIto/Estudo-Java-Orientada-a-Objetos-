import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int V1, V2, SOMA;
		
		V1 = sc.nextInt();
		V2 = sc.nextInt();
		SOMA = V1 + V2;
		System.out.println("A soma dos dois numeros digitados = " + SOMA);
				
		sc.close();
	}
}
