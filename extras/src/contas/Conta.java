package contas;

public class Conta {
	private int mesa;
	private int total;
	private String garcom;
	
	
	public Conta() {
		super();
	}
	public Conta(int mesa, int total, String garcom) {
		super();
		this.mesa = mesa;
		this.total = total;
		this.garcom = garcom;
	}
	public int getMesa() {
		return mesa;
	}
	public void setMesa(int mesa) {
		this.mesa = mesa;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public String getGarcom() {
		return garcom;
	}
	public void setGarcom(String garcom) {
		this.garcom = garcom;
	}
	@Override
	public String toString() {
		return "Conta [mesa=" + mesa + ", total=" + total + ", garcom=" + garcom + "]";
	}
}
