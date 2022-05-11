package collections;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class ExemploArrayList {

	public static void main(String[] args) {
		ArrayList<Float> contas = new ArrayList<>();
		String resposta="";
		do{
			contas.add(Float.parseFloat(JOptionPane.showInputDialog("Digite a mesa")));
			contas.add(Float.parseFloat(JOptionPane.showInputDialog("Digite o total")));
			contas.add(Float.parseFloat(JOptionPane.showInputDialog("Digite o código do garçom")));
			resposta = JOptionPane.showInputDialog("Digite <S> para continuar.").toUpperCase();
		}while (resposta.equals("S"));
		for (int contador=0;contador<contas.size();contador+=3) {
			System.out.printf("\nMesa: %.0f", contas.get(contador));
			System.out.printf("\nTotal: %.2f", contas.get(contador+1));
			System.out.printf("\nGarcom: %.0f", contas.get(contador+2));
		}
		System.out.println("\n======TOTAIS========");
		int codigoGarcom=0;
		float totalGarcom=0;
		do{
			codigoGarcom=Integer.parseInt(JOptionPane.showInputDialog("Qual garçom que você deseja?"));
			totalGarcom=0;
			for (int contador = 2; contador < contas.size(); contador += 3) {
				if (codigoGarcom == contas.get(contador)) {
					totalGarcom += contas.get(contador-1);
				}
			}
			System.out.printf("\nTotal: %.2f", totalGarcom);
			resposta = JOptionPane.showInputDialog("Digite <S> para continuar.").toUpperCase();
		}while (resposta.equals("S"));

	}

}
