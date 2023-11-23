package ex20ModificacaoObjRef;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
 
        ContaBancaria conta = criarConta("Digite o saldo inicial da conta:");

        exibirMensagem("Saldo Inicial:\n" + conta.exibirSaldo());

        double valorDeposito = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor do depósito:"));
        realizarDeposito(conta, valorDeposito);

        exibirMensagem("Saldo Após Depósito:\n" + conta.exibirSaldo());
    }

    public static ContaBancaria criarConta(String mensagem) {
        double saldoInicial = Double.parseDouble(JOptionPane.showInputDialog(mensagem));
        return new ContaBancaria(saldoInicial);
    }

    public static void realizarDeposito(ContaBancaria conta, double valorDeposito) {
        conta.depositar(valorDeposito);
        exibirMensagem("Depósito de R$ " + valorDeposito + " realizado com sucesso!");
    }

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
