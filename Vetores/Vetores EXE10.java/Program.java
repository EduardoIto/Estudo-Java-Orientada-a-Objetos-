/*
Fazer um programa para ler um conjunto de N nomes de alunos, bem como as notas que eles tiraram
no 1º e 2º semestres. Cada uma dessas informações deve ser armazenada em um vetor. Depois, imprimir
os nomes dos alunos aprovados, considerando aprovados aqueles cuja média das notas seja maior ou
igual a 6.0 (seis).

Exemplo:
Quantos alunos serao digitados? 4
Digite nome, primeira e segunda nota do 1o aluno:
Joao Silva
7.0
8.5
Digite nome, primeira e segunda nota do 2o aluno:
Maria Teixeira
9.2
6.5
Digite nome, primeira e segunda nota do 3o aluno:
Carlos Carvalho
5.0
6.0
Digite nome, primeira e segunda nota do 4o aluno:
Teresa Pires
5.5
6.5
Alunos aprovados:
Joao Silva
Maria Teixeira
Teresa Pires

----------------------------------------------------------------------------------------------------
*/

package Program;

import java.util.Locale;
import java.util.Scanner;

import entities.Media;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão digitados?: ");
		int n = sc.nextInt();
		
		Media[] vect = new Media[n];
		
		for(int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite nome, primeira e segunda nota do " + (i + 1) + "o aluno:");
			String name = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			vect[i] = new Media(name, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		
		double mediaFinal = 0;
		for(int i = 0; i< vect.length; i++) {
			mediaFinal = (vect[i].getN1() + vect[i].getN2()) / 2;
			if (mediaFinal >= 6.0) {
				System.out.println(vect[i].getName());
			}
		}
							
		sc.close();

	}

}
