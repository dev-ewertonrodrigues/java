import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {

        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Sabão em pó");
        listaDeCompras.add("Papel Higiênico");
        listaDeCompras.add("Pão");
        listaDeCompras.add("Iogurte");

        listaDeCompras.add(1, "Banana");


        for (String itens : listaDeCompras) {
            System.out.println(itens);
        }

        String itens = listaDeCompras.get(3); // adicionar um item a lista em uma posição específica.
        System.out.println("O 4º Item da lista é: " + itens);

        listaDeCompras.remove("Iogurte"); // remover um item da lista
        System.out.println("Qual foi o item removido da Lista de compras? " +  listaDeCompras);

        boolean eVazia = listaDeCompras.isEmpty(); // ver se a lista está vazia
        int tamanhoListaDeCompras = listaDeCompras.size(); // verificar o tamanho da lista
        boolean contem = listaDeCompras.contains("Arroz"); // verificar se tem o item na lista

        System.out.println("A lista está vazia? " + eVazia);
        System.out.println("Qual o tamanho da lista? " +  tamanhoListaDeCompras + " Itens");
        System.out.println("A lista contem arroz? " + contem);

        listaDeCompras.clear(); // limpar a lista de compras
        System.out.println("A lista de compra está vazia? " + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produto -> System.out.println(produto)); // for Each - Pega a nossa lista e pra cada item dela que chamamos de produto e imprima eles.
    }
}
