package strings;

public class CriandoStrings {

	public static void main(String[] args) {
		//Criando uma variável String
		String nome;
		
		//Criandouma variável String e instanciando
		String variavel = new String();
		
		//Formas de dar valor à Striong
		nome = "Darth Vader";
		System.out.println(nome);
		String nave = new String("Estrela da Morte");
		System.out.println(nave);
		
		//Tentando utilizar o método length() em uma variável com conteúdo null
		String nome2;
		nome2 = "Henrique";
		System.out.println("Nome:" + nome2);
		System.out.println("Quantidade de caracteres:" + nome2.length());
		System.out.println(variavel.length());
		
		//Nova linha
		nome2 = "\nLuke Skywalker";
		System.out.println(nome2);
		
		//Tabulação
		System.out.println("\tTeste");
		
		//Barra invertida
		System.out.println("\\");
		
		//Aspas duplas e aspas simples
		System.out.println("\"");
		System.out.println("\'");
		
		//Concatenando String
		System.out.println(nome + " mora em uma " + nave);
		
		String endereco = "Avenida ";
		endereco+="do Estado\n";
		endereco += "nº 1234\n";
		endereco += "Bairro: Centro\n";
		System.out.println("Endereço:" + endereco);

		String tipo = "Avenida";
		String logradouro ="do Estado";
		String numero ="nº 1234";
		String endereco1 = tipo.concat(": ").concat(logradouro).concat(numero);
		System.out.println("Endereço: " + endereco1);
		
	}

}