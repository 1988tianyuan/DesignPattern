package CreationTypePattern.BuilderPattern;

/**
 * 建造者模式，将一个产品的内部表象（internal representation）与产品的生产过程分割开来
 * 产品零件的建造过程很复杂，这些零件的建造过程被“外部化”到另一个称做建造者的对象里
 * 建造者对象返还给客户端的是一个全部零件都建造完毕的产品对象
 * 这个模式适用于需要经常变换需求构建不同的组件的情况，这些组件的内部构成非常负杂，按照常规方式进行装配和构建会造成代码复杂化，难以维护
 * 使用建造者模式后，有利于该场景的代码复用、扩展和维护，用起来也更方便、可读性更强
 */
public class BuilderPatternDemo {
    public static void main(String[] args){
        Builder transportorBuilder = new CarBuilder();
        transportorBuilder.buildBrandAndConfig("奔驰", "豪华版");
        transportorBuilder.buildScaleAndPower(2900, "2.0T");
        AbstractTranpost car = transportorBuilder.getTransport();
        car.transport();

        transportorBuilder = new PlaneBuilder();
        transportorBuilder.buildScaleAndPower(60, "600");
        transportorBuilder.buildBrandAndConfig("波音", "747");
        AbstractTranpost plane = transportorBuilder.getTransport();
        plane.transport();
    }
}
