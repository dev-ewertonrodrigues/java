//        Escreva um programa que repita a leitura de uma senha até que ela seja válida.
//        Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
//        Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido" e o algoritmo encerrado.
//        Considere que a senha correta é o valor 2002.

import java.util.Scanner;

public class Senha_While {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);
        int maxChar = 10;

        System.out.println("Digite a senha de 4 digitos: ");
        int password = scanner.nextInt();

        while (password != 2002) {
            System.out.println("Senha Inválida");
            password = scanner.nextInt();
        }

        System.out.println("Acesso Permitido");

        scanner.close();

    }
}
