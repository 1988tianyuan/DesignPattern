package StructureTypePattern.AdapterPattern;

public class EuropeOutletAdapter implements Adapter{
    Outlet outlet;

    public EuropeOutletAdapter(EuropeOutlet outlet){
        this.outlet = outlet;
    }

    @Override
    public void powerSupplyConvert() {
        outlet.powerSupply();
    }
}
