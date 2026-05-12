//        Calcule o consumo médio de um automóvel sendo fornecidos a distância total percorrida (em Km) e o total de combustível gasto (em litros).
//
//        Entrada:
//        A entrada contém dois valores: um valor inteiro X representando a distância total percorrida (em Km), e um valor real Y representando o total de combustível gasto
//
//        Saída:
//        Apresente o valor que representa o consumo médio do automóvel, seguido da mensagem "km/l".

import java.util.Scanner;

public class Consumo {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o valor através de um n° inteiro da distância total percorrida: ");
        int totalDistance = scanner.nextInt();
        System.out.println("Digite a quantidade total de litros gastos: ");
        double totalFuel = scanner.nextDouble();

        double kmPerLiter = totalDistance / totalFuel;

        System.out.println("Distância total: " + totalDistance + " Km");
        System.out.println("Combustível total: " + totalFuel + " Litros");
        System.out.println("-------------------------------------");
        System.out.println("O consumo médio de combustível na viagem foi = " + kmPerLiter + " km/l");
    }
}
