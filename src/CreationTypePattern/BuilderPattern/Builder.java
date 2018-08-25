package CreationTypePattern.BuilderPattern;

//抽象建造器类
public interface Builder{
    void buildBrandAndConfig(String brand, String config);
    void buildScaleAndPower(int scale, String power);
    AbstractTranpost getTransport();
}
