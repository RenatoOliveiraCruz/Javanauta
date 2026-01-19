package LogicaPOO.Logica02POO_Condicional;

import java.util.Scanner;

public class TernaryOperator {
    public TernaryOperator() {
    }

    public static void main(String[] args) {
        Scanner ternary = new Scanner(System.in);
        System.out.print("Type a hour for the greeting: ");
        int numb = ternary.nextInt();
        String greeting = numb < 18 ? "Good day." : "Good evening.";
        System.out.println(greeting);
    }
}