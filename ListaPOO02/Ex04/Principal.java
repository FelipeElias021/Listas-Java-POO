package ListaPOO02.Ex04;

import ListaPOO02.Ex04.Entidade.*;

public class Principal {
    public static void main(String[] args) {
        Pessoa[] player = new Pessoa[2];
        player[0] = new Pessoa("Felipe", "M", new Data(21, 05, 2003), new Endereco("Rua A5", 13, "Goiânia"));
        player[1] = new Pessoa("Gabriel", "M", new Data(06, 05, 2006), new Endereco("Rua X7", 32, "Goiânia"));
    
        int[] pontuacao = new int[2];

        for (int i = 0; i < 7; i++) {
            System.out.println("\n-----------------------------\nRodada #" + (i + 1));
            
            int[] somaDados = new int[2];

            for (int j = 0; j < 2; j++) {
                System.out.println(player[j].getNome() + " vai jogar o dado de 6 lados:");
                int valor1 = player[j].jogarDadoDe6Faces();
                System.out.println("Dado 6: " + valor1);

                System.out.println(player[j].getNome() + " vai jogar o dado de 8 lados:");
                int valor2 = player[j].jogarDadoDe8Faces();
                System.out.println("Dado 6: " + valor2);

                somaDados[j] = valor1 + valor2;

                System.out.println("Soma dos dados do " + player[j].getNome() + ": " + somaDados[j]);
                System.out.println();
            }

            int k = -1;
            if (somaDados[0] > somaDados[1]) {
                k = 0;
            } else if (somaDados[1] > somaDados[0]) {
                k = 1;
            }
            
            if (k != -1) {
                pontuacao[k]++;
                System.out.println(player[k].getNome() + " ganhou a rodada!");
                
                System.out.println("\nPontuação:");
                for (int j = 0; j < 2; j++) {
                    System.out.println(player[j].getNome() + ": " + pontuacao[j]);
                }
            
                if  (pontuacao[k] == 4) {
                    break;
                }
            }

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

        int k = -1;
            if (pontuacao[0] > pontuacao[1]) {
                k = 0;
            } else if (pontuacao[1] > pontuacao[0]) {
                k = 1;
            }
        System.out.println("\n\n-------------------------------\n");
        if (k != -1) {
            System.out.println(player[k].getNome() + " ganhou com " + pontuacao[k] + " pontos!");
        } else {
            System.out.println("Empatou, a pontuação de ambos foi de " + pontuacao[0]);
        }
        System.out.println("\n-------------------------------\n\n");
    }
}
