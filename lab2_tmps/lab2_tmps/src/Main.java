import building.*;
import building.TargetInterface;


public class Main {

    public static void main(String[] args) {


        Construction school = BuildingFactory.getBuilding(BuildingType.SCHOOL);         //Flyweight
        Construction luxurySchool = new LuxuryConstruction(school);                     //Decorator

        TargetInterface cityAdapter = new CityAdapter();    //Adapter
        cityAdapter.addOneConstruction(school);             //Adapter
        cityAdapter.addOneConstruction(luxurySchool);       //Adapter

        cityAdapter.createConstructions();                  //Adapter


    }

}
