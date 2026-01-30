package LogicaPOO.Logica02POO_Condicional;

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        System.out.println("Vamos descobrir se o número é ímpar ou par!!!");
        System.out.println("Digite um número");
        Scanner scanner = new Scanner(System.in);
        int numero = scanner.nextInt();

        if ((numero % 2) != 0) {
            System.out.printf("O número %d é ímpar", numero);
        } else {
            System.out.printf("O número %d é par", numero);
        }
    }
}
