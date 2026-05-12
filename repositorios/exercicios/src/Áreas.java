
//        Escreva um programa que leia três valores reais: A, B e C. Em seguida, calcule e mostre:
//        a) a área do triângulo retângulo que tem A por base e C por altura.
//        b) a área do círculo de raio C. (pi = 3.14159)
//        c) a área do trapézio que tem A e B por bases e C por altura.
//        d) a área do quadrado que tem lado B.
//        e) a área do retângulo que tem lados A e B.

import java.util.Scanner;

public class Áreas {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double valor1 = scanner.nextDouble();
        System.out.println("Digite o valor de B: ");
        double valor2 = scanner.nextDouble();
        System.out.println("Digite o valor de C: ");
        double valor3 = scanner.nextDouble();

        double pi = 3.14159;
        double triangleRectangle = (valor1 * valor3) / 2;
        double circle = pi * Math.pow(valor3, 2);
        double trapeze = ((valor1 + valor2) * valor3) / 2;
        double square = valor2 * valor2;
        double rectangle = valor1 * valor2;

        System.out.println("Triângulo Retângulo é = " + triangleRectangle);
        System.out.println("Círculo é = " + circle);
        System.out.println("Trapézio é = " + trapeze);
        System.out.println("Quadrado é = " + square);
        System.out.println("Retângulo é = " + rectangle);
    }
}
