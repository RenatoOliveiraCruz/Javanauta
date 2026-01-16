package LogicaPOO.Logica03POO_Repetiticoes;

import java.util.TreeMap;

public class EstudoTreeMap {
    public static void main(String[] args) {
        TreeMap<String, Double> notasAlunos = new TreeMap<>();
        notasAlunos.put("Renato", 10.0);
        notasAlunos.put("Kailany", 10.0);
        notasAlunos.put("Sofia", 8.8);

        for(String nome : notasAlunos.keySet()) {
            double nota = notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        System.out.println("Primeira chave: " + notasAlunos.firstKey());
        System.out.println("Última chave: " + notasAlunos.lastKey());
    }
}