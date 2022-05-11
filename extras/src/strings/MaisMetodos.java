package strings;

public class MaisMetodos {

	public static void main(String[] args) {
		String faculdade = new String("FIAP - A melhor faculdade de Tecnologia");
		
		// Método startsWith()
		System.out.println(faculdade.startsWith("FIAP"));

		// Método endsWith()
		System.out.println(faculdade.endsWith("Tecnologia"));
		
		// Método charAt()
		System.out.println(faculdade.charAt(7));
		
		// Método indexOf()
		System.out.println(faculdade.indexOf("-"));
		
		// Método lastIndexOf()
		System.out.println(faculdade.lastIndexOf("a")); 
		
		// Método substring()
		System.out.println(faculdade.substring(7));
		System.out.println(faculdade.substring(0, 4));
		System.out.println(faculdade.substring(faculdade.indexOf("T")));
		
		// Métodos toUpperCase() e toLowerCase()
		System.out.println(faculdade.toUpperCase());
		System.out.println(faculdade.toLowerCase());
		
		// Método replace()
		System.out.println(faculdade.replace("A melhor", "A mais incrivel"));
	}

}
