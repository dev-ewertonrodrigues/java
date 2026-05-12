//      Leia dois valores inteiros, no caso para variáveis A e B. A seguir, calcule a soma entre elas e atribua à variável SOMA. A seguir escrever o valor desta variável.
//
//        Entrada:
//        A entrada contém 2 valores inteiros.
//
//        Saída:
//        Imprima a mensagem "SOMA" com todas as letras maiúsculas, com um espaço em branco antes e depois da igualdade seguido pelo valor correspondente à soma de A e B.

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor de A: ");
        double number1 = scanner.nextDouble();

        System.out.println("Digite o valor de B: ");
        double number2 = scanner.nextDouble();

        double valorTotal = number1 + number2;

        System.out.println("Valor de A digitado: " + number1);
        System.out.println("Valor de B digitado: " + number2);
        System.out.println("O valor da soma de A + B é = " + valorTotal);

    }
}
