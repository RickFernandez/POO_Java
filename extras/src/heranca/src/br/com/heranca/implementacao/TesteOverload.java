package br.com.heranca.implementacao;

import br.com.heranca.beans.Livro;

public class TesteOverload {

	public static void main(String[] args) {
		Livro livro = new Livro();
		
		livro.setValorCompra(50.00);
		livro.setValorVenda(100.00);
		livro.setValorPromocional(75.00);
		livro.reajustarValores();
		
		System.out.println("Valores ajustados em 10%");
		
		System.out.printf("Venda: R$ %.2f", livro.getValorVenda());
		System.out.printf("Compra: R$ %.2f", livro.getValorCompra());
		System.out.printf("Promocional: R$ %.2f \n", livro.getValorPromocional());
		
		livro.reajustarValores(50);
		
		System.out.println("Valores ajustados em mais 50%");
		System.out.printf("Venda: R$ %.2f", livro.getValorVenda());
		System.out.printf("Compra: R$ %.2f", livro.getValorCompra());
		System.out.printf("Promocional: R$ %.2f", livro.getValorPromocional());
	}

}
