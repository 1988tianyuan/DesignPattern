package CreationTypePattern.BuilderPattern;

public class CarBuilder implements Builder{
    Car car = new Car();

    @Override
    public void buildBrandAndConfig(String brand, String config) {
        car.setBrand(brand);
        car.setConfiguration(config);
    }

    @Override
    public void buildScaleAndPower(int scale, String power) {
        car.setScale(scale);
        car.setPowerType(power);
    }

    @Override
    public AbstractTranpost getTransport() {
        return car;
    }
}
