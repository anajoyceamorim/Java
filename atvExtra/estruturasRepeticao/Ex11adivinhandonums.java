package estruturasRepeticao;

import javax.swing.JOptionPane;
import java.util.Random;

public class Ex11adivinhandonums {
	
	static int numInput;

	public static void main(String[] args) {
		
		Random random = new Random();
		
		int numComp = random.nextInt(10) + 1;
		
		int i = 1;
		
		JOptionPane.showMessageDialog(null, "Adivinhe o número entre 1 e 10.");
		
		do {
			String strNumInput = JOptionPane.showInputDialog("Tentativa " + i + ":");
			numInput = Integer.parseInt(strNumInput);
			
			if(numInput == numComp) {
				JOptionPane.showMessageDialog(null, "Parabéns! Você acertou o número " + numComp + " em " + i + " tentativas.");
			}
			else if (numInput < numComp) {
				JOptionPane.showMessageDialog(null, "Tente novamente. o número é maior");
			}
			else if (numInput > numComp) {
				JOptionPane.showMessageDialog(null, "Tente novamente. o número é menor");
			}
			i++;
			
		}while(numComp != numInput);
	}

}
