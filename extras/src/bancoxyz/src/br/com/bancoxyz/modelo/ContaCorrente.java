package br.com.bancoxyz.modelo;

public class ContaCorrente extends Conta {
	private String tipo;
	private double chequeEspecial;
	
	@Override
	public void sacar(double valor) {
		if (valor <= saldo + limite) {
			saldo = saldo - valor;
		}
	}
	
	@Override
	public double verificarSaldo() {
		return saldo + limite;
	}
	
	public ContaCorrente(String tipo) {
		super();
		this.tipo = tipo;
	}
	
	@Override
	public void retirar(double valor) {
		valor = valor + 10;
		super.retirar(valor);
	}
	
	public double getSaldoDisponivel() {
		return getSaldo() + chequeEspecial;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	public double getChequeEspecial() {
		return chequeEspecial;
	}
	
	public void setChequeEspecial(double chequeEspecial) {
		this.chequeEspecial = chequeEspecial;
	}
	
	
}
