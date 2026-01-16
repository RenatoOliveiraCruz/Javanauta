package LogicaPOO.Logica03POO_Repetiticoes;

import java.util.ArrayList;
import java.util.List;

public class EstudoArrayList {
    public static void main(String[] args) {
        //Alt + Enter ---> Importa a classe
        List<String> listaDeCompras = new ArrayList<>();
        listaDeCompras.add("Mamão");
        listaDeCompras.add("Sabão em Pó");
        listaDeCompras.add("Macarrão");

        //Add element on array
        listaDeCompras.add(1,"Banana");

        for(String item : listaDeCompras){
            System.out.println(item);
        }

        String item = listaDeCompras.get(3);
        System.out.println("Na posição 3 eu tenho: " + item);

        //Removendo elemento array
        listaDeCompras.remove(2);

        for(String item2 : listaDeCompras){
            System.out.println(item2);
        }

         boolean eVazia = listaDeCompras.isEmpty();
         int tamanho = listaDeCompras.size();

        boolean contem = listaDeCompras.contains("Arroz");

        System.out.println("A lista esta vazia?: " + eVazia + ", qual o tamanho da lista? " + tamanho + ", e contém o item arroz? " + contem);

//        //Limpar lista:
//        listaDeCompras.clear();
//        System.out.println("A lista esta vazia agora? " + listaDeCompras.isEmpty());

        listaDeCompras.forEach(produto -> System.out.println(produto));

    }
}