package estruturasRepeticao;

import javax.swing.JOptionPane;

public class Ex10ContagemRegressiva {
	
	public static void main(String[] args) {
			String strNum = JOptionPane.showInputDialog("Forneça um número para contagem regressiva: ");
			int num = Integer.parseInt(strNum);
			
			while(num != 0) {
				 JOptionPane.showMessageDialog(null, num);
				 num--;
			}
		}
}
