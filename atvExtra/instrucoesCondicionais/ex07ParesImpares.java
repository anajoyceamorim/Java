package instrucoesCondicionais;

import javax.swing.JOptionPane;

public class ex07ParesImpares {

	public static void main(String[] args) {
		String strNum = JOptionPane.showInputDialog("Digite um número: ");
		int num = Integer.parseInt(strNum);
		
		if(num % 2 == 0) {
			JOptionPane.showMessageDialog(null, "O número " + num + " é par");
		}
		else {
			JOptionPane.showMessageDialog(null, "O número " + num + " é ímpar");
		}
	}
}
