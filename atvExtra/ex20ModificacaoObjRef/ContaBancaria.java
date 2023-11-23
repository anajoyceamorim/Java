package ex20ModificacaoObjRef;

public class ContaBancaria {
	
	double saldo;
	
    public ContaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valorDeposito) {
        saldo += valorDeposito;
    }

    public String exibirSaldo() {
        return "Saldo Atual: R$ " + saldo;
    }
	
}
