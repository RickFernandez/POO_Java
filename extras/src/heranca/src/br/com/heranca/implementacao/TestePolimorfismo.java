package br.com.heranca.implementacao;

import javax.swing.JOptionPane;

import br.com.heranca.beans.CD;
import br.com.heranca.beans.Livro;

public class TestePolimorfismo {

	public static void main(String[] args) {
		Livro produto1 = new Livro();
		
		produto1.setTitulo(JOptionPane.showInputDialog("Digite o Título"));
		produto1.setAutor(JOptionPane.showInputDialog("Digite o Autor"));
		produto1.setEditora(JOptionPane.showInputDialog("Digite a editora"));
		produto1.setValorCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor")));
		
		CD produto2 = new CD();
		produto2.setTitulo(JOptionPane.showInputDialog("Digite o Título"));
		produto2.setArtista(JOptionPane.showInputDialog("Digite o Artista"));
		produto2.setGravadora(JOptionPane.showInputDialog("Digite a gravadora"));
		produto2.setValorCompra(Double.parseDouble(JOptionPane.showInputDialog("Digite o Valor")));
		
		System.out.println("Imposto do Livro (5%): RS:" + produto1.calcularImposto());
		System.out.println("Imposto do CD (7%) R$:" + produto2.calcularImposto());
	}

}
