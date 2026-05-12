//      Leia dois valores inteiros. A seguir, calcule o produto entre estes dois valores e atribua esta operação à variável PROD.
//      A seguir mostre a variável PROD com mensagem correspondente.
//
//        Entrada:
//        A entrada contém 2 valores inteiros.
//
//        Saída:
//        Imprima a mensagem "PROD" e a variável PROD conforme exemplo abaixo, com um espaço em branco antes e depois da igualdade

import java.util.Scanner;

public class ProdutoSimples {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor do 1° número: ");
        double number1 = scanner.nextDouble();

        System.out.println("Digite o valor do 2° número: ");
        double number2 = scanner.nextDouble();

        double valorTotal = number1 * number2;

        System.out.println("Valor do 1° número: " + number1);
        System.out.println("Valor do 2° número: " + number2);
        System.out.println("O Produto Simples dos valores digitados é = " + valorTotal);


    }
}
