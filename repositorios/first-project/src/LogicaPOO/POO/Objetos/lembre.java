package LogicaPOO.POO.Objetos;

import java.util.Scanner;

public class lembre {
    public static void main(String[] args) {
        System.out.println("Olhos vermelhos e que soltam lasers. Quem sou eu?");

        Scanner scott = new Scanner(System.in);

        String xmen = scott.nextLine();
        if (xmen.equals("Scott") || xmen.equals("Ciclope")){
            System.out.println("Ai sim carai, sou eu mesmo!!! ");
        } else {
            System.out.println("Errou ");
        };
    };
};