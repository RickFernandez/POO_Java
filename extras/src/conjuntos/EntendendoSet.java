package conjuntos;

import java.util.HashSet;
import java.util.Scanner;

public class EntendendoSet {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		HashSet<String> set = new HashSet<String>();
		
		// add
		set.add("Sistemas de Informacao");
		set.add("Analise e Desenvolvimento de Sistemas");
		set.add("Sistemas para Internet");
		set.add("Sistemas para Internet");
		set.add("sistemas para Internet");
		System.out.println(set);
		
		//clear
//		set.clear();
//		System.out.println(set);
		
		//contains
		System.out.println(set.contains("Analise e Desenvolvimento de Sistemas"));
		System.out.println(set.contains("Engenharia Mecatronica"));
		
		// isEmpty
		System.out.println(set.isEmpty());
		
		//remove
		System.out.println(set.remove("sistemas para Internet"));
		System.out.println(set);
		
		//size
		System.out.println("No HashSet criado temos " + set.size() + " elementos");
		
		//toArray
		System.out.println(set.toArray());
		
	}

}
