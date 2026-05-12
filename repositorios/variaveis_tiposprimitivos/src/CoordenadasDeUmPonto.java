//      Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
//      A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//      Se o ponto estiver na origem, escreva a mensagem “Origem”.
//      Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.
//      Q1 = X>0 e Y>0 / Q2 = X>0 e Y <0 / Q3 = X<0 e Y<0 / Q4 = X<0 e Y>0

import java.util.Scanner;

public class CoordenadasDeUmPonto {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor do Eixo X: ");
        double axisX = scanner.nextDouble();
        System.out.println("Digite o valor do Eixo Y: ");
        double axisY = scanner.nextDouble();

        if (axisX > 0 && axisY > 0) {
            System.out.println(" Valores se encontram no Quadrante Q1");
        } else if ( axisX >0 && axisY < 0) {
            System.out.println(" Valores se encontram no Quadrante Q2");
        } else if (axisX < 0 && axisY < 0) {
            System.out.println(" Valores se encontram no Quadrante Q3");
        } else if (axisX < 0 && axisY > 0) {
            System.out.println(" Valores se encontram no Quadrante Q4");
        } else if (axisX != 0 && axisY == 0) {
            System.out.println(" Valor está no Eixo X(Valor de Y = 0 e X diferente de 0)");
        } else if (axisX == 0 && axisY != 0) {
            System.out.println(" Valor está no Eixo Y(Valor de X = 0 e Y Diferente de 0");
        } else {
            System.out.println(" Os valores estão na Origem(Eixo 0)");
        }
    }
}
