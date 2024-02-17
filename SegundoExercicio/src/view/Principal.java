package view;

import javax.swing.JOptionPane;

import controller.OpController;

public class Principal {

	public static void main(String[] args) {
		OpController op = new OpController();
		
		String frase = JOptionPane.showInputDialog("digite as palavras (sepadas por ';')");
		
		op.concatenaBuffer();
		op.concatenaString();
		System.out.println("======================================");
		op.divideFrase(frase);

	}

}
