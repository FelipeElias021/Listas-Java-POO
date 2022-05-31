package ListaPOO02.Ex02.Controle;

import ListaPOO02.Ex02.Entidade.*;
import java.util.ArrayList;

/*Ator: nome (String), idade (int), n_oscars (int) (número deOscars conquistados). 
Diretor: nome (String), ganhador_oscar (boolean), principal_filme (Filme). 
Filme: titulo (String), diretor (Diretor), ator_principal (Ator),atriz_principal (Ator). */

public class CadastroFilme {
    static ArrayList<Diretor> diretores = new ArrayList<>();
    static ArrayList<Ator> atores = new ArrayList<>();
    static ArrayList<Ator> atrizes = new ArrayList<>();
    static ArrayList<Filme> filmes = new ArrayList<>();
    public static void main(String[] args) {
        Populate();

        insereFilme(new Filme("A Million Ways to Die in the West", diretores.get(0), atores.get(0), atrizes.get(0)));
        insereFilme(new Filme("Ready Player One", diretores.get(1), atores.get(1), atrizes.get(1)));
        insereFilme(new Filme("Arrival", diretores.get(2), atores.get(2), atrizes.get(2)));
        insereFilme(new Filme("Blade Runner 2049", diretores.get(2), atores.get(3), atrizes.get(3)));
        insereFilme(new Filme("Mad Max: Fury Road", diretores.get(3), atores.get(4), atrizes.get(0)));
        insereFilme(new Filme("Crazy, Stupid, Love", diretores.get(4), atores.get(3), atrizes.get(4)));
        diretores.get(3).setPrincipalFilme(filmes.get(4));
        diretores.get(2).setPrincipalFilme(filmes.get(2));

        System.out.println("\nFilmes:");
        System.out.println(filmes);

        System.out.println("\nDiretores:");
        System.out.println(diretores);

        System.out.println("\nDiretores que ganharam o oscar:");
        ArrayList<Diretor> diretoresOscar = diretoresGanhadoresOscar();
        System.out.println(diretoresOscar);
    }

    static public Filme buscaFilme (String titulo) {
        for (Filme filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                return filme;
            }
        }
        return new Filme();
    }

    static public boolean insereFilme (Filme filme) {
        String titulo = filme.getTitulo();
        if ((buscaFilme(titulo).getTitulo() == null)) {
            filmes.add(filme);
            System.out.println("Sucesso ao inserir o filme " + titulo);
            return true;
        }
        System.out.println("O Filme " + titulo + " já foi inserido");
        return false;
    }

    static public ArrayList<Diretor> diretoresGanhadoresOscar() {
        ArrayList<Diretor> obj = new ArrayList<>();
        
        for (Diretor diretor : diretores) {
            if (diretor.getGanhadorOscar()) {
                obj.add(diretor);
            }
        }

        return obj;
    } 

    static public void Populate() {
        diretores.add(new Diretor("Seth MacFarlane", false));
        diretores.add(new Diretor("Steven Spielberg", true));
        diretores.add(new Diretor("Denis Villeneuve", false));
        diretores.add(new Diretor("George Miller", true));
        diretores.add(new Diretor("Glenn Ficarra", false));

        atores.add(new Ator("Seth MacFarlane", 48, 0));
        atores.add(new Ator("Tye Sheridan", 25, 0));
        atores.add(new Ator("Jeremy Renner", 51, 0));
        atores.add(new Ator("Ryan Gosling", 41, 0));
        atores.add(new Ator("Tom Hardy", 44, 0));

        atrizes.add(new Ator("Charlize Theron", 46, 1));
        atrizes.add(new Ator("Olivia Cooke", 28, 0));
        atrizes.add(new Ator("Amy Adams", 47, 0));
        atrizes.add(new Ator("Ana de Armas", 34, 0));
        atrizes.add(new Ator("Emma Stone", 33, 1));
    }

}
