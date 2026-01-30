package LogicaPOO.Logica02POO_Condicional;

import java.util.Scanner;

public class MediaNotas {
    public static void main (String[] args){
        double nota1, nota2, nota3, media;
        System.out.println("Adicione a 1ª nota:");
        Scanner scanner = new Scanner(System.in);
        nota1 = scanner.nextDouble();
        System.out.println("Adicione a 2ª nota:");
        nota2 = scanner.nextDouble();
        System.out.println("Adicione a 3ª nota:");
        nota3 = scanner.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;
        String formato = String.format("%.2f", media);
        System.out.printf("A média das 3 notas é de: " + formato);
        scanner.close();
    }
}
