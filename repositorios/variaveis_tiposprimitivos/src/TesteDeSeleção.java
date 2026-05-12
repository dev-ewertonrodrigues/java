//        Leia 4 valores inteiros A, B, C e D.
//        1 - A seguir, se B for maior do que C
//        2 - e se D for maior do que A,
//        3 - e a soma de C com D for maior que a soma de A e B
//        4 - e se C e D, ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".
//
//        Entrada:
//        Quatro números inteiros A, B, C e D.
//
//        Saída:
//        Mostre a respectiva mensagem após a validação dos valores.

import java.util.Scanner;

public class TesteDeSeleção {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor de A (Número Inteiro): ");
        int valorA = scanner.nextInt();
        System.out.println("Digite o valor de B (Número Inteiro): ");
        int valorB = scanner.nextInt();
        System.out.println("Digite o valor de C (Número Inteiro): ");
        int valorC = scanner.nextInt();
        System.out.println("Digite o valor de D (Número Inteiro): ");
        int valorD = scanner.nextInt();

        if (valorB > valorC &&
            valorD > valorA &&
           (valorC + valorD) > (valorA + valorB) &&
            valorC > 0 &&
            valorD > 0 &&
            valorA % 2 == 0
        ) {
            System.out.println("Valores Aceitos");
        }
        else {
            System.out.println("Valores não Aceitos");
        }
    }
}
