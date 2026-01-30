package LogicaPOO.Logica01POO_Sequencial;

import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        System.out.println("Vamos somar!!!");
        System.out.printf("Escolha o primeiro número:");
        Scanner scanner = new Scanner(System.in);
        int firstN = scanner.nextInt();
        System.out.printf("Agora escolha o segundo número:");
        int secondN = scanner.nextInt();

        int somaSimples = firstN + secondN;
        System.out.printf("O valor de %d + %d é igual a %d", firstN, secondN, somaSimples);
        scanner.close();
    }
}
