package conjuntos;

import java.util.ArrayList;
import java.util.Scanner;

import contas.Conta;

public class ArrayListComTipo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayList<Conta> contas = new ArrayList<Conta>();
		
		//Método add
		contas.add(new Conta(1, 17, "Jose"));
		contas.add(new Conta(2, 50, "Amilton"));
		contas.add(new Conta(3, 157, "Rick"));
		
		//Método get
		System.out.println(contas.get(2));
		
		//Método remove
		
		//Método set
		
		//Método indexOf
		
		//Método lastIndexOf
		
		//Método sublist

		//Usando loop for
		for(Conta conta:contas) {
			System.out.println(conta);
		}
	}

}
