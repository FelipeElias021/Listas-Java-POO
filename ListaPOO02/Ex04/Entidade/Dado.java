package ListaPOO02.Ex04.Entidade;

public class Dado {
    private int nLados;
	
	public Dado(int lados){
		this.nLados = lados;
	}
	public Dado() {
		this.nLados = 6;
	}
	
	public int getNLados(){
		return nLados;
	}
	
	public void setNLados(int lados){
		this.nLados = lados;
	}

    public String toString() {
        return ""+nLados;
    }
}
