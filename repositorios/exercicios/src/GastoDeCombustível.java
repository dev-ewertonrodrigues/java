//        Joaozinho quer calcular e mostrar a quantidade de litros de combustível gastos em uma viagem, ao utilizar um automóvel que faz 12 KM/L.
//        Para isso, ele gostaria que você o auxiliasse através de um simples programa. Para efetuar o cálculo, deve-se fornecer o tempo gasto na viagem (em horas) e a velocidade média durante a mesma (em km/h).
//        Assim, pode-se obter distância percorrida e, em seguida, calcular quantos litros seriam necessários.
//
//        Entrada:
//        O arquivo de entrada contém dois inteiros. O primeiro é o tempo gasto na viagem (em horas) e o segundo é a velocidade média durante a mesma (em km/h). Dica: você lê valores inteiros e calcula um valor real, beleza?
//
//        Saída:
//        Imprima a quantidade de litros necessária para realizar a viagem

import java.util.Scanner;

public class GastoDeCombustível {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o tempo gasto na viagem (em horas - valor inteiro): ");
        int totalTime = scanner.nextInt();
        System.out.println("Digite a velocidade média durante a viagem (em km/h - valor inteiro): ");
        int avarageSpeed = scanner.nextInt();
        double consumeCar = 12.0;

        double totalLiters = (totalTime * avarageSpeed) / consumeCar;

        System.out.println("O quantidade de litros para efetuar essa viagem será de: " + totalLiters + " litros");
    }
}
