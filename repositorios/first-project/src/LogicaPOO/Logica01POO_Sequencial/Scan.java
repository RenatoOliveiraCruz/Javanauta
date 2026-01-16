package LogicaPOO.Logica01POO_Sequencial;

import java.util.Scanner;
public class Scan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual seu nome?");
        String nome = scanner.nextLine();
        System.out.println("Meu nome é: " + nome);


        System.out.println("Escreva o seu golpe final:");
        Scanner escadush = new Scanner(System.in);
        String posicao = escadush.nextLine();
        String gritano = posicao.toUpperCase();
        System.out.println("MAIS ALTO!!!");
        System.out.println(gritano);
    }
}
