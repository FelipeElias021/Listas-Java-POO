package N2.Ex01.Entidades;

import java.util.ArrayList;

public class Teste {

    public static void main(String[] args) {
        ArrayList<Aluno> a1 = new ArrayList<>();

        a1.add(new Aluno(1, 18, "Felipe", "111", "Rua", true, new Notas()));

        CursoEspecializacao ce1 = new CursoEspecializacao(1, 1, 1, "Curso Teste", "Aquele", 40, a1, true);

        ArrayList<Curso> cursos = new ArrayList<>();

        cursos.add(new Curso(1, 1, 1, "AQL", "AQL", 0, a1));
        cursos.add(new CursoEspecializacao(1, 1, 1, "AQL", "AQL", 0, a1, true));
        cursos.add(new CursoMestrado(1, 1, 1, "AQL", "AQL", 0, a1, false));

        //System.out.println(cursos.get(1).getLatuSense());

    }
}
