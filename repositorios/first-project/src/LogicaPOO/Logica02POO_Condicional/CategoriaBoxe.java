package LogicaPOO.Logica02POO_Condicional;

import java.util.Scanner;

public class CategoriaBoxe {
    public CategoriaBoxe() {
    }

    public static void main(String[] args) {
        System.out.println("Qual o nome do lutador?");
        Scanner scannerNome = new Scanner(System.in);
        String nome = scannerNome.nextLine();

        System.out.println("Qual o peso do lutador?");
        Scanner scannerPeso = new Scanner(System.in);


        String anuncio = ("O lutador \{nome}, entrará na categoria de \{categoria}");


    }
}