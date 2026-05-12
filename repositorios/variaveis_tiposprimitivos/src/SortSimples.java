//      Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente na mesma linha
//
//      Saída:
//      Exemplos de Entrada e Saída

import java.util.Scanner;
import java.util.Arrays;

public class SortSimples {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println(" Digite o 1º Valor: ");
        int valor1 = scanner.nextInt();
        System.out.println(" Digite o 2º Valor: ");
        int valor2 = scanner.nextInt();
        System.out.println(" Digite o 3º Valor: ");
        int valor3 = scanner.nextInt();

        int contador;

        if (valor1 > valor2) {
            contador = valor1;
            valor1 = valor2;
            valor2 = contador;
        }

        if (valor2 > valor3) {
            contador = valor2;
            valor2 = valor3;
            valor3 = contador;
        }

        if (valor1 > valor2) {
            contador = valor1;
            valor1 = valor2;
            valor2 = contador;
        }

        System.out.println(valor1 + " " + valor2 + " " + valor3);
    }
}

//  1. Comparar A e B
//
//  Se A for maior, trocamos os dois.
//  Assim garantimos que A ≤ B
//
//  2. Comparar B e C
//
//  Se B for maior, trocamos.
//  Agora garantimos que C é o maior até aqui
//
//  3. Comparar A e B novamente
//
//  Após a troca anterior, A e B podem ter ficado fora de ordem.
//  Então ajustamos novamente.
//
//  Por que precisa de 3 comparações?
//
//  Porque estamos simulando uma ordenação manual.
//
//  Esse processo é uma versão simplificada de um algoritmo de ordenação chamado Bubble Sort, mas reduzido para apenas 3 valores.
//
//        exemplo:
//
//  Entrada:
//        3 1 2
//
//  Passos:
//
//  A > B → troca → 1 3 2
//  B > C → troca → 1 2 3
//  A > B → ok
//
//  Saída:
//
//        1 2 3