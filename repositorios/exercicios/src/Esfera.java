//          Faça um programa que calcule e mostre o volume de uma esfera sendo fornecido o valor de seu raio (R).
//          A fórmula para calcular o volume é:
//
//        (4/3) * pi * R^3
//        Considere (atribua) para pi o valor 3.14159.Dica:Ao utilizar a fórmula, procure usar (4/3.0) ou (4.0/3), pois o Portugl, assume que o resultado da divisão entre dois inteiros é outro inteiro.
//        Entrada:
//        A entrada contém um valor real, correspondente ao raio da esfera.
//
//        Saída:
//        A saída deverá ser uma mensagem "VOLUME" conforme o exemplo fornecido abaixo, com um espaço antes e um espaço depois da igualdade

import java.util.Scanner;

public class Esfera {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor do raio (R): ");
        double radius = scanner.nextDouble();

        double size = (4.0/3) * 3.14159 * Math.pow(radius, 3);

        System.out.println("O volume da esfera é = " + size);

    }
}
