package ex19CopiaRefObj;

public class Aluno {

	String nome;
    double nota;
    
    public Aluno(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
    
    public String exibirDados() {
        return "Aluno: " + nome + "\nNota: " + nota;
    }
	
}
