package CreationTypePattern.FactoryPattern;

/**
 * 抽象工厂模式
 * 优点：具有高度可扩展性，能够针对各种产品族生产归类于不同族类的产品（例如可以产生Bwm工厂和Benz工厂，两个工厂分别都可以生产TSI车型和MPI车型）
 * 抽象工厂是简单工厂和工厂方法模式的结合体，比工厂方法优势在于抽象工厂的一个工厂实例可以生产不同族类的产品
 * 缺点：抽象工厂模式修正了工厂方法模式生产产品单一的问题，但也面临了简单工厂模式的缺点即想要扩展工厂种类时需要修改代码
 * 可以通过反射+配置文件的方式，动态生成工厂，提高代码复用性和可扩展性
 */
public class AbstractFactoryPatternDemo {
    public static void main(String[] args){
        AbstractCarFactory factory = FactoryProducer.getFactory("Bwm");
        TSICar tsiBwm = factory.productTSICar();
        tsiBwm.drive();
        factory = FactoryProducer.getFactory("Benz");
        MPICar mpiBenz = factory.productMPICar();
        mpiBenz.drive();
    }
}

//抽象工厂，可以生产不同族类的产品
interface AbstractCarFactory{
    TSICar productTSICar();
    MPICar productMPICar();
}
//族类A
interface TSICar{
    void drive();
}
//族类B
interface MPICar{
    void drive();
}
//Bwm品牌的族类A实例
class TSIBwm implements TSICar{
    @Override
    public void drive() {
        System.out.println("开的涡轮增压宝马！");
    }
}
//Benz品牌的族类A实例
class TSIBenz implements TSICar{
    @Override
    public void drive() {
        System.out.println("开的涡轮增压奔驰！");
    }
}
//Bwm品牌的族类B实例
class MPIBwm implements MPICar{
    @Override
    public void drive() {
        System.out.println("开的自然吸气宝马！");
    }
}
//Benz品牌的族类B实例
class MPIBenz implements MPICar{
    @Override
    public void drive() {
        System.out.println("开的自然吸气奔驰！");
    }
}
//Bwm品牌的工厂实例
class BwmFactory implements AbstractCarFactory{
    @Override
    public TSICar productTSICar() {
        return new TSIBwm();
    }
    @Override
    public MPICar productMPICar() {
        return new MPIBwm();
    }
}
//Benz品牌的工厂实例
class BenzFactory implements AbstractCarFactory{
    @Override
    public TSICar productTSICar() {
        return new TSIBenz();
    }
    @Override
    public MPICar productMPICar() {
        return new MPIBenz();
    }
}
//工厂生成器，根据需要的品牌生成不同的工厂类型，每个工厂都可以生产不同族类的产品
class FactoryProducer{
    public static AbstractCarFactory getFactory(String factoryType){
        switch (factoryType){
            case "Bwm":
                return new BwmFactory();
            case "Benz":
                return new BenzFactory();
            default:
                System.out.println("不存在这个工厂！");
        }
        return null;
    }
}
