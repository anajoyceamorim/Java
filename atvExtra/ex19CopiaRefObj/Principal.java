package ex19CopiaRefObj;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
  
        Aluno alunoOriginal = criarAluno("Digite o nome do aluno:", "Digite a nota do aluno:");

        exibirMensagem("Dados do Aluno Original:\n" + alunoOriginal.exibirDados());

        Aluno alunoCopia = copiarAluno(alunoOriginal);
        
        alunoCopia.nome = "Cópia do " + alunoCopia.nome;
        alunoCopia.nota = 9.0;

        exibirMensagem("Dados do Aluno Original após Modificação da Cópia:\n" + alunoOriginal.exibirDados());
    }
	
    public static Aluno criarAluno(String mensagemNome, String mensagemNota) {
        String nome = JOptionPane.showInputDialog(mensagemNome);
        double nota = Double.parseDouble(JOptionPane.showInputDialog(mensagemNota));
        return new Aluno(nome, nota);
    }

    public static Aluno copiarAluno(Aluno aluno) {
        return new Aluno(aluno.nome, aluno.nota);
    }

    public static void exibirMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem);
    }

}
