//  Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada de pontos no sistema cartesiano.
//  Para cada ponto escrever o quadrante a que ele pertence.
//  O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem alguma).

// 1º - Scanner sc = new Scanner(System.in): Abre a entrada de dados.
// 2º - while (true): Cria um loop infinito que só é interrompido pelo comando break.
// 3º - if (x == 0 || y == 0): Verifica se alguma coordenada é nula antes de processar o quadrante.
//      Se for, o break encerra o programa imediatamente.

import java.util.Scanner;

public class Coordenadas_While {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        int numberX, numberY;

        while(true) {
            System.out.println("Digite o valor de X: ");
            numberX = scanner.nextInt();
            System.out.println("Digite o valor de Y: ");
            numberY = scanner.nextInt();


            if (numberX == 0 || numberY == 0) {
                System.out.println("Coordenadas NULAS");
                break;
            }

            if (numberX > 0 && numberY > 0) {
                System.out.println("1º Quadrante");
            } else if (numberX < 0 && numberY > 0) {
                System.out.println("2º Quadrante");
            } else if (numberX < 0 && numberY < 0) {
                System.out.println("3º Quadrante");
            } else if (numberX > 0 && numberY < 0) {
                System.out.println("4º Quadrante");
            }
        }
        scanner.close();
    }
}
