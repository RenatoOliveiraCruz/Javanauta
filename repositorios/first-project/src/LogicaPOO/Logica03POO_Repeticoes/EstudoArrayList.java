package LogicaPOO.Logica03POO_Repeticoes;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class EstudoArrayList {
    public EstudoArrayList() {
    }

    public static void main(String[] args) {
        List<String> listaDeCompras = new ArrayList();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em Pó");
        listaDeCompras.add("Macarrão");
        listaDeCompras.add(1, "Banana");
        Iterator var2 = listaDeCompras.iterator();

        while(var2.hasNext()) {
            String item = (String)var2.next();
            System.out.println(item);
        }

        String item = (String)listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho: " + item);
        listaDeCompras.remove(2);
        Iterator var7 = listaDeCompras.iterator();

        while(var7.hasNext()) {
            String item2 = (String)var7.next();
            System.out.println(item2);
        }

        boolean eVazia = listaDeCompras.isEmpty();
        int tamanho = listaDeCompras.size();
        boolean contem = listaDeCompras.contains("Arroz");
        System.out.println("A lista esta vazia?: " + eVazia + ", qual o tamanho da lista? " + tamanho + ", e contém o item arroz? " + contem);
        listaDeCompras.forEach((produto) -> {
            System.out.println(produto);
        });
    }
}
