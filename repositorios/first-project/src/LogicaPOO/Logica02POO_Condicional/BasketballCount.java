package LogicaPOO.Logica02POO_Condicional;

public class BasketballCount {
    public static void main(String[] args) {
        int threePoint, twoPoint, onePoint;
        threePoint = 3;
        twoPoint = 2;
        onePoint = 1;
        int totalPoint = (3 * threePoint) + (5 * twoPoint) + (2 * onePoint);

        System.out.printf("A soma de 3 cestas de %d pontos, 5 cestas de %d pontos e dois lances livres que vale %d ponto convertidos, somam um total de %d pontos", threePoint, twoPoint, onePoint, totalPoint);
    }
}




