package ListaPOO01.Ex006;

public class AgendaTeste {
    public static void main(String[] args) {
        Agenda agenda = new Agenda();

        agenda.armazenaPessoa("Felipe", 18,1.77);
        agenda.armazenaPessoa("Gabriel", 16,1.63);
        agenda.armazenaPessoa("Akali", 26,1.55);

        agenda.imprimirAgenda();

        agenda.removePessoa("Felipe");
        agenda.armazenaPessoa("João", 25,1.92);


        agenda.imprimirAgenda();

        System.out.println("Indíce do Gabriel: " + agenda.buscaPessoa("Gabriel"));
        int i = agenda.buscaPessoa("Gabriel");
        agenda.imprimePessoa(i);
    }
}
