package matrizes;

import javax.swing.JOptionPane;

public class Ex17TransposicaoMatrizes {

	public static void main(String[] args) {
        
        int linhas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de linhas:"));
        int colunas = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de colunas:"));

        int[][] matriz = lerMatriz(linhas, colunas, "Digite os elementos da matriz:");

        int[][] transposta = transporMatriz(matriz);

        mostrarMatriz("A matriz transposta é:", transposta);
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

    private static int[][] transporMatriz(int[][] matriz) {
        int linhas = matriz.length;
        int colunas = matriz[0].length;

        int[][] transposta = new int[colunas][linhas];

        for (int i = 0; i < linhas; i++) {
            for (int j = 0; j < colunas; j++) {
                transposta[j][i] = matriz[i][j];
            }
        }

        return transposta;
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
