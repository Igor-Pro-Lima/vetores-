/* Problema Exemplo:
   
   Fazer um programa para ler um número inteiro positivo N (máximo = 10), depois ler 
   N números quaisquer e armazaná-los em um vetor. Em seguida, mostrar na tela todos 
   elementos do vetor.
   
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quanto numeros você vai digitar? ");
		int N = sc.nextInt();
		
		double[] vet = new double[N];
		
		for (int i = 0; i < N; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		System.out.println();
		System.out.println("NUMEROS DIGITADOS:");
		for (int i = 0; i < N; i++) {
			System.out.println(String.format("%.1f", vet[i]));
		}
		
		
		sc.close();

	}

}
