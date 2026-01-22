package LogicaPOO.POO.Metodo;

import java.util.Scanner;

public class Metodo {
    public static void main(String[] args) {
        Scanner pcanner = new Scanner(System.in);
        System.out.println("Escolha um metodo e te direi suas características: 1- public || 2- private || 3- protected");
        int metodos = pcanner.nextInt();
        switch (metodos) {
            case 1 -> System.out.println("Você escolheu **public**: Método que permite a ativação da classe/objeto/função em qualquer destino.");
            case 2 -> System.out.println("Você escolheu **private**: Método que permite a ativação da classe/objeto/função apenas dentro da mesma classe.");
            case 3 -> System.out.println("Você escolheu **protected**: Método que permite a ativação da classe/objeto/função em outras classes, porém não em outro pacote.");
            default -> System.out.println("Você escolheu uma alternativa inválida.");
        }

    }
}