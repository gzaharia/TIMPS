public class Hotel extends Construction {

    public Hotel(ConstructionType constructionType, BuildConstructionTemplateStrategy strategy) {
        super(constructionType, strategy);
    }

    @Override
    public void build() {
        strategy.buildConstruction();
    }
}
