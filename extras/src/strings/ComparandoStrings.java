package strings;

public class ComparandoStrings {

	public static void main(String[] args) {
		//Comparação com o ==
		String nome3 = new String("FIAP");
		String nome4 = new String("FIAP");
		
		if (nome3 == nome4) {
			System.out.println("\nNomes iguais");
		}else {
			System.out.println("\nNomes diferentes");
		} //Nomes diferentes, pois as strings foram instanciadas com o operador "new", logo, possuem um espaço de memória separado.
		
		String nome5 = "FIAP";
		String nome6 = "FIAP";
		
		if (nome5 == nome6) {
			System.out.println("\nNomes iguais");
		}else {
			System.out.println("\nNomes diferentes");
		} //Neste caso os nomes são iguais, pois vão compartilhar o mesmo espaço de memória no pool.
		
		String nome7 = new String("FIAP");
		String nome8 = "FIAP";
		
		if (nome7 == nome8) {
			System.out.println("\nNomes iguais");
		}else {
			System.out.println("\nNomes diferentes");
		} //Nomes diferentes, pois um foi instanciado e outro não, logo, estão armazenados em diferentes espaços de memória.
		
		// Comparação com o Método "equals" (ignora onde estão armazenadas e compara somente os conteúdos das variáveis)
		String a  = new String("Fiap");
		String b = "fiap";
		if (a.equals(b)) {
			System.out.println("\nNomes iguais");
		}else {
			System.out.println("\nNomes diferentes");
		} //Nomes diferentes, pois este método diferencia letras maiúsculas e minúsculas, logo, "Fiap" é diferente de "fiap".
		
		String c = new String("Fiap");
		String d = "fiap";
		if (!c.equals(d)) {
			System.out.println("\nNomes diferentes");
		}else {
			System.out.println("\nNomes iguais");
		} //Neste caso foi adcionado "!" antes da variável "c", fazendo com que o programa compare se os nomes são DIFERENTES, e não iguais.
		
		// Comparação com o Método "equalsIgnoreCase" (ignora onde estão armazenadas e compara somente os conteúdos das variáveis)
		String e = new String("Fiap");
		String f = "fiap";
		if (e.equalsIgnoreCase(f)) {
			System.out.println("\nNomes iguais");
		}else {
			System.out.println("\nNomes diferentes");
		} //Nomes iguais, pois este método compara somente o conteúdo escrito, ignorando letras maiúculas e minúsculas.
	}

}
