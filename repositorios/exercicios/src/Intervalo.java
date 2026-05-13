//        Você deve fazer um programa que leia um valor real qualquer e apresente uma mensagem dizendo em qual dos seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra.
//        Obviamente se o valor não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

//        O símbolo ( representa "maior que". Por exemplo:
//        [0,25] indica valores entre 0 e 25.0000, inclusive eles.
//        (25,50] indica valores maiores que 25 Ex: 25.00001 até o valor 50.0000000
//
//        Entrada:
//        O arquivo de entrada contém um número com ponto real qualquer.
//
//        Saída:
//        A saída deve ser uma mensagem conforme exemplo abaixo.

import java.util.Scanner;

public class Intervalo {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite um valor real entre 0 e 100: ");
        double realValor = scanner.nextDouble();

        if (realValor >= 0 &&  realValor <=25.0) {
            System.out.println("Valor está entre o intervalo de [0, 25]");
        } else if (realValor > 25.0 && realValor <=50.0) {
            System.out.println("Valor está entre o intervalo de [25, 50]");
        } else if (realValor > 50.0 && realValor <=75.0) {
            System.out.println("Valor está entre o intervalo de [50, 75]");
        } else if (realValor > 75.0 && realValor <=100) {
            System.out.println("Valor está entre o intervalo de [75, 100]");
        } else {
            System.out.println("Valor está fora do intervalo");
        }
    }
}
