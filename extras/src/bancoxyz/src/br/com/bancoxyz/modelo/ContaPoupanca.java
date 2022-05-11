package br.com.bancoxyz.modelo;

public final class ContaPoupanca extends Conta {
	
	@Override
	public double verificarSaldo() {
		return saldo;
	}
}
