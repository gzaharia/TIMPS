package construction.chain;

import construction.Construction;

public interface Chain {


    void setNextChain(Chain nextChain);

    void performAction(Construction construction);
}
