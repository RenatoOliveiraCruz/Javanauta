package LogicaPOO.POO.Atleta;

public class Duble extends Atleta {
    boolean estaEmForma;

    public Duble(String etnia, String modalidade, double altura, double peso, boolean estaEmForma){
        super(etnia, modalidade, altura, peso);
        this.estaEmForma = estaEmForma;
    }

    public void quedaPericulosa(){
        if (this.estaEmForma) {
            System.out.printf("Caindo com técnica! Dublê saiu ileso");
        } else {
            System.out.printf("Dublê fora de forma... Chamem a ambulância");
        }
    }
}