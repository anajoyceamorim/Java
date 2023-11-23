package estruturasRepeticao;

import javax.swing.JOptionPane;

public class Ex12TabelaMult {

	public static void main(String[] args) {
		
		String strNum = JOptionPane.showInputDialog("Digite um número para a tabela de multiplicação: ");
		int num = Integer.parseInt(strNum);
		
		JOptionPane.showMessageDialog(null, "Tabela de multiplicação para " +  num + " :");
		
		for(int i = 0; i<=10 ; i++) {
			JOptionPane.showMessageDialog(null,i + " x " + num + " = "+ i * num);
		}
		
	}

}
