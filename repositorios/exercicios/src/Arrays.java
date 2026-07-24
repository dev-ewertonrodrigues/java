// Arrays: O tamanho de um array é definido no momento da sua criação e não pode ser alterado.
// Eles podem armazenar tipos primitivos (int, char, etc.) e objetos.

public class Arrays {
    public static void main(String[] args) {
        //Declaração de array

        int[] numeros = {1,2,3,4,5};
        String[] frutas;

        frutas = new String[] {"Maçã", "Banana", "Laranja", "Limão"}; // atribuição de valores ao array de frutas declarado no começo.

        //outra forma de inicializar

        double[] numeros2 = new double[5];
        numeros2[0] = 5.0;
        numeros2[1] = 7.0;
        numeros2[2] = 1.5;
        numeros2[3] = 10.8;
        numeros2[4] = 6.6;

        // Iteração sobre o array(ação sobre as posições do array)

        for (int position = 0; position < numeros2.length; position++) {
            System.out.println("Os números digitados são: " + numeros2[position]);
        }

        System.out.println();
        //for it - muito usado para array e arraylist
        for(double valor: numeros2){
            System.out.println("O valor digitado é: " + valor);
        }

        System.out.println();
        //Alteração de um valor específico
        numeros2[2] = 25.5;
        System.out.println("O salário da posição 2 foi alterado para: " + numeros2[2]);
    }
}
