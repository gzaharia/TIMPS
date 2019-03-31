public interface Chain {


    void setNextChain(Chain nextChain);

    void performAction(Construction construction);
}
