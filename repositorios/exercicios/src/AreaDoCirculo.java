// A fórmula para calcular a área de uma circunferência é:
//
// area = PI . raio^2
// Considerando para este problema que PI = 3.14159, efetue o cálculo da área, elevando o valor de raio ao quadrado e multiplicando por PI.
// Entrada:
// A entrada contém um valor real, no caso, a variável raio.
//
//        Saída:
// Apresentar a mensagem "A=" seguido pelo valor da variável area

import java.util.Scanner;

public class AreaDoCirculo {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor do raio: ");
        double raio = scanner.nextDouble();

        double area = 3.14159 * (raio * raio);

        System.out.println("O valor da área é: " + area); 
    }
}
