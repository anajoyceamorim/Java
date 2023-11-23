package vetores;

import javax.swing.JOptionPane;

public class Ex12SomaVet {

	public static void main(String[] args) {
			
			String strTam = JOptionPane.showInputDialog("Digite o tamanho dos vetores: ");
			int tam = Integer.parseInt(strTam);
			
			int[] vetSoma = new int[tam];
			
			for(int i = 0; i < 4; i++)  {
				for(int j = 0; j < vetSoma.length; j++) {
					String strAux = JOptionPane.showInputDialog("Digite o " + (j+1) + "º" + " elemento: ");
					int aux = Integer.parseInt(strAux);
					vetSoma[j] += aux;
				}
			}
			for(int i = 0; i < vetSoma.length; i++) {
				JOptionPane.showMessageDialog(null, "A soma dos " + (i+1) + "º elementos foi: " + vetSoma[i]);
			}
		}
}
