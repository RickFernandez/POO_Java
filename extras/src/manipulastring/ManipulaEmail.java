package manipulastring;

public class ManipulaEmail {

	public static void main(String[] args) {
		String emails = "pablo@master3.com.br;rita@master3.com.br;codeberto@master3.com.br;albert@master3.com.br;x@master3.com.br;master3@master3.com.br";
		
		emails = emails.toLowerCase();
		emails = emails.replace("master3.com.br", "masters3.com.br");
		System.out.println("Missão 1: " + emails);
		
		System.out.println("================================");
		
		System.out.println("Missão 2 e 4:");
		String resto = emails;
		String usuarios = "Usuários: ";
		
		while (resto.indexOf(";") > -1) {
			System.out.println("Email: " + resto.substring(0,resto.indexOf(";")));
			
			if (resto.substring(0,resto.indexOf(";")).indexOf("@") > 3 ) {
				System.out.println("E-mail Valido");
			}else {
				System.out.println("E-mail Invalido");
			}
			usuarios += resto.substring(0,resto.indexOf(";")).substring(0, resto.indexOf("@")) + ";";
			resto = resto.substring(resto.indexOf(";")+1);
		}
		System.out.println("Email: " + resto);
		if (resto.indexOf("@") > 3) {
			System.out.println("E-mail Valido");
		}else {
			System.out.println("E-mail Invalido");
		}
		
		System.out.println("================================");
		
		System.out.println("Missão 3:");
		usuarios+=resto.substring(0, resto.indexOf("@"));
		System.out.println(usuarios);
	}
}