package LogicaPOO.POO.Atleta;

public class Main {
    public static void main (String[] args) {
        //Criando o Objeto (Instanciando)
        System.out.println();

        Duble myDuble = new Duble("Pardo","MMA",1.75,85.5, true);

        System.out.println("Atleta de " + myDuble.modalidade);

        myDuble.correr();           // Método herdado do Atleta
        myDuble.quedaPericulosa();  // Método exclusivo do Dublê
    }
}
