package vehicles.water;

import products.IProduct;
import vehicles.IMotorised;
import vehicles.Motor;
import vehicles.Vehicle;

public final class Speedboat extends Vehicle implements IWaterVehicle, IMotorised {

    private String hullType;
    private IMotorised motor;

    public Speedboat(String hullType, IMotorised motor, float weight, int maxSpeed, IProduct baseProduct){
        super(weight, maxSpeed, baseProduct);
        this.hullType = hullType;
        this.motor = motor;
    }


    @Override
    public String getHullType() {
        return hullType;
    }

    @Override
    public void setHullType(String hullType) {
        this.hullType = hullType;
    }

    @Override
    public void startEngine() {
        System.out.printf("Vroom");
    }

    @Override
    public void stopEngine() {
        System.out.printf("...");
    }

    @Override
    public int getHp() {
        return this.motor.getHp();
    }

    @Override
    public void setHp(int hp) {
        this.motor.setHp(hp);
    }

    @Override
    public int getFuel() {
        return this.motor.getFuel();
    }

    @Override
    public void setFuel(int fuel) {
        this.motor.setFuel(fuel);
    }
}
