import construction.*;
import construction.chain.BuildChain;
import construction.chain.Chain;
import construction.chain.DecorateChain;
import construction.chain.SellChain;
import construction.iterator.ConstructionCollection;
import construction.iterator.ConstructionCollectionImpl;
import construction.iterator.ConstructionIterator;

public class Main {


    public static Chain getChain() {
        Chain c1 = new BuildChain();
        Chain c2 = new DecorateChain();
        Chain c3 = new SellChain();


        c1.setNextChain(c2);
        c2.setNextChain(c3);

        return c1;
    }

    public static void main(String[] args) {

        Chain c = getChain();
        ConstructionCollection constructionCollection = createConstructions();
        ConstructionIterator iterator = constructionCollection.iterator(ConstructionType.WOODEN_HOTEL);

        while (iterator.hasNext()) {
            Construction construction = iterator.next();
            System.out.println("\n\n---------------------------------------");
            System.out.println(construction.toString());
            c.performAction(construction);
            System.out.println("---------------------------------------");
        }


    }


    public static ConstructionCollection createConstructions() {
        ConstructionCollection constructionCollection = new ConstructionCollectionImpl();
        constructionCollection.addConstruction(new Hotel(ConstructionType.WOODEN_HOTEL, new BuildWoodenConstructionTemplateStrategy()));
        constructionCollection.addConstruction(new Hotel(ConstructionType.WOODEN_HOTEL, new BuildWoodenConstructionTemplateStrategy()));
        constructionCollection.addConstruction(new Hotel(ConstructionType.GLASS_HOTEL, new BuildGlassConstructionTemplateStrategy()));


        return constructionCollection;
    }
}
