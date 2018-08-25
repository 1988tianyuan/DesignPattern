package CreationTypePattern.FactoryPattern;

/**
 * 工厂模式是一种创建型设计模式，这里说的工厂模式是简单工厂模式
 * 优点：创建一个对象，只要知道其名称就可以了；屏蔽产品的具体实现，调用者只关心产品的接口，降低耦合
 * 缺点：每次想加入新产品都要修改工厂类，不符合开闭原则
 */
public class SimpleFactoryPatternDemo {
    public static void main(String[] args) throws Exception{
        Car myCar = CarFactory.productCar("Bwm");
        myCar.dirve();
    }
}

//产品接口，需要生产的产品的抽象
interface Car{
    void dirve();
}

//产品实现A
class BenzCar implements Car{
    @Override
    public void dirve() {
        System.out.println("开的奔驰车！");
    }
}

//产品实现B
class BwmCar implements Car{
    @Override
    public void dirve() {
        System.out.println("开的宝马车！");
    }
}

//静态工厂方法，根据客户输入的产品名字生产产品
class CarFactory{
    public static Car productCar(String carName) throws Exception{
        switch (carName){
            case "Benz":
                return new BenzCar();
            case "Bwm":
                return new BwmCar();
            default:
                throw new Exception("并不能生产你要的车！");
        }
    }
}