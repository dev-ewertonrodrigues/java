import java.util.Scanner;
import java.util.Arrays;


public class SortSimplesComArraysSort {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        // Entrada de dados (um por vez)
        System.out.println("Digite o 1º valor:");
        int valor1 = scanner.nextInt();

        System.out.println("Digite o 2º valor:");
        int valor2 = scanner.nextInt();

        System.out.println("Digite o 3º valor:");
        int valor3 = scanner.nextInt();

        // Colocando os valores em um array
        int[] valores = {valor1, valor2, valor3};

        // Ordenando
        Arrays.sort(valores);

        // Saída
        System.out.println("Valores em ordem crescente:");
        System.out.println(valores[0] + " " + valores[1] + " " + valores[2]);

        scanner.close();
    }
}
