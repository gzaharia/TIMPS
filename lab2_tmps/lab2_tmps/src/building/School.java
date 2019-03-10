package building;

import building.Color.Color;

public class School extends Building {
    public School(Color color, BuildingType buildingType) {
        super(color, buildingType);
    }

    @Override
    public void build() {
        System.out.println("------- School -------");
        System.out.println("Build a " + buildingType);
        System.out.println("Color the school in: ");
        color.applyColor();
    }
}
