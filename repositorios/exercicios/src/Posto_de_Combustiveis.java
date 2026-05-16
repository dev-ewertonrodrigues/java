// Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência de seus clientes.
// Escreva um algoritmo para ler o tipo de combustível abastecido (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
// Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado um novo código (até que seja válido).
// O programa será encerrado quando o código informado for o número 4. Deve ser escrito a mensagem:
// "MUITO OBRIGADO" e a quantidade de clientes que abasteceram cada tipo de combustível


import java.util.Scanner;

public class Posto_de_Combustiveis {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        int alchool, gasoline, diesel;
        alchool = 0;
        gasoline = 0;
        diesel = 0;

        System.out.println(" 1 - Álcool");
        System.out.println(" 2 - Gasolina");
        System.out.println(" 3 - Diesel");
        System.out.println(" 4 - Fim ");
        System.out.println("Digite o código do abastecimento:");
        int type = scanner.nextInt();

        while (type !=4) {
            if (type == 1) {
                alchool++;
            }
            else if (type == 2) {
                gasoline++;
            }
            else if (type == 3) {
                diesel++;
            }
            System.out.println("Digite o código do abastecimento");
            type = scanner.nextInt();
        }
        System.out.println("Muito Obrigado pela preferência");
        System.out.println("Abastecimentos com Álcool: " + alchool);
        System.out.println("Abastecimentos com Gasolina: " + gasoline);
        System.out.println("Abastecimentos com Diesel: " + diesel);

        scanner.close();

    }
}
