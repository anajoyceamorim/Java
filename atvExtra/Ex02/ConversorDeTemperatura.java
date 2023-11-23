//consertar a fórmula do 2º caso

package Ex02;

import javax.swing.JOptionPane;

public class ConversorDeTemperatura {
	
	public static void main(String[] args) {
		
		String strOpcao = JOptionPane.showInputDialog("Escolha o tipo de conversão: \n"
				+ "1. Celsius para Fahrenheit \n"
				+ "2. Fahrenheit para Celsius \n"
				+ "Opção: " );
		int opcao = Integer.parseInt(strOpcao);
		
		switch (opcao) {
		case 1:
			String strCelsius = JOptionPane.showInputDialog("Digite a temperatura em graus Celsius: ");
			float celsius1 = Float.parseFloat(strCelsius);
			float fahrenheit1 = ((celsius1 * 9) / 5) + 32;
			JOptionPane.showMessageDialog(null, "Resultado em graus Fahrenheit: " + fahrenheit1);
			break;
		
		case 2:
			String strFahrenheit = JOptionPane.showInputDialog("Digite a temperatura em graus Fahrenheit: ");
			float fahrenheit2 = Float.parseFloat(strFahrenheit);
			float celsius2 = (fahrenheit2 - 32) / (float) 1.8;
			JOptionPane.showMessageDialog(null, "Resultado em graus Celsius: " + celsius2);
		
		default:
			break;
		}
	}
}
