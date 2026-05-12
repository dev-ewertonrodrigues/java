//        Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A seguir, calcule e mostre o valor da conta a pagar.
//
//        Codigo - Descrição         - Preço
//        1      - Cachorro Quente     R$ 4.00
//        2      - X Salada            R$ 4.50
//        3      - X-Bacon             R$ 5.00
//        4      - Torrada Simples     R$ 2.00
//        5      - Refrigerante        R$ 1.50
//        Entrada:
//        O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.
//
//        Saída:
//        O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago

import java.util.Scanner;

public class Lanche {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println(" 1 - Cachorro Quente");
        System.out.println(" 2 - X-Salada");
        System.out.println(" 3 - X-Bacon");
        System.out.println(" 4 - Torrada Simples");
        System.out.println(" 5 - Refrigerante");
        System.out.println("Digite o código do Item desejado: ");
        int itemCode = scanner.nextInt();
        System.out.println("Digite quantas unidades deseja do item: ");
        int unitsItems = scanner.nextInt();

        if (itemCode == 1) {
            System.out.println("O Valor pago pelo(s) Cachorro(s)- Quente(s) é = R$" + unitsItems * 4.00 + " reais");
        } else if (itemCode == 2) {
            System.out.println("O Valor pago pelo(s) X-Salada(s) é = R$" + unitsItems * 4.50 + " reais");
        } else if (itemCode == 3) {
            System.out.println("O Valor pago pelo(s) X-Bacon(s) é = R$" + unitsItems * 5.00 + " reais");
        } else if (itemCode == 4) {
            System.out.println("O Valor pago pela(s) Torrada(s) Simples é = R$" + unitsItems * 2.00 + " reais");
        } else if (itemCode == 5) {
            System.out.println("O Valor pago pelo(s) Refrigerante(s) é = R$" + unitsItems * 1.50 + " reais");
        } else {
            System.out.println("Código Inválido");
        }
    }
}
