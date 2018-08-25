package CreationTypePattern.FactoryPattern;

/**
 * 工厂方法模式
 * 优点：提高了扩展性，对于添加新产品更方便，无需修改具体工厂代码，直接实现工厂接口就能获得生产具体产品的具体工厂
 * 缺点：当产品种类非常多时，会出现大量的与之对应的工厂对象，提高了系统负责性，例如产品树很复杂（同一款车高配涡轮增压、低配自然吸气等等）
 * 对于这种情况可以用简单工厂模式结合工厂方法模式的方式来实现，例如对于同一款车下的不同配置产品使用简单工厂模式来生成产品
 */
public class FactoryMethodPatternDemo {
    public static void main(String[] args) throws Exception{
        Factory bwmCarFactory = new BwmCarFactory();
        Car bwmCar = bwmCarFactory.productCar();
        bwmCar.dirve();
    }
}

//工厂接口，为了满足能够生产不同产品的扩展性
interface Factory{
    Car productCar();
}

//工厂具体实现A
class BenzCarFactory implements Factory{
    public Car productCar(){
        return new BenzCar();
    }
}

//工厂具体实现B
class BwmCarFactory implements Factory{
    public Car productCar(){
        return new BwmCar();
    }
}