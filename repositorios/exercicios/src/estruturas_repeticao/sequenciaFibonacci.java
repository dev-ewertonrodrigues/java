package estruturas_repeticao;

import java.util.Scanner;

public class sequenciaFibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite a quantidade de termos: ");
        int n = scanner.nextInt();

        int f1 = 0;
        int f2 = 1;

        for (int i = 0; i < n; i++) {
            System.out.print(f1 + " ");

            // Calcula o próximo termo
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }

        scanner.close();
    }
}

