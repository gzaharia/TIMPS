package building;

public class LuxuryConstruction extends ConstructionDecorator {

    public LuxuryConstruction(Construction construction) {
        super(construction);
    }

    @Override
    public void build() {
        construction.build();
        System.out.println("Decorator action: added new luxury elements");
    }
}
