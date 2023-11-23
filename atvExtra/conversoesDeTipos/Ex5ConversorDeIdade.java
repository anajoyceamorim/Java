package conversoesDeTipos;

import javax.swing.JOptionPane;

public class Ex5ConversorDeIdade {

	public static void main(String[] args) {
  
        String strIdade = JOptionPane.showInputDialog("Digite sua idade em anos: ");
        int idade = Integer.parseInt(strIdade);

        int idadeMeses = idade * 12;
        int idadeDias = idade * 365;
        int idadeHoras = idade * 24;
        int idadeMinutos = idade * 60;

        String mensagem = "Idade em anos: " + idade + "\n"
                + "Idade em meses: " + idadeMeses + "\n"
                + "Idade em dias: " + idadeDias + "\n"
                + "Idade em horas: " + idadeHoras + "\n"
                + "Idade em minutos: " + idadeMinutos;

        JOptionPane.showMessageDialog(null, mensagem);
    }

}
