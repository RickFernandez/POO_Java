package conjuntos;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListSemTipo {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		ArrayList<String> lista = new ArrayList<String>();
		
		//Método add
		lista.add("Andre");
		lista.add("Henrique");
		lista.add("Juquinha");
		
		System.out.println(lista);
		
		//Método get
		System.out.println(lista.get(1));
		
		//Método remove
		lista.remove(0);
		System.out.println(lista);
		
		//Método set
		lista.set(0, "Yoda");
		System.out.println(lista);
		
		//Método indexOf
		lista.add(0, "Rick");;
		System.out.println(lista);
		System.out.println(lista.indexOf("Rick"));
		
		//Método lastIndexOf
		lista.add("Yoda");
		System.out.println(lista.lastIndexOf("Yoda"));
		
		//Método sublist
		System.out.println(lista.subList(1, 2));
	}

}
