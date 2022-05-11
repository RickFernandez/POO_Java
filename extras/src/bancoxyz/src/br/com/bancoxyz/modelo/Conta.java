package br.com.bancoxyz.modelo;

public abstract class Conta {
	private String saldo;
	private int numero;
	private int digito;
	private String titular;
	
	public void sacar (double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
		}
	}
	
	public abstract double verificarSaldo();
	
	public void retirar(double valor) {
		saldo = saldo - valor;
	}
	
	@Override
	public String toString() {
		return "Conta [saldo=" + saldo + ", numero=" + numero + ", digito=" + digito + ", titular=" + titular + "]";
	}

	public Conta() {
		super();
	}
	
	public Conta(String saldo, int numero, int digito, String titular) {
		super();
		this.saldo = saldo;
		this.numero = numero;
		this.digito = digito;
		this.titular = titular;
	}
	
	public String getSaldo() {
		return saldo;
	}
	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getDigito() {
		return digito;
	}
	public void setDigito(int digito) {
		this.digito = digito;
	}
	
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	
	
}
