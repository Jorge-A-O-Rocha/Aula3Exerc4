package view;

import javax.swing.JOptionPane;

import controller.modulos;

public class main {

	public static void main(String[] args) {
	modulos mod = new modulos();
		int x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número "));
		while(x < 10 || x > 999999 ) {
			x = Integer.parseInt(JOptionPane.showInputDialog("Insira um número  de 10 a 999.999 "));
		}
		
		int y = Integer.parseInt(JOptionPane.showInputDialog("Insira um 2º número "));
		while(y < 0 || y > 9) {
			y = Integer.parseInt(JOptionPane.showInputDialog("Insira um 2º número "));
		}
		
		int res = mod.quant(x,y);
		System.out.println("Em "+ x + " o " + y +" aparece " + res + " vezes.");
	}

}
