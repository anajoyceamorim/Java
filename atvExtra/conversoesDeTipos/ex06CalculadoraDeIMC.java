package conversoesDeTipos;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class ex06CalculadoraDeIMC {

	public static void main(String[] args) {
		
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		
		String strPeso = JOptionPane.showInputDialog("Digite seu peso em kg: ");
		float peso = Float.parseFloat(strPeso);
		
		String straltura = JOptionPane.showInputDialog("Digite sua altura em metros: ");
		float altura = Float.parseFloat(straltura);
		
		float IMC = peso / (altura * altura);
		
		JOptionPane.showMessageDialog(null, "Seu IMC é: " + decimalFormat.format(IMC));
		
		if(IMC < 18.5){
			JOptionPane.showMessageDialog(null, "Classificação de IMC: baixo peso");
		}
		else if(IMC > 18.5 && IMC <= 24.9){
			JOptionPane.showMessageDialog(null, "Classificação de IMC: eutrofia(peso adequado)");
		}
		else if(IMC > 24.9 && IMC <= 29.9){
			JOptionPane.showMessageDialog(null, "Classifiicação de IMC: sobrepeso");
		}
		else if(IMC > 29.9 && IMC <= 34.9){
			JOptionPane.showMessageDialog(null, "Classificação de IMC: obesidade grau 1");
		}
		else if(IMC > 34.9 && IMC <= 39.9){
			JOptionPane.showMessageDialog(null, "Classificação de IMC: obesidae grau 2");
		}
		else if(IMC > 40) {
			JOptionPane.showMessageDialog(null, "Classificação de IMC: obesiade extrema");
		}
	}

}
