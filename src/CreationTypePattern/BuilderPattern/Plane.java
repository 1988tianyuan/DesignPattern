package CreationTypePattern.BuilderPattern;

//实现类-飞机，建造器用来建造的产品
public class Plane extends AbstractTranpost{

    @Override
    public void transport() {
        System.out.println(String.format("我是%s牌飞机, 我的型号是%s, 我的大小是%d m, 我的动力类型是%s", brand, configuration, scale, powerType));
    }

}
