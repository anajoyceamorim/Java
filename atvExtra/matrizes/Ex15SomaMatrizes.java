package matrizes;

import javax.swing.JOptionPane;

public class Ex15SomaMatrizes {
	
	 public static void main(String[] args) {
		 
	        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
	        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));

	        int[][] matriz1 = lerMatriz(linhas, colunas, "Digite os elementos da primeira matriz:");
	        int[][] matriz2 = lerMatriz(linhas, colunas, "Digite os elementos da segunda matriz:");

	        int[][] resultado = somarMatrizes(matriz1, matriz2);

	        mostrarMatriz("A soma das matrizes é:", resultado);
	    }

	    private static int[][] lerMatriz(int linhas, int colunas, String mensagem) {
	        int[][] matriz = new int[linhas][colunas];
	        JOptionPane.showMessageDialog(null, mensagem);

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                matriz[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o elemento da posição [" + i + "][" + j + "]:"));
	            }
	        }

	        return matriz;
	    }

	    private static int[][] somarMatrizes(int[][] matriz1, int[][] matriz2) {
	        int linhas = matriz1.length;
	        int colunas = matriz1[0].length;

	        int[][] resultado = new int[linhas][colunas];

	        for (int i = 0; i < linhas; i++) {
	            for (int j = 0; j < colunas; j++) {
	                resultado[i][j] = matriz1[i][j] + matriz2[i][j];
	            }
	        }

	        return resultado;
	    }

	    private static void mostrarMatriz(String titulo, int[][] matriz) {
	        StringBuilder mensagem = new StringBuilder(titulo + "\n");

	        for (int i = 0; i < matriz.length; i++) {
	            for (int j = 0; j < matriz[0].length; j++) {
	                mensagem.append(matriz[i][j]).append(" ");
	            }
	            mensagem.append("\n");
	        }

	        JOptionPane.showMessageDialog(null, mensagem.toString());
	    }
}
