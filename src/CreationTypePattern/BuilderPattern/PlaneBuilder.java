package CreationTypePattern.BuilderPattern;

public class PlaneBuilder implements Builder{
    Plane plane = new Plane();

    @Override
    public void buildBrandAndConfig(String brand, String config) {
        plane.setBrand(brand);
        plane.setConfiguration(config);
    }

    @Override
    public void buildScaleAndPower(int scale, String power) {
        plane.setScale(scale);
        plane.setPowerType(power);
    }

    @Override
    public AbstractTranpost getTransport() {
        return plane;
    }
}
