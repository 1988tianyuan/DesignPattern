package StructureTypePattern.DecoratorPattern;

public class GeneralMobile implements Mobile{
    @Override
    public void makePhoneCall() {
        System.out.println("打电话和发短信");
    }
}
