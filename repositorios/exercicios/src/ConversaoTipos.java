public class ConversaoTipos {

    public static void main(String[] args) {

        // OBS: long e int (minúsculo) é um tipo de dado primitivo, enquanto Long e Integer (maiúsculo) é uma classe Wrapper (objeto) que encapsula esse primitivo
        // Int e long (minúsculos = tipo primitivo) não podem ser convertidos, tem que ser transformados para tipo Wrapper (Long e Integer).

        int i = 10;
        double d = i; // Conversão implícita: Ocorre automaticamente quando convertemos um tipo menor para um tipo maior.

        double d2 = 10.5;
        int int2 = (int) d2; // conversão explícita: Precisamos fazer manualmente ao converter um tipo maior para um menor.

        Integer numeroInteger = 10;
        String numeroString = numeroInteger.toString(); // Inteiro para String

        String numeroString2 = "1234";
        Integer numeroConvertidoInt = Integer.parseInt(numeroString2); // String para Inteiro
        Double numeroConvertidoDouble = Double.parseDouble(numeroString2); // String para Double
        Long numeroConvertidoLong = Long.parseLong(numeroString2); // String para Long

        Double numeroDouble = 10.0;
        String numeroDoubleString = numeroDouble.toString(); // Double para String

        Long numeroLong = 10L;
        String numeroLongString = numeroLong.toString(); // Long para String

        System.out.println(d);
        System.out.println(int2);
        System.out.println(numeroInteger + " " + numeroString);
        System.out.println(numeroString2 + " " + numeroConvertidoInt);
    }
}
