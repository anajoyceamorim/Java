package ex18TrocaDeValoresObj;

public class Ponto {

	int x;
    int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String exibirPonto() {
        return "(" + x + ", " + y + ")";
    }
	
}
