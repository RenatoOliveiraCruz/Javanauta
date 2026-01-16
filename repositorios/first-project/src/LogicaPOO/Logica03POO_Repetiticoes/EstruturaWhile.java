package LogicaPOO.Logica03POO_Repetiticoes;

public class EstruturaWhile {
    public static void main(String[] args) {
//        WHILE:
        int contador = 0;

        while (contador <= 5){
            System.out.println("Contador: " + contador);
              contador++;
        }

//        DO WHILE:
        do{
            System.out.println("Contador do while " + contador);
            contador++;
        }while (contador < 5);
    }
}


