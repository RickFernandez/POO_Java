package br.com.heranca.implementacao;

import javax.swing.JOptionPane;

import br.com.heranca.beans.Livro;

public class TesteProduto {

	public static void main(String[] args) {
		Livro livro = new Livro ();

		livro.setId(Integer.parseInt((JOptionPane.showInputDialog("Digite o ID"))));
		livro.setEstilo(JOptionPane.showInputDialog("Digite o estilo"));
		livro.setAutor(JOptionPane.showInputDialog("Digite o autor"));
		livro.setLancamento(Boolean.parseBoolean((JOptionPane.showInputDialog("Lançamento?"))));
		livro.setTitulo(JOptionPane.showInputDialog("Digite o título"));
		livro.setCapaDura(Boolean.parseBoolean(JOptionPane.showInputDialog("Capa Dura?")));
		
		System.out.println("ID:" + livro.getId());
		System.out.println("Estilo:" + livro.getEstilo());
		System.out.println("Título:" + livro.getTitulo());
		System.out.println("Lançamento:" + livro.isLancamento());
		System.out.println("Capa dura:" + livro.isCapaDura());
	}

}
