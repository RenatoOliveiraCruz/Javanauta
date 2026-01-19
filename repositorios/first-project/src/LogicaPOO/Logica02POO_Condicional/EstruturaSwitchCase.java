package LogicaPOO.Logica02POO_Condicional;

import java.util.Scanner;

public class EstruturaSwitchCase {
    public EstruturaSwitchCase() {
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;

        while(!entradaValida) {
            System.out.println("Escolha um dia da semana (1-7): ");
            int diaSemanal = scanner.nextInt();
            switch (diaSemanal) {
                case 1:
                    System.out.println("Domingo");
                    entradaValida = true;
                    break;
                case 2:
                    System.out.println("Segunda");
                    entradaValida = true;
                    break;
                case 3:
                    System.out.println("Terça");
                    entradaValida = true;
                    break;
                case 4:
                    System.out.println("Quarta");
                    entradaValida = true;
                    break;
                case 5:
                    System.out.println("Quinta");
                    entradaValida = true;
                    break;
                case 6:
                    System.out.println("Sexta");
                    entradaValida = true;
                    break;
                case 7:
                    System.out.println("Sábado");
                    entradaValida = true;
                    break;
                default:
                    System.out.println("Dia semanal inexistente. Tente novamente:");
            }
        }

        System.out.println("Type a char to choose:");
        System.out.println("A: Buy; B: Sell; C: Listing; D: Quit;");
        Scanner reader = new Scanner(System.in);
        char choice = reader.next().charAt(0);
        switch (choice) {
            case 'A' -> System.out.println("You choose: Buy");
            case 'B' -> System.out.println("You choose: Sell");
            case 'C' -> System.out.println("You choose: Listing");
            default -> System.out.println("Quiting...");
        }

    }
}

