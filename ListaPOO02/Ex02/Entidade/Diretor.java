package ListaPOO02.Ex02.Entidade;

public class Diretor {
    private String nome;
    private boolean ganhador_oscar;
    private Filme principal_filme;

    public Diretor(String nome, boolean ganhador_oscar) {
        this.nome = nome;
        this.ganhador_oscar = ganhador_oscar;
        this.principal_filme = new Filme();
    }

    public String getNome () {
        return nome;
    }

    public void setNome (String nome) {
        this.nome = nome;
    }

    public boolean getGanhadorOscar () {
        return ganhador_oscar;
    }

    public void setGanhadorOscar (boolean ganhador_oscar) {
        this.ganhador_oscar = ganhador_oscar;
    }

    public Filme getPrincipalFilme () {
        return principal_filme;
    }

    public void setPrincipalFilme (Filme principal_filme) {
        this.principal_filme = principal_filme;
    }

    public String toString() {
        return "\nTítulo: "+this.nome
                + (this.principal_filme.getTitulo() != null? "\nPrincipal filme: " + this.principal_filme.getTitulo() : "\nNão possui um filme principal cadastrado.")
                + "\n----------------------------\n";
    }
}
