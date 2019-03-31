

public abstract class Construction {

    private ConstructionType constructionType;
    protected BuildConstructionTemplateStrategy strategy;

    public Construction(ConstructionType constructionType, BuildConstructionTemplateStrategy strategy) {
        this.constructionType = constructionType;
        this.strategy = strategy;
    }

    public ConstructionType getConstructionType() {
        return constructionType;
    }

    public abstract void build();


    @Override
    public String toString() {
        return super.toString();
    }
}
