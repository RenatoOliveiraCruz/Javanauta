package LogicaPOO.POO.Objetos;

public class Lutador {
    public String jab;
    public String direto;
    public String cruzado;
    public String upper;
    public String penduloE;
    public String penduloD;
    public String chuteBE;
    public String chuteBD;
    public String chuteAE;
    public String chuteAD;
    public String cotovelada;
    public String joelhada;
    public String clinch;

    public Lutador() {
    }

    public void combinacaoSimples() {
        System.out.println("Vamos lá, a simples: 2 " + this.jab + " e 1 " + this.direto);
    }

    public void combinacaoBoxeBasica() {
        System.out.println("A basiquinha do boxe: 2 " + this.jab + ", 1 " + this.direto + ", " + this.penduloD + ", 1 " + this.upper + " e termina com 1 " + this.cruzado);
    }

    public void combinacaoMuayThauMediana() {
        System.out.println("No Muay Thai agora: " + this.jab + ", " + this.direto + ", " + this.chuteBD + ", " + this.cruzado + "," + this.clinch + " e traz a " + this.cotovelada + " de encontro");
    }
}