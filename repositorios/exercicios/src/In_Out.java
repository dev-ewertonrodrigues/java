//   Leia um valor inteiro N.
//   Este valor será a quantidade de valores inteiros X que serão lidos em seguida.
//   Mostre quantos destes valores X estão dentro do intervalo [10,20] e quantos estão fora do intervalo, mostrando
//   essas informações conforme exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

import java.util.Scanner;

public class In_Out {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int in = 0;
        int out = 0;

        System.out.println("Digite o número de vezes que deseja inserir um número: ");
        int number = sc.nextInt(); // número de vezes representado pelo  i < number;
        System.out.println("Digite os números: ");

        for (int i = 0; i < number; i++) {
            int x = sc.nextInt();
            if (x >=10 && x <= 20) {
                in = in + 1;
            } else {
                out = out +1;
            }
        }

        System.out.println("IN: " + in + " números digitados");
        System.out.println("OUT: " + out + " números digitados");

        sc.close();
    }
}
