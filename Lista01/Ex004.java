package Lista01;

import java.util.Scanner;

/*Leia uma temperatura em graus Celsius e apresente-a convertida em graus Fahrenheit. A
formula de conversão é: F = C∗(9.0/5.0)+32.0, sendo F a temperatura em Fahrenheit e C
a temperatura em Celsius.*/

public class Ex004 {
    public static void main(String[] args) {
        double celsius, fahrenheit;

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.print("Temperatura em celsius: ");
            celsius = entrada.nextDouble();
        }  

        fahrenheit = ((celsius*9)/5) + 32;

        System.out.println("Temperatura em farenheit: " + fahrenheit + "ºF");
    }
}
