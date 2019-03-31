import java.util.ArrayList;
import java.util.List;

public class ConstructionCollectionImpl implements  ConstructionCollection {


    private List<Construction> constructionList;

    public ConstructionCollectionImpl(List<Construction> constructionList) {
        this.constructionList = new ArrayList<>();
    }

    @Override
    public void addChannel(Construction c) {
        constructionList.add(c);
    }

    @Override
    public void removeChannel(Construction c) {
        constructionList.remove(c);
    }

    @Override
    public ConstructionIterator iterator(ConstructionType constructionType) {
        return new ConstructionIteratorImpl(constructionType, this.constructionList);
    }

    private class ConstructionIteratorImpl implements ConstructionIterator{

        private ConstructionType constructionType;
        private List<Construction> constructionList;
        private int position;

        public ConstructionIteratorImpl(ConstructionType constructionType, List<Construction> constructionList) {
            this.constructionType = constructionType;
            this.constructionList = constructionList;
        }

        @Override
        public boolean hasNext() {
            while (position < constructionList.size()) {
                Construction c = constructionList.get(position);
                if (c.getConstructionType().equals(constructionType)) {
                    return true;
                } else
                    position++;
            }
            return false;
        }

        @Override
        public Construction next() {
            Construction c = constructionList.get(position);
            position++;
            return c;
        }
    }
}
