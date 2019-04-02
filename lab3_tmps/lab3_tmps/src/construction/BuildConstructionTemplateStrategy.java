package construction;
//strategy, template, visitor, visitor can be considered as sub-part of strategy
public abstract class BuildConstructionTemplateStrategy {

    public final void buildConstruction(){
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        System.out.println("construction.Construction is built.");
    }

    private void buildWindows() {
        System.out.println("Building Glass Windows");
    }

    public abstract void buildWalls();
    public abstract void buildPillars();

    private void buildFoundation() {
        System.out.println("Building foundation with cement,iron rods and sand");
    }
}
