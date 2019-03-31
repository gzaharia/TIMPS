public interface ConstructionCollection {

    public void addChannel(Construction c);

    public void removeChannel(Construction c);

    public ConstructionIterator iterator(ConstructionType constructionType);

}
