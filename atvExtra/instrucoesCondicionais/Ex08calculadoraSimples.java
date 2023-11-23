package instrucoesCondicionais;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Ex08calculadoraSimples {

	public static void main(String[] args) {
		
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		String strNum1 = JOptionPane.showInputDialog("Digite o primeiro número: ");
		int num1 = Integer.parseInt(strNum1);
		
		String strNum2 = JOptionPane.showInputDialog("Digite o segundo número: ");
		int num2 = Integer.parseInt(strNum2);
		
		String strOpcao = JOptionPane.showInputDialog("EScolha a operação:\n"
				+ "1. Adição\n"
				+ "2. Subtração\n"
				+ "3. Multiplicação\n"
				+ "4. Divisão");
		
		float resultado;
		
		switch(strOpcao) {
		case "1":
			resultado = num1 + num2;
			JOptionPane.showMessageDialog(null, "Resultado: " + decimalFormat.format(resultado));
			break;
		case "2":
			resultado = num1 - num2;
			JOptionPane.showMessageDialog(null, "Resultado: " + decimalFormat.format(resultado));
			break;
		case "3":
			resultado = num1 * num2;
			JOptionPane.showMessageDialog(null, "Resultado: " + decimalFormat.format(resultado));
		case "4":
			resultado = num1 / num2;
			JOptionPane.showMessageDialog(null, "Resultado: " + decimalFormat.format(resultado));
		default:
			break;
		}
		}

}
