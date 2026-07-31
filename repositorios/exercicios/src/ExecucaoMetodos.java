public class ExecucaoMetodos {
    public static void main(String[] args) {

        Integer cpf = 15625;

        // chamando a classe do metodo estático
        String cpfConvertido = MetodosInstanciaAndEstatico.conversorString(cpf);

        System.out.println("O CPF é: " + cpfConvertido);
    }
}
