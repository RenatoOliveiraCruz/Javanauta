package LogicaPOO.Logica03POO_Repetiticoes;

public class EstruturaFor {
    public static void main(String[] args) {

        for (int cont = 0; cont < 5; cont++) {
            System.out.println("Contador: " + cont);
        }

        // Declarando arrays:
        double[] salarios = new double[5];
        salarios[3] = 500.00;
        salarios[1] = 200.50;
        salarios[0] = 150.00;
        salarios[2] = 600.50;
        salarios[4] = 109.00;

        // Iterando arrays com For:
        for (int posicao = 0; posicao < salarios.length; posicao++) {
            System.out.println("Salário: " + salarios[posicao]);
        }

        // Iterando arrays com For In:
        for (double salario : salarios) {
            System.out.println(salario);
        }
    }
}
