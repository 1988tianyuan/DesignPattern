package StructureTypePattern.DecoratorPattern;

/**
 * 装饰器模式，是一种用于代替继承的技术，无需通过继承增加子类就能扩展对象的新功能
 */
public class DecoratorPatternDemo {

    public static void main(String[] args){
        Mobile mobile = new GeneralMobile();
        mobile.makePhoneCall();
        System.out.println("");
        Mobile newMobile = new SmartPhone(mobile);
        newMobile.makePhoneCall();
    }
}
