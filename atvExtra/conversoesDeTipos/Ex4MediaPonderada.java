package conversoesDeTipos;

import javax.swing.JOptionPane; 

public class Ex4MediaPonderada {

	public static void main(String[] args) {
		
		String strDisciplina1 = JOptionPane.showInputDialog("Digite a nota da 1ª disciplina: ");
		float disciplina1 = Float.parseFloat(strDisciplina1);
		
		String strDisciplina2 = JOptionPane.showInputDialog("Digite a nota da 2ª disciplina: ");
		float disciplina2 = Float.parseFloat(strDisciplina2);
		
		String strDisciplina3 = JOptionPane.showInputDialog("Digite a nota da 3ª disciplina: ");
		float disciplina3 = Float.parseFloat(strDisciplina3);
		
		String strPeso1 = JOptionPane.showInputDialog("Digite o peso da 1ª disciplina: ");
		float peso1 = Float.parseFloat(strPeso1);
		
		String strPeso2 = JOptionPane.showInputDialog("Digite o peso da 2º disciplina: ");
		float peso2 = Float.parseFloat(strPeso2);
		
		String strPeso3 = JOptionPane.showInputDialog("Digite o peso da 3ª disciplina: ");
		float peso3 = Float.parseFloat(strPeso3);
		
		float media = ((peso1 * disciplina1) + (peso2 * disciplina2) + (peso3 * disciplina3)) / (peso1 + peso2 + peso3);

		
		JOptionPane.showMessageDialog(null, "A média ponderada é: " + media);
	}

}
