package conjuntos;

import java.util.Scanner;

public class EntendendoArraysBidimensionais {

	public static void main(String[] args) {
		Scanner leiter = new Scanner(System.in);
		
		// Declarando um array bidimensional sem valores
		int bidimensional[][] = new int[5][3];
		
		// Inserindo valores no array bidimensional
		bidimensional[3][0] = 5;
				System.out.println(bidimensional[3][0]);
		
		// Preenchendo valores em um array bidimensional usando um loop
		for (int linhas = 0; linhas < 5; linhas++) {
			for (int colunas = 0; colunas < 3; colunas++) {
				System.out.println("Informe um valor");
				bidimensional[linhas][colunas] = leiter.nextInt();
			}
		}
		
		// Exibindo valores com um loop
		for (int linhas = 0; linhas < 5; linhas++) {
			System.out.println("Iniciando a linha " + linhas);
			for (int colunas = 0; colunas < 3; colunas++) {
				System.out.println("Na coluna " + colunas + " o valor e " + bidimensional[linhas][colunas]);
			}
		}
	}

}
