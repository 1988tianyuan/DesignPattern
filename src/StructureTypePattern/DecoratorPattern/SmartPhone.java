package StructureTypePattern.DecoratorPattern;

public class SmartPhone implements Mobile{
    private Mobile mobile;

    public SmartPhone(Mobile mobile){
        this.mobile = mobile;
    }

    @Override
    public void makePhoneCall() {
        mobile.makePhoneCall();
        System.out.println("，并且还能听歌看视频");
    }
}
