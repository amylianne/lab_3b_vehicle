package vehicles;

public class Motor implements IMotorised{

    private int startEngine;
    private int hp;

    public Motor(int hp){
        this.hp = hp;


    }

    @Override
    public void startEngine() {

    }

    @Override
    public void stopEngine() {

    }

    @Override
    public int getHp() {
        return 0;
    }

    @Override
    public void setHp(int hp) {

    }

    @Override
    public int getFuel() {
        return 0;
    }

    @Override
    public void setFuel(int fuel) {

    }
}
