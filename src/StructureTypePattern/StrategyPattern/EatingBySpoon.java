package StructureTypePattern.StrategyPattern;

public class EatingBySpoon implements EatingStrategy {
    @Override
    public void eating() {
        System.out.println("我在用叉子吃饭！");
    }
}
