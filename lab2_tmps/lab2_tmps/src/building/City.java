package building;

import java.util.ArrayList;
import java.util.List;
//Composite structural pattern
public class City implements Construction {


    private List<Construction> constructionList = new ArrayList<>();

    @Override
    public void build() {
        constructionList.forEach(c -> c.build());
    }

    public void add(Construction construction) {
        this.constructionList.add(construction);
    }

    public void remove(Construction construction) {
        this.constructionList.remove(construction);
    }

    public void clear() {
        this.constructionList.clear();
    }
}
