package construction;

public class BuildWoodenConstructionTemplateStrategy extends BuildConstructionTemplateStrategy {

    @Override
    public void buildWalls() {
        System.out.println("Build wooden walls");
    }

    @Override
    public void buildPillars() {
        System.out.println("Build wooden pillars");
    }
}
