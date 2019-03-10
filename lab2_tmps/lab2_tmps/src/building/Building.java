package building;

import building.Color.Color;
//Bridge structural pattern
public abstract class Building implements Construction {
    protected Color color;
    protected BuildingType buildingType;

    public Building(Color color, BuildingType buildingType) {
        this.color = color;
        this.buildingType = buildingType;
    }

    public BuildingType getBuildingType() {
        return buildingType;
    }


    @Override
    public void add(Construction construction) {

    }

    @Override
    public void remove(Construction construction) {

    }

    @Override
    public void clear() {

    }
}
