package StructureTypePattern.AdapterPattern;

/**
 * 适配器模式，当用户需要使用某个组件的功能（例如某种插座），但是用户自己无法直接使用该组件（插座接头不匹配），
 * 这时候就需要适配器（例如转接头）来对插座进行一些包装和改造让客户正常使用，
 * 不同的插座需要匹配不同的适配器
 * 该模式也是用于加强代码的扩展性和可维护性，在不修改代码的情况下就能匹配不同的组件
 * spring利用适配器模式，在AOP过程中来为不同的Advice匹配不同的Adapter供程序来生成对应的Interceptor对象
 */
public class AdapterPatternDemo {

    public static void main(String[] args){
        BritishOutlet outlet = new BritishOutlet();
        Adapter adapter = new BritishOutletAdapter(outlet);
        adapter.powerSupplyConvert();
    }
}

