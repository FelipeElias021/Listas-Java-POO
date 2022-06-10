package N2.Ex01;

import java.util.*;

import N2.Ex01.Entidades.*;

public class ControleGeral {
    static Scanner entrada = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Aluno> alunos = new ArrayList<>();
        ArrayList<Curso> cursos = new ArrayList<>();
        ArrayList<CursoEspecializacao> cursosEspecializacao = new ArrayList<>();
        ArrayList<CursoMestrado> cursosMestrado = new ArrayList<>();

        alunos.add(new AlunoMasculino(1, 19, "Felipe Elias", "60447252194", "Rua X-4 Pq. das Bananas", true,
                new Notas(10, 9.3, 8), "12345"));
        alunos.add(
                new Aluno(2, 21, "Ligia Sol", "46838908107", "Rua Midio St. Velha Suiça", false, new Notas(9, 6.5, 4)));

        cursos.add(new Curso(1, 3120, 2, "Sistemas de Informação", "Luiz Mário", 410,
                new ArrayList<Aluno>(Arrays.asList(alunos.get(0), alunos.get(1)))));
        cursos.add(new Curso(2, 800, 29, "RH", "Aureliano", 157, new ArrayList<Aluno>()));

        cursosEspecializacao.add(new CursoEspecializacao(1, 390, 5, "Segurança da Informação", "Gabriel Riccardo", 89.9,
                new ArrayList<Aluno>(), true));
        cursosEspecializacao.add(new CursoEspecializacao(2, 390, 6, "Big Data e Inteligência Competitiva",
                "Helena Loise", 454.9, new ArrayList<Aluno>(Arrays.asList(alunos.get(0))), true));

        cursosMestrado.add(new CursoMestrado(1, 450, 25, "Administração e Desenv. Empresarial", "Zochil González", 780,
                new ArrayList<Aluno>(), true));
        cursosMestrado.add(
                new CursoMestrado(2, 1575, 21, "Direito", "Alexandre Ostwald", 1474.90, new ArrayList<Aluno>(), true));

        int opc = 0, opc2 = 0;
        boolean flag = true;
        while (flag) {
            System.out.println("\nEscolha uma opção:");
            System.out.println("> 1. Cadastrar");
            System.out.println("> 2. Informações");
            System.out.println("> 3. Verificar Aluno");
            System.out.println("> 4. Sair");
            System.out.print("> ");
            if (entrada.hasNextInt()) {
                opc = entrada.nextInt();
            }
            while (opc <= 0 || opc >= 5) {
                System.out.print("> ");
                opc = entrada.nextInt();
            }

            if (opc != 3 && opc != 4) {

                System.out.println("\n> 1. Aluno");
                System.out.println("> 2. Curso");
                System.out.println("> 3. Curso Especialização");
                System.out.println("> 4. Mestrado");
                System.out.print("> ");
                if (entrada.hasNextInt()) {
                    opc2 = entrada.nextInt();
                }
                while (opc2 <= 0 || opc2 >= 5) {
                    System.out.print("> ");
                    opc2 = entrada.nextInt();
                }
            }

            if (opc == 1) {

                if (opc2 == 1) {
                    addAluno(alunos);
                } else if (opc2 == 2) {
                    addCurso(cursos, alunos, opc2);
                } else if (opc2 == 3) {
                    addCurso(cursosEspecializacao, alunos, opc2);
                } else if (opc2 == 4) {
                    addCurso(cursosMestrado, alunos, opc2);
                }
            } else if (opc == 2) {
                if (opc2 == 1) {
                    getObj(alunos);
                } else if (opc2 == 2) {
                    getObj(cursos);
                } else if (opc2 == 3) {
                    getObj(cursosEspecializacao);
                } else if (opc2 == 4) {
                    getObj(cursosMestrado);
                }
            } else if (opc == 3) {
                verificarAluno(cursos, cursosEspecializacao, cursosMestrado);
            } else {
                flag = false;
            }
        }

    }

    static Aluno addAluno(ArrayList<Aluno> alunos) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nNome do aluno: ");
        String nome = entrada.nextLine();
        System.out.print("Idade: ");
        int idade = entrada.nextInt();
        entrada.nextLine();
        System.out.print("CPF: ");
        String cpf = entrada.nextLine();
        while (cpf.length() != 11) {
            System.out.println("CPF inválido!");
            System.out.println("O CPF precisar ter 11 dígitos, digite novamente.");

            cpf = entrada.nextLine();
        }
        System.out.print("Endereço: ");
        String endereco = entrada.nextLine();
        System.out.print("Sexo (M/F): ");
        char sexo = entrada.nextLine().charAt(0);
        while (sexo != 'M' && sexo != 'F') {
            System.out.println("Sexo inválido!");
            System.out.println("M: Masculino, F: Feminino");
            sexo = entrada.nextLine().charAt(0);
        }
        System.out.print("NOTA 1: ");
        double n1 = entrada.nextDouble();
        System.out.print("NOTA 2: ");
        double n2 = entrada.nextDouble();
        System.out.print("NOTA 3: ");
        double n3 = entrada.nextDouble();

        Aluno aluno;
        int i = alunos.size() + 1;
        if (sexo == 'M') {
            entrada.nextLine();
            System.out.print("Identidade Militar: ");
            String idMilitar = entrada.nextLine();
            while (idMilitar.length() < 5) {
                System.out.println("Identidade Militar inválida!");
                System.out.println("A identidade militar precisar ter ,no mínimo, 5 dígitos, digite novamente.");
                idMilitar = entrada.nextLine();
            }
            aluno = new AlunoMasculino(i, idade, nome, cpf, endereco, true, new Notas(n1, n2, n3), idMilitar);
        } else {
            aluno = new Aluno(i, idade, nome, cpf, endereco, false, new Notas(n1, n2, n3));
        }

        alunos.add(aluno);

        return aluno;
    }

    static <T> void addCurso(ArrayList<T> obj, ArrayList<Aluno> alunos, int opc) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("\nNome do curso: ");
        String nome = entrada.nextLine();

        System.out.print("Valor do curso: ");
        double valor = entrada.nextDouble();
        while (valor < 0) {
            System.out.println("O valor do curso precisa ser positivo!");
            System.out.println("Tente novamente.");
            valor = entrada.nextDouble();
        }

        entrada.nextLine();

        System.out.print("Nome do professor: ");
        String nomeProfessor = entrada.nextLine();

        System.out.print("Carga Horária: ");
        int cargaHoraria = entrada.nextInt();
        while (cargaHoraria <= 0) {
            System.out.println("Carga horário inválida!");
            System.out.println("O curso precisa ter uma carga horária, tente novamente.");
            cargaHoraria = entrada.nextInt();
        }

        System.out.print("Sala: ");
        int sala = entrada.nextInt();

        entrada.nextLine();

        ArrayList<Aluno> alunosMatriculados = new ArrayList<>();
        System.out.println("Tem algum aluno matriculado? (S/N)");
        char opc3 = entrada.nextLine().charAt(0);
        while (opc3 != 'S' && opc3 != 'N') {
            System.out.println("Resposta inválida!");
            System.out.println("S: Sim, N: Não");
            opc3 = entrada.nextLine().charAt(0);
        }
        if (opc3 == 'S') {
            alunosMatriculados.add(addAluno(alunos));
        }

        int i = obj.size() + 1;
        if (opc == 2) {
            obj.add((T) new Curso(i, cargaHoraria, sala, nome, nomeProfessor, valor, alunosMatriculados));
        } else if (opc == 3) {
            System.out.print("Lato Sensu? (S/N) ");
            char latoSensu = entrada.nextLine().charAt(0);
            while (latoSensu != 'S' && latoSensu != 'N') {
                System.out.println("Resposta inválida!");
                System.out.println("S: Sim, N: Não");
                latoSensu = entrada.nextLine().charAt(0);
            }
            if (latoSensu == 'S') {
                obj.add((T) new CursoEspecializacao(i, cargaHoraria, sala, nome, nomeProfessor, valor,
                        alunosMatriculados, true));
            } else {
                obj.add((T) new CursoEspecializacao(i, cargaHoraria, sala, nome, nomeProfessor, valor,
                        alunosMatriculados, false));
            }
        } else {
            System.out.print("Stricto Sensu? (S/N) ");
            char strictoSensu = entrada.nextLine().charAt(0);
            while (strictoSensu != 'S' && strictoSensu != 'N') {
                System.out.println("Resposta inválida!");
                System.out.println("S: Sim, N: Não");
                strictoSensu = entrada.nextLine().charAt(0);
            }
            if (strictoSensu == 'S') {
                obj.add((T) new CursoMestrado(i, cargaHoraria, sala, nome, nomeProfessor, valor, alunosMatriculados,
                        true));
            } else {
                obj.add((T) new CursoMestrado(i, cargaHoraria, sala, nome, nomeProfessor, valor, alunosMatriculados,
                        false));
            }
        }
    }

    static <T> void getObj(ArrayList<T> obj) {
        for (T i : obj) {
            System.out.println(i);
        }
    }

    static void verificarAluno(ArrayList<Curso> curso, ArrayList<CursoEspecializacao> cursoE,
            ArrayList<CursoMestrado> cursoM) {
        Scanner entrada = new Scanner(System.in);
        System.out.print("\nNome do aluno: ");
        String name = entrada.nextLine();

        for (Curso i : curso) {
            if (i.getAlunos().stream().anyMatch(x -> name.equals(x.getNome()))) {
                System.out.println("O aluno faz curso de " + i.getNome());
            }
        }
        for (CursoEspecializacao i : cursoE) {
            if (i.getAlunos().stream().anyMatch(x -> name.equals(x.getNome()))) {
                System.out.println("O aluno faz curso de Especialização de " + i.getNome());
            }
        }
        for (CursoMestrado i : cursoM) {
            if (i.getAlunos().stream().anyMatch(x -> name.equals(x.getNome()))) {
                System.out.println("O aluno faz curso de Mestrado de " + i.getNome());
            }
        }
    }
}
