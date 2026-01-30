package LogicaPOO.Logica03POO_Repeticoes;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        System.out.println("Escolha um número para multiplicá-lo:");
        Scanner scanner = new Scanner(System.in);
        int multiplicado = scanner.nextInt();

        for (int i = 1; i <= 10; i++){
            System.out.println("Multiplicando " + multiplicado + " x " + i + " = "+ (multiplicado * i));
        }
        scanner.close();
    }
}
