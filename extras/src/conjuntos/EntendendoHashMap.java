package conjuntos;

import java.util.HashMap;
import java.util.Scanner;

public class EntendendoHashMap {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		HashMap<String, String> dados = new HashMap<String, String>();
		
		//put
		dados.put("RM123", "Jaspion");
		dados.put("RM456", "Lion-o");
		dados.put("RM789", "He-man");
		System.out.println(dados);
		dados.put("RM123", "Jiraya");
		System.out.println(dados);
		
		//get
		System.out.println(dados.get("RM456"));
		
		//containsKey
		System.out.println(dados.containsKey("RM789"));
		System.out.println(dados.containsKey("RM147"));
		
		//containsValue
		System.out.println(dados.containsValue("He-man"));
		System.out.println(dados.containsValue("Darth-vader"));
		
		//keySet
		System.out.println(dados.keySet());
		
		//remove
		dados.remove("RM123");
		System.out.println(dados);
		
		//clear
		dados.clear();;
		System.out.println(dados);

	}

}
