package vetores;

import javax.swing.JOptionPane;

public class eX13ProdEscalar {

	public static void main(String[] args) {
		String strTam = JOptionPane.showInputDialog("Digite o tamanho dos vetores: ");
		int tam = Integer.parseInt(strTam);
		
		float[] vetProdEscalar = new float[tam];
		
		for(int i = 0; i < vetProdEscalar.length; i++) {
			vetProdEscalar[i] = 1;
		}
		
		for(int i = 0; i < 2; i++)  {
			for(int j = 0; j < vetProdEscalar.length; j++) {
				String strAux = JOptionPane.showInputDialog("Digite o " + (j+1) + "º" + " elemento: ");
				float aux = Float.parseFloat(strAux);
				vetProdEscalar[j] *= aux;
			}
		}
		float prodEscalar = 0;
		for(int i = 0; i < vetProdEscalar.length; i++) {
			prodEscalar += vetProdEscalar[i];
		}
		JOptionPane.showMessageDialog(null, "O produto escalar dos vetores é: " + prodEscalar);
	}

}
