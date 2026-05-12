//        Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
//        As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.
//
//        Entrada:
//        A entrada contém um valor inteiro N (não precisa validar, ele será um valor entre 1 e 1.000.000)
//
//        Saída:
//        Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.

import java.util.Scanner;

public class Cédulas {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor Inteiro desejado: ");
        int valorInt = scanner.nextInt();
        int valor = valorInt;

        int note100 = valor / 100;
        int rest100 = valor % 100;

        int note50 = rest100 / 50;
        int rest50 = rest100 % 50;

        int note20 = rest50 / 20;
        int rest20 = rest50 % 20;

        int note10 = rest20 / 10;
        int rest10 = rest20 % 10;

        int note5 = rest10 / 5;
        int rest5 = rest10 % 5;

        int note2 = rest5 / 2;
        int rest2 = rest5 % 2;

        int note1 = rest2 / 1;


        System.out.println(note100 + " nota(s) de R$ 100,00 reais");
        System.out.println(note50 + " nota(s) de R$ 50,00 reais");
        System.out.println(note20 + " nota(s) de R$ 20,00 reais");
        System.out.println(note10 + " nota(s) de R$ 10,00 reais");
        System.out.println(note5 + " nota(s) de R$ 5,00 reais");
        System.out.println(note2 + " nota(s) de R$ 2,00 reais");
        System.out.println(note1 + " nota(s) de R$ 1,00 reais");

    }
}
