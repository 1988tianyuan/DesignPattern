package CreationTypePattern.BuilderPattern;

//实现类-汽车，建造器用来建造的产品
public class Car extends AbstractTranpost{

    @Override
    public void transport() {
        System.out.println(String.format("我是%s牌汽车, 我的配置是%s, 我的轴距有%d mm, 我的动力类型是%s", brand, configuration, scale, powerType));
    }

}