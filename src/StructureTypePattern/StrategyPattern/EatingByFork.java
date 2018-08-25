package StructureTypePattern.StrategyPattern;

public class EatingByFork implements EatingStrategy {
    @Override
    public void eating() {
        System.out.println("我现在用叉子吃饭！");
    }
}
