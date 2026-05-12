//        Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.
//
//        Entrada:
//        A entrada contém um valor inteiro N.
//
//        Saída:
//        Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.
import java.util.Scanner;

public class ConversãoDeTempo {
    public static void main(String[] args) {

        Scanner scanner = new java.util.Scanner(System.in);

        System.out.println("Digite o número de segundos (através de um número inteiro) para fazer a conversão: ");
        int number = scanner.nextInt();

        int time = number;

        int hour = time / 3600;
        int minutes = (time % 3600) / 60;
        int seconds = time % 60;

        System.out.println("O evento irá durar " + hour + " horas : " + minutes + " minutos : " + seconds + " segundos");

    }
}
