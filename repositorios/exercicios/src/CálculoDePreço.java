//          Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
//          Após, calcule e mostre o valor a ser pago.
//
//        Entrada:
//        O arquivo de entrada contém seis linhas de dados, que descrevem as 2 peças. Cada produto tem seu código, quantidade (inteiros) e o preço unitário (real)
//
//        Saída:
//        A saída deverá ser uma mensagem conforme o exemplo fornecido abaixo, lembrando de deixar um espaço após os dois pontos e um espaço após o "R$".

import java.util.Scanner;

public class CálculoDePreço {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o código da 1ª peça: ");
        int code1 = scanner.nextInt();
        System.out.println("Digite o total de unidades da 1ª peça: ");
        int number1 = scanner.nextInt();
        System.out.println("Digite o valor unitário da 1ª peça: ");
        double valor1 = scanner.nextDouble();

        System.out.println("Digite o código da 2ª peça: ");
        int code2 = scanner.nextInt();
        System.out.println("Digite o total de unidades da 2ª peça: ");
        int number2 = scanner.nextInt();
        System.out.println("Digite o valor unitário da 2ª peça: ");
        double valor2 = scanner.nextDouble();

        double totalPart1 = valor1 * number1;
        double totalPart2 = valor2 * number2;
        double totalPurchase = totalPart1 + totalPart2;

        System.out.println("Código da 1ª peça: " + code1);
        System.out.println("Total de unidades pedidas: " + number1);
        System.out.println("Valor unitário da 1ª peça: R$" + valor1 + " reais");
        System.out.println("---------------------------------------");
        System.out.println("Código da 2ª peça: " + code1);
        System.out.println("Total de unidades pedidas: " + number2);
        System.out.println("Valor unitário da 2ª peça: R$" + valor2 + " reais");
        System.out.println("---------------------------------------");
        System.out.println("Valor total da 1ª peça, código (" + code1 + ") é = R$" + totalPart1 + " reais");
        System.out.println("Valor total da 2ª peça, código (" + code2 + ") é = R$" + totalPart2 + " reais");
        System.out.println("O valor total da compra é = R$" + totalPurchase + " reais");
    }
}
