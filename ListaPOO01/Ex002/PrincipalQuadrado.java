package ListaPOO01.Ex002;

/*Escreva uma classe Quadrado com atributo lado do tipo double. A classe deve ter um
construtor que recebe como parâmetro o lado do quadrado. Deve também ter os métodos
area() e perimetro() que retornam respectivamente a área e o perímetro do quadrado, cujas
fórmulas são as seguintes:
• area = lado2
• perimetro = 4 x lado
Em seguida, escreva uma Classe PrincipalQuadrado cujo método main instância os 3
objetos a seguir:
q1 lado 2
q2 lado 4
q3 lado 5
Observe que os 3 objetos são instâncias da classe Quadrado criada anteriormente. Após
instanciar os 3 objetos, o método main ainda deve mostrar a área e o perímetro dos 3
quadrados instanciados.*/

public class PrincipalQuadrado {
    public static void main(String[] args) {
        Quadrado q1 = new Quadrado(2);
        Quadrado q2 = new Quadrado(4);
        Quadrado q3 = new Quadrado(5);

        System.out.println("Q1:");
        System.out.println("Área: " + q1.area());
        System.out.println("Perímetro: " + q1.perimetro());

        System.out.println();
        System.out.println("Q2:");
        System.out.println("Área: " + q2.area());
        System.out.println("Perímetro: " + q2.perimetro());

        System.out.println();
        System.out.println("Q3:");
        System.out.println("Área: " + q3.area());
        System.out.println("Perímetro: " + q3.perimetro());


    }
}
