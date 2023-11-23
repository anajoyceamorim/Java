package vetores;

import javax.swing.JOptionPane;

public class Ex14Palindromo {

	public static void main(String[] args) {
		
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
        String palavraNova = retirar(palavra);

        boolean palindromo = verificarPalindromo(palavraNova);

        if (palindromo) {
            JOptionPane.showMessageDialog(null, "A palavra " + palavra + " é um palíndromo.");
        } else {
            JOptionPane.showMessageDialog(null, "A palvra " + palavra + " não é um palíndromo.");
        }
    }

    private static String retirar(String palavra) {
        return palavra.replaceAll("[^a-zA-Z]", "").toLowerCase();
    }

    private static boolean verificarPalindromo(String palavra) {
        int comprimento = palavra.length();
        for (int i = 0; i < comprimento / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(comprimento - i - 1)) {
                return false;
            }
        }
        return true;
    }

}
