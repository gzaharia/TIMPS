public class SellChain implements Chain {


    private Chain chain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.chain = nextChain;
    }

    @Override
    public void performAction(Construction construction) {
        System.out.println("SellChain will sell the construction: " + construction.getConstructionType());
    }
}
