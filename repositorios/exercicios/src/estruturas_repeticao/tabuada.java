package estruturas_repeticao;

import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Digite o número multiplicador: ");
        int number = scanner.nextInt();
        int contador = 1;

        while (contador <= 10) {
            System.out.println("Resultado: " + number + " x " + contador + " = " + contador * number);

            contador++;
        }
    }
}
