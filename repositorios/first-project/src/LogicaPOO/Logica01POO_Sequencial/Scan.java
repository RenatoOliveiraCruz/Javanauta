package LogicaPOO.Logica01POO_Sequencial;

import java.util.Scanner;

public class Scan {
    public static void main(String[] args) {
        System.out.printf("Qual seu nome?");
        Scanner scanner = new Scanner(System.in);
        String nome = scanner.nextLine();
        System.out.println("Seu nome é " + nome);
    }
}
