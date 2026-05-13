//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

// 1 º - Ler a hora inicial
// 2º - Ler a hora final
// 3º - Duração do jogo

import java.util.Scanner;

public class DuraçãoDoJogo {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite a hora inicial do jogo(número inteiro entre 0 e 24): ");
        int startTime = scanner.nextInt();
        System.out.println("Digite a hora final do jogo(número inteiro entre 0 e 24):");
        int endTime = scanner.nextInt();

        int durationTime = 0;

        if (startTime > 24 || endTime > 24){
            System.out.println("Número digitado INCORRETO, digite um número entre 0 e 24");
        } else if (startTime > endTime) {
            durationTime = 24 -(startTime - endTime);
            System.out.println(" O jogo durou " + durationTime + " Hora(s)");
        } else if (startTime < endTime) {
            durationTime = (endTime - startTime);
            System.out.println("O jogo durou " + durationTime + " Hora(s)");
        } else if (startTime == 0 && endTime == 0) {
            System.out.println(" O jogo durou 24 Hora(s)");
        }
    }
}
