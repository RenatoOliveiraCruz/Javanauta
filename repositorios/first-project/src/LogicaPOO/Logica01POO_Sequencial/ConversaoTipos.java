package LogicaPOO.Logica01POO_Sequencial;

public class ConversaoTipos {
    public static void main(String[] args) {
        int i = 10;
        double d = i;

        double d2 = 10.5;
        int i2 = (int) d2;

        Integer numeroInterger = 10;
        String numeroString = numeroInterger.toString();


        String stringN = "1234";
        Integer convertedNI = Integer.parseInt(stringN);
        Double convertedND = Double.parseDouble(stringN);
        Long convertedNL = Long.parseLong(stringN);

        Long nL = 10L;
        String nSL = nL.toString();

        System.out.println(d);
        System.out.println(i2);
        System.out.println(numeroInterger + " " + stringN);
        System.out.println(numeroString + " " + convertedNI);
        System.out.println(nL);
        System.out.println(nSL);

    }


}



