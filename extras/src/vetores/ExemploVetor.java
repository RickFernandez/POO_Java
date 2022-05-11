package vetores;

import javax.swing.JOptionPane;

public class ExemploVetor {

	public static void main(String[] args) {
		float contas[][] = new float [10][3];
		int indice = 0;
		String respostas = "";
		
		do {
			contas[indice][0] = Float.parseFloat(JOptionPane.showInputDialog("Digite o numero da mesa"));
			contas[indice][1] = Float.parseFloat(JOptionPane.showInputDialog("Digite o total"));
			contas[indice][2] = Float.parseFloat(JOptionPane.showInputDialog("Digite o codigo do garçom"));
			indice++;
			respostas = JOptionPane.showInputDialog("Digite <S> para continuar.").toUpperCase();
		} while (respostas.equals("S"));
		
		for (int contador = 0; contador < indice; contador++) {
			System.out.printf("Mesa: %.0f", contas[contador][0]);
			System.out.printf("\nTotal: %.2f", contas[contador][1]);
			System.out.printf("\nGarçom: %.0f\n", contas[contador][2]);
		}
		
		System.out.println("\n=====TOTAIS=====");
		int codigoGarcom = 0;
		float totalGarcom = 0;
		
		do {
			codigoGarcom = Integer.parseInt(JOptionPane.showInputDialog("Qual garçom que voce deseja?"));
			totalGarcom = 0;
			for (int contador = 0; contador < indice; contador++) {
				if (codigoGarcom == contas[contador][2]) {
					totalGarcom += contas[contador][1];
				}
			}
			System.out.printf("\nTotal: %.2f", totalGarcom);
			respostas = JOptionPane.showInputDialog("Digite <S> para continuar").toUpperCase();
		} while (respostas.equals("S"));

	}

}