import java.util.Scanner;

public class For_introdução {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número de vezes do For: ");
        int number = sc.nextInt();
        System.out.println();
        System.out.println();

        int soma = 0; // variável para gerar o resultado
        for (int i = 0; i < number; i++) {
            System.out.println("Digite o próximo número da soma: ");
            int x = sc.nextInt(); // variável para armazenar o valor digitado N vezes estipulado pelo number no início.
            soma = soma + x; // variável começa zerada e soma com o número digitado na variável x N vezes
        }
        System.out.println("O valor total digitado é: " + soma);
        sc.close();
    }
}
