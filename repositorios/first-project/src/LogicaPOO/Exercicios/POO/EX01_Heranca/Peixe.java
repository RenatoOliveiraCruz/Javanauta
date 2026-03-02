package LogicaPOO.Exercicios.POO.EX01_Heranca;

public class Peixe extends Animal{
    private String caracteristicas;

    public Peixe() {
        super();
        this.setPatas(0);
        this.setAmbiente("Mar");
        this.setCor("Cinzenta");
        this.caracteristicas = "Barbatanas e cauda";
    }

    public String getCaracteristicas() {
        return caracteristicas;
    }
}
