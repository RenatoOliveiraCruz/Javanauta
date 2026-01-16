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

    public void combinacaoSimples() {
        System.out.println("Vamos lá, a simples: 2 " + jab + " e 1 " + direto);
    };

    public void combinacaoBoxeBasica() {
        System.out.println("A basiquinha do boxe: 2 " + jab + ", 1 " + direto + ", " + penduloD +
    ", 1 " + upper + " e termina com 1 " + cruzado);
    };

    public void combinacaoMuayThauMediana() {
        System.out.println("No Muay Thai agora: " + jab + ", " + direto + ", " + chuteBD + ", "
    + cruzado + "," + clinch + " e traz a " + cotovelada + " de encontro");
    };

}

