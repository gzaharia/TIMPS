public class Hotel extends Construction {

    public Hotel(ConstructionType constructionType, BuildConstructionTemplateStrategy strategy) {
        super(constructionType, strategy);
    }

    @Override
    public void build() {
        strategy.buildConstruction();
    }

    @Override
    public String toString() {
        return "Hotel of type " + this.getConstructionType();
    }
}
