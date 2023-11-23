package ex01;

import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class calculadoraDeGorjeta {

	public static void main(String[] args) {
		
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		String strConta = JOptionPane.showInputDialog("Digite o valor total da conta: ");
		float conta = Float.parseFloat(strConta);
		
		String strGorjeta = JOptionPane.showInputDialog("Digite a porcentagem de gorjeta que deseja deixar (por exemplo, 15 para 15%): ");
		float gorjeta = Float.parseFloat(strGorjeta);
		
		JOptionPane.showMessageDialog(null, "Valor da gorjeta: $" + decimalFormat.format(conta*(gorjeta/100)));
		
		conta += conta * (gorjeta/100);
		
		JOptionPane.showMessageDialog(null, "Total a ser pago: $" + decimalFormat.format(conta));
	}

}
