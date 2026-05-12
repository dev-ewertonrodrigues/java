//        Leia quatro valores inteiros A, B, C e D.
//        A seguir, calcule e mostre a diferença do produto de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D)
//
//        Entrada:
//        A entrada contém 4 valores inteiros
//
//        Saída:
//        Imprima a mensagem DIFERENCA (sem cedilha) com todas as letras maiúsculas, conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade.

import java.util.Scanner;

public class Diferença {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor inteiro de A: ");
        int valorA = scanner.nextInt();
        System.out.println("Digite o valor inteiro de B: ");
        int valorB = scanner.nextInt();
        System.out.println("Digite o valor inteiro de C: ");
        int valorC = scanner.nextInt();
        System.out.println("Digite o valor inteiro de D: ");
        int valorD = scanner.nextInt();

        int diferenca = (valorA * valorB) - (valorC * valorD);

        System.out.println(" Valor de A: " + valorA);
        System.out.println(" Valor de B: " + valorB);
        System.out.println(" Valor de C: " + valorC);
        System.out.println(" Valor de D: " + valorD);
        System.out.println(" O valor da Diferença entre os números é = " + diferenca);
    }
}
