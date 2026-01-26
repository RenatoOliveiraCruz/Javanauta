package LogicaPOO.POO.Atleta;

public class Duble extends Atleta {
    boolean estaEmForma;

    public Duble(String etnia, String modalidade, double altura, double peso, boolean estaEmForma){
        // O "super" envia as informações para a classe Pai (Atleta)
        super(etnia, modalidade, altura, peso);
        this.estaEmForma = estaEmForma;
    }

    // O Método exclusivo criado
    public void quedaPericulosa(){
        if (this.estaEmForma) {
            System.out.printf("Caindo com técnica! Dublê saiu ileso\n");
        } else {
            System.out.printf("Dublê fora de forma... Chamem a ambulância\n");
        }
    }
}