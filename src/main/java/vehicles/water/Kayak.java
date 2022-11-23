package vehicles.water;

import products.IProduct;
import vehicles.Vehicle;

public final class Kayak extends Vehicle implements IWaterVehicle{

    private String hullType;


    public Kayak(String hullType, float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
    }

    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }
}
