package building;

import building.Color.Color;
//decorator pattern
public class Hotel extends Building {

    public Hotel(Color color, BuildingType buildingType) {
        super(color, buildingType);
    }

    @Override
    public void build() {
        System.out.println("------------------ Hotel ------------------");
        System.out.println("Build a " + buildingType);
        System.out.println("Color the hotel in: ");
        color.applyColor();
    }
}
