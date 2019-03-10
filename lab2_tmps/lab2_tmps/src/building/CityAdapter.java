package building;

//Adapter structural pattern
public class CityAdapter extends City implements TargetInterface {
    @Override
    public void createConstructions() {
        build();
    }

    @Override
    public void addOneConstruction(Construction construction) {
        add(construction);
    }

    @Override
    public void removeOneConstruction(Construction construction) {
        remove(construction);
    }

    @Override
    public void destroyAllConstructions() {
        clear();
    }
}
