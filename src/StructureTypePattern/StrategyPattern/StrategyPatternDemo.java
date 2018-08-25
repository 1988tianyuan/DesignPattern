package StructureTypePattern.StrategyPattern;

/**
 * 策略模式，用于提高代码的可扩展性，在不修改使用者代码的情况，需要进行某种功能就传进来哪种策略对象进行使用
 */
public class StrategyPatternDemo {
    public static void main(String[] args){
        EatingStrategy strategy = new EatingByFork();
        HaveLunch haveLunch = new HaveLunch(strategy);
        haveLunch.haveLunch();
    }
}
