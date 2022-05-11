package br.com.bancoxyz.implementacao;

import br.com.bancoxyz.modelo.Conta;
import br.com.bancoxyz.modelo.ContaCorrente;

public class TesteConta {

	public static void main(String[] args) {
		Conta cc = new Conta();
		
		if (cc instanceof Conta) {
			System.out.println("cc e do tipo Conta");
		} else {
			System.out.println("cc não e do tipo Conta");
		}
		
		
		Conta dd = new ContaCorrente();
		if (cc instanceof Conta) {
			System.out.println("dd e do tipo Conta");
		} else {
			System.out.println("dd não e do tipo Conta");
		}
		
		
		Conta ee = new Conta();
		if (ee instanceof ContaCorrente) {
			System.out.println("ee e do tipo Conta Corrente");
		} else {
			System.out.println("ee nao e do tipo Conta Corrente");
		}

	}

}
