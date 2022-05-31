package ListaPOO02.Ex02.Entidade;

public class Filme {
    private String titulo;
    private Diretor diretor;
    private Ator ator_principal;
    private Ator atriz_principal;

    public Filme () {}

    public Filme (String titulo, Diretor diretor, Ator ator_principal,  Ator atriz_principal) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.ator_principal = ator_principal;
        this.atriz_principal = atriz_principal;
    }

    public String getTitulo () {
        return titulo;
    }

    public void setTitulo (String titulo) {
        this.titulo = titulo;
    }

    public Diretor getDiretor () {
        return diretor;
    }

    public void setDiretor (Diretor diretor) {
        this.diretor = diretor;
    }

    public Ator getAtorPrincipal () {
        return ator_principal;
    }

    public void setAtorPrincipal (Ator ator_principal) {
        this.ator_principal = ator_principal;
    }

    public Ator getAtrizPrincipal () {
        return atriz_principal;
    }

    public void setAtrizPrincipal (Ator atriz_principal) {
        this.atriz_principal = atriz_principal;
    }

    public String toString() {
        return "\nTítulo: "+this.titulo
                + "\nDiretor: " + this.diretor.getNome()
                + "\nAtor principal: " + this.ator_principal.getNome()
                + "\nAtriz principal: " + this.atriz_principal.getNome()
                + "\n----------------------------\n";
    }
}
