package construction.iterator;

import construction.Construction;
import construction.ConstructionType;

public interface ConstructionCollection {

    public void addConstruction(Construction c);

    public void removeConstruction(Construction c);

    public ConstructionIterator iterator(ConstructionType constructionType);

}
