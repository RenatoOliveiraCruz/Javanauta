package LogicaPOO.Logica03POO_Repeticoes;

public class EstruturaWhile {
    public EstruturaWhile() {
    }

    public static void main(String[] args) {
        int contador;
        for(contador = 0; contador <= 5; ++contador) {
            System.out.println("Contador: " + contador);
        }

        do {
            System.out.println("Contador do while " + contador);
            ++contador;
        } while(contador < 5);

    }
}
