package LogicaPOO.Logica02POO_Condicional;

import java.util.Scanner;
public class ExpressoesComparativas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        double voce = scanner.nextDouble();
        System.out.println("E o parça?");
        double para = scanner.nextDouble();

        if (voce < para) {
            System.out.println("Você é mais novo");
        } else {
            System.out.println("Você é mais velho");
        }
    }
}