public interface ConstructionCollection {

    public void addConstruction(Construction c);

    public void removeConstruction(Construction c);

    public ConstructionIterator iterator(ConstructionType constructionType);

}
