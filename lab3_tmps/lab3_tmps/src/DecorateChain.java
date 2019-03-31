public class DecorateChain implements Chain {


    private Chain chain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void performAction(Construction construction) {
        System.out.println("DecorateChain will decorate the construction: " + construction.getConstructionType());
        this.chain.performAction(construction);
    }
}
