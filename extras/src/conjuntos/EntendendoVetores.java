package conjuntos;

import java.util.Scanner;

public class EntendendoVetores {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Declarando um vetor sem valores
		int valores[] = new int[5];
		
		// Inserindo valores no vetor
		valores[0] = 10;
		System.out.println("Digite um valor inteiro");
		valores[1] = leitor.nextInt();
				
		// Exibir valores
		System.out.println(valores[0]);
		System.out.println(valores[1]);
		
		// Declarando um vetor com valores
		String jedi[] = {"Mestre Yoda", "Luke Skywalker", "Obi-wan"};
		System.out.println(jedi[1]);
		
		// Preenchendo os valores em um vetor usando loop
		for (int i=0; i<jedi.length; i++) {
			System.out.println("Digite o nome do Jedi");
			jedi[i] = leitor.next();
		}
		
		// Exibindo usando loop
		for (int i=0; i<jedi.length; i++) {
			System.out.println(jedi[i]);
		}
	}

}
