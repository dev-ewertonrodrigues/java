// HashMap = Serve para Armazenar pares de chave-valor / Faz parte da biblioteca java.util
//           Chave-valor: Cada chave é única e está associada a um valor.
//           A lista só pode armazenar uma chave por vez. List<String> ou List<Integer>
//           O HashMap armazena ambos. Por exemplo: "Nome do aluno"(chave), nota dele(valor). HashMap<String, Integer> / <String, String> e etc.

// Diferença HashMap e TreeMap
// HashMap = Key, value(Chave-valor) / Não mantém ordem dos nossos elementos / Usa tabela de Hash(armazena em memória/tempo de execução)
//           Toda vez que restarta ele pode mudar as ordens das key, value
// TreeMap = key, value(chave-valor) / Mantém a ordem /

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapAndTreeMap {
    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap<>();
        notasAlunos.put("Cris", 9.5);
        notasAlunos.put("Theo", 9.9);
        notasAlunos.put("Ewerton", 7.5);

        TreeMap<String, Double> notasAlunos2 = new TreeMap<>();
        notasAlunos.put("Cris", 9.5);
        notasAlunos.put("Theo", 9.9);
        notasAlunos.put("Ewerton", 7.5);

        //iteração com for
        for (String nomeAluno : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nomeAluno);
            System.out.println(nomeAluno + ": " + nota);
        }

        //iteração com Map.Entry
        for(Map.Entry<String, Double> nota : notasAlunos.entrySet()){
            String nomeAluno = nota.getKey();
            double valorNota = nota.getValue();
            System.out.println(nomeAluno + ": " + valorNota);
        }

        double nota = notasAlunos.get("Cris");
        System.out.println("A nota da Cris é: " + nota);

        // Impressão para TreeMap = Pode selecionar o elemento específico porque mantém a ordem.
        System.out.println("Primeira chave: " + notasAlunos2.firstEntry());
        System.out.println("Última chave: " + notasAlunos2.lastEntry());

        int tamanhoDoHashMap = notasAlunos.size(); // Tamanho do Hash

        notasAlunos.remove("Theo"); // Remover do Hash

    }
}
