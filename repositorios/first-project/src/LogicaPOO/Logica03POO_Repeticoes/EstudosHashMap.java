package LogicaPOO.Logica03POO_Repeticoes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class EstudosHashMap {
    public EstudosHashMap() {
    }

    public static void main(String[] args) {
        HashMap<String, Double> notasAlunos = new HashMap();
        notasAlunos.put("Alice", 9.5);
        notasAlunos.put("Mateus", 8.5);
        notasAlunos.put("Maria", 9.2);
        Iterator var2 = notasAlunos.keySet().iterator();

        while(var2.hasNext()) {
            String nome = (String)var2.next();
            double nota = (Double)notasAlunos.get(nome);
            System.out.println(nome + " : " + nota);
        }

        var2 = notasAlunos.entrySet().iterator();

        while(var2.hasNext()) {
            Map.Entry<String, Double> nota = (Map.Entry)var2.next();
            String nome = (String)nota.getKey();
            double valorNota = (Double)nota.getValue();
            System.out.println(nome + ": " + valorNota);
        }

        double nota = (Double)notasAlunos.get("Alice");
        System.out.println("A nota da Alice é: " + nota);
        int tamanhoHash = notasAlunos.size();
        notasAlunos.remove("Maria");
        System.out.println(notasAlunos);
    }
}
