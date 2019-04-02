package construction.chain;
//chain
import construction.Construction;

public class BuildChain implements Chain {

    private Chain chain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void performAction(Construction construction) {
        System.out.println("construction.chain.BuildChain will build the construction: " + construction.getConstructionType());
        construction.build();
        this.chain.performAction(construction);
    }
}
