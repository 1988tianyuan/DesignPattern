package StructureTypePattern.AdapterPattern;

public class EuropeOutlet implements Outlet{
    @Override
    public void powerSupply() {
        System.out.println("现在是欧制插座为你供电...");
    }
}
