package building;

//Decorator structural pattern
public class ConstructionDecorator implements Construction {

    protected Construction construction;

    public ConstructionDecorator(Construction construction) {
        this.construction = construction;
    }

    @Override
    public void build() {
        this.construction.build();
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
