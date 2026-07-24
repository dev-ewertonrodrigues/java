// Receba um número N e imprima todos os números de 1 até N.

package estruturas_repeticao;

import java.util.Scanner;

public class contadorDeNumeros {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número Inteiro N: ");
        int number = scanner.nextInt();

        int contador = 1;

        while (contador <= number){
            System.out.println("Contador: " + contador);

            contador++;
        }
    }
}
