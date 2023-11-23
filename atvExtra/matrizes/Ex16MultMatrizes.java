package matrizes;

import javax.swing.JOptionPane;

public class Ex16MultMatrizes {
	
public static void main(String[] args) {
		
        int linhasMatriz1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da primeira matriz:"));
        int colunasMatriz1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da primeira matriz:"));

        int[][] matriz1 = lerMatriz(linhasMatriz1, colunasMatriz1, "Digite os elementos da primeira matriz:");

        int linhasMatriz2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas da segunda matriz:"));
        int colunasMatriz2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas da segunda matriz:"));

        if (colunasMatriz1 != linhasMatriz2) {
            JOptionPane.showMessageDialog(null, "A multiplicação das matrizes não é possível. O número de colunas da primeira matriz deve ser igual ao número de linhas da segunda matriz.");
            return;
        }

        int[][] matriz2 = lerMatriz(linhasMatriz2, colunasMatriz2, "Digite os elementos da segunda matriz:");

        int[][] resultado = multiplicarMatrizes(matriz1, matriz2);

        mostrarMatriz("A multiplicação das matrizes é:", resultado);
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

    private static int[][] multiplicarMatrizes(int[][] matriz1, int[][] matriz2) {
        int linhasMatriz1 = matriz1.length;
        int colunasMatriz1 = matriz1[0].length;
        int colunasMatriz2 = matriz2[0].length;

        int[][] resultado = new int[linhasMatriz1][colunasMatriz2];

        for (int i = 0; i < linhasMatriz1; i++) {
            for (int j = 0; j < colunasMatriz2; j++) {
                for (int k = 0; k < colunasMatriz1; k++) {
                    resultado[i][j] += matriz1[i][k] * matriz2[k][j];
                }
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
