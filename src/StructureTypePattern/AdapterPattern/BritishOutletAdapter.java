package StructureTypePattern.AdapterPattern;

public class BritishOutletAdapter implements Adapter{
    Outlet outlet;

    public BritishOutletAdapter(BritishOutlet outlet){
        this.outlet = outlet;
    }

    @Override
    public void powerSupplyConvert() {
        outlet.powerSupply();
    }
}
