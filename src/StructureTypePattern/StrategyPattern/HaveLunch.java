package StructureTypePattern.StrategyPattern;

//吃饭这个行为，需要不同的吃法（策略）来执行
public class HaveLunch {
    private EatingStrategy strategy;
    public EatingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(EatingStrategy strategy) {
        this.strategy = strategy;
    }

    public HaveLunch(EatingStrategy strategy){
        this.strategy = strategy;
    }
    public void haveLunch(){
        strategy.eating();
    }

}
