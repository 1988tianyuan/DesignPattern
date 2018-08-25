package StructureTypePattern.AdapterPattern;

//英制插头
public class BritishOutlet implements Outlet{
    @Override
    public void powerSupply() {
        System.out.println("现在是英制插座为你供电...");
    }
}
