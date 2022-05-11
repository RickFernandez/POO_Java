package modificadorFinal;

public final class Circulo {
	private final double NUMERO_PI = 3.14;
	private double raio;
	
	public final double calcularArea() {
		return NUMERO_PI * raio * raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}
}
