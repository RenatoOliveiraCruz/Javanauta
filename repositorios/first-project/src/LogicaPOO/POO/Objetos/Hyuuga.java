package LogicaPOO.POO.Objetos;

public class Hyuuga {
    public static void main(String[] args) {


    String nameHyuuga = "Nejiy";
    int ageHyuuga = 20;
    String missionHyuuga = "Protect the princess Hinata.";
    String missionStatus = "Loading...";
    char missionLevel = 'B';
        System.out.println("Name of the 1º Hyuuga: " + nameHyuuga);
        System.out.println("Age of the 1º Hyuuga: " + ageHyuuga);
        System.out.println("The mission of the 1º Hyuuga: " + missionHyuuga);
        System.out.println("The status of mission of the 1º Hyuuga: " + missionStatus);
        System.out.println("The level of mission of the 1º Hyuuga: " + missionLevel);

        if(ageHyuuga < 15){
            if(missionLevel == 'C' || missionLevel == 'A'){
                missionStatus = "Mission Complete";
            } else{
                missionStatus = "Mission Incomplete";
            }
          } else {
            missionStatus = "Mission Complete";
        }
        System.out.println(missionStatus);

        System.out.println("--------------------------------------------");

    String nameHyuuga2 = "Hinata";
    int ageHyuuga2 = 19;
    String missionHyuuga2 = "Find the enemys.";
    String missionStatus2 = "Done";
    char missionLevel2 = 'B';
        System.out.println("Name of the 2º Hyuuga: " + nameHyuuga2);
        System.out.println("Age of the 2º Hyuuga: " + ageHyuuga2);
        System.out.println("The mission of the 2º Hyuuga: " + missionHyuuga2);
        System.out.println("The status of mission of the 2º Hyuuga: " + missionStatus2);
        System.out.println("The level of mission of the 2º Hyuuga: " + missionLevel2);

        if(ageHyuuga2 < 15){
            if(missionLevel2 == 'C' || missionLevel2 == 'A'){
                missionStatus2 = "Mission Complete";
            } else{
                missionStatus2 = "Mission Incomplete";
            }
          } else {
            missionStatus2 = "Mission Complete";
        }
        System.out.println(missionStatus2);

        System.out.println("--------------------------------------------");

    String nameHyuuga3 = "Hanabi";
    int ageHyuuga3 = 14;
    String missionHyuuga3 = "Beat the enemys.";
    String missionStatus3 = "Loading...";
    char missionLevel3 = 'S';
        System.out.println("Name of the 3º Hyuuga: " + nameHyuuga3);
        System.out.println("Age of the 3º Hyuuga: " + ageHyuuga3);
        System.out.println("The mission of the 3º Hyuuga: " + missionHyuuga3);
        System.out.println("The status of mission of the 3º Hyuuga: " + missionStatus3);
        System.out.println("The level of mission of the 3º Hyuuga: " + missionLevel3);

        if(ageHyuuga3 < 15){
            if(missionLevel3 == 'C' || missionLevel3 == 'B'){
                missionStatus3 = "Mission Complete";
            } else{
                missionStatus3 = "Mission Incomplete";
            }
          } else {
            missionStatus3 = "Mission Complete";
        }
        System.out.println(missionStatus3);

    }
}
