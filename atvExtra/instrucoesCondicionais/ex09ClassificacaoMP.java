package instrucoesCondicionais;

import javax.swing.JOptionPane;

public class ex09ClassificacaoMP {

	public static void main(String[] args) {
		
		String strNota1 = JOptionPane.showInputDialog("Digite a nota 1: ");
		float nota1 = Float.parseFloat(strNota1);
		String strPeso1 = JOptionPane.showInputDialog("Digite o peso da nota 1: ");
		float peso1 = Float.parseFloat(strPeso1);
		
		String strNota2 = JOptionPane.showInputDialog("Digite a nota 2: ");
		float nota2 = Float.parseFloat(strNota2);
		String strPeso2 = JOptionPane.showInputDialog("Digite o peso da nota 2: ");
		float peso2 = Float.parseFloat(strPeso2);
		
		String strNota3 = JOptionPane.showInputDialog("Digite a nota 3: ");
		float nota3 = Float.parseFloat(strNota3);
		String strPeso3 = JOptionPane.showInputDialog("Digite o peso da 3ª disciplina: ");
		float peso3 = Float.parseFloat(strPeso3);
		
		float mediaPonderada = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
		
		JOptionPane.showMessageDialog(null, "A média ponderada é " + mediaPonderada );
		
		if(mediaPonderada < 60){
			JOptionPane.showMessageDialog(null, ", que corresponde à classificação F.");
		}
		else if(mediaPonderada >= 60 && mediaPonderada <= 69){
			JOptionPane.showMessageDialog(null, ", que corresponde à classificação D.");
		}
		else if(mediaPonderada >= 70 && mediaPonderada <= 79){
			JOptionPane.showMessageDialog(null, ", que corresponde à classificação C.");
		}
		else if(mediaPonderada >= 80 && mediaPonderada <= 89){
			JOptionPane.showMessageDialog(null, ", que corresponde à classificação B.");
		}
		else if(mediaPonderada >= 90 && mediaPonderada <= 100){
			JOptionPane.showMessageDialog(null, ", que corresponde à classificação A.");
		}
	}

}
