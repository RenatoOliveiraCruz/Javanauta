package LogicaPOO.Logica01POO_Sequencial;

import java.util.Scanner;
public class InAndOutData {
    public static void main(String[] args) {

//        System.out.println("Print and broken line");
//        System.out.print("Print and keep on line");
//        System.out.printf("Print formated"); (Comentar: CTRL + /)

        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá, digite seu nome: ");
        String name = scanner.nextLine();
        System.out.println("Nome: " + name);

        System.out.println("Digite sua idade: ");
        int age = scanner.nextInt();
        System.out.println("Idade: " + age);

        System.out.println("Digite se você trabalha com Java sim(true) ou não(false):");
        boolean javeiro = scanner.nextBoolean();

        String isJaveiro = (javeiro) ? "sim" : "não";
        System.out.println("Olá, me chamo " + name + ", tenho " + age + " anos, e " + isJaveiro + " trabalho com Java.");

        if (javeiro == true && age > 18) {
            System.out.println("Você está apto");
        } else {
            System.out.println("Você não está apto");
        }
    }
}
