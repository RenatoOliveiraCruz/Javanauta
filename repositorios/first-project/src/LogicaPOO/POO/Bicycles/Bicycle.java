package LogicaPOO.POO.Bicycles;

public class Bicycle {
    int cadence = 0;
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) {
        this.cadence = newValue;
    }

    void changeGear(int newValue) {
        this.gear = newValue;
    }

    void speedUp(int increment) {
        this.speed += increment;
    }

    void applyBrakers(int decrement) {
        this.speed -= decrement;
    }

    void printStates() {
        System.out.println("Cadence: " + this.cadence + ", Speed: " + this.speed + ", Gear: " + this.gear);
    }
}