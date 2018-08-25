package StructureTypePattern.StrategyPattern;

public class EatingByChopsticks implements EatingStrategy {
    @Override
    public void eating() {
        System.out.println("我用筷子吃饭！");
    }
}
