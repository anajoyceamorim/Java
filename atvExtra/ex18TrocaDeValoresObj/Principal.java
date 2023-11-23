package ex18TrocaDeValoresObj;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {

        Ponto ponto1 = criarPonto("Digite o valor de x para o Ponto 1:");
        Ponto ponto2 = criarPonto("Digite o valor de x para o Ponto 2:");

        exibirMensagem("Valores iniciais dos pontos:\nPonto 1: " + ponto1.exibirPonto() + "\nPonto 2: " + ponto2.exibirPonto());

        trocarPontos(ponto1, ponto2);

        exibirMensagem("Valores após a troca dos pontos:\nPonto 1: " + ponto1.exibirPonto() + "\nPonto 2: " + ponto2.exibirPonto());
    }

    public static Ponto criarPonto(String mensagem) {
        int x = Integer.parseInt(JOptionPane.showInputDialog(mensagem));
        int y = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de y para o ponto:"));
        return new Ponto(x, y);
    }

    public static void trocarPontos(Ponto pontoA, Ponto pontoB) {
        int tempX = pontoA.x;
        int tempY = pontoA.y;

        pontoA.x = pontoB.x;
        pontoA.y = pontoB.y;

        pontoB.x = tempX;
        pontoB.y = tempY;
    }

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
