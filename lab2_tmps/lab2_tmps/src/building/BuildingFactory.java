package building;

import building.Color.BlueColor;
import building.Color.WhiteColor;

import java.util.HashMap;
//Flyweight structural pattern
public class BuildingFactory {

    private static final HashMap<BuildingType,Building> buildings = new HashMap<>();

    public static Building getBuilding(BuildingType buildingType){

        Building building = buildings.get(buildingType);


        if( building == null){
            switch (buildingType){
                case HOTEL:
                    building = new Hotel(new BlueColor(), BuildingType.HOTEL);
                    break;
                case SCHOOL:
                    building = new School(new WhiteColor(), BuildingType.SCHOOL);
                    break;
            }
            buildings.put(buildingType,building);
        }


        return building;
    }
}
