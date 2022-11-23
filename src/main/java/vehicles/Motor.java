package vehicles;

public class Motor implements IMotorised{

    private int startEngine;
    private int hp;
    private int fuel;
    private int stopEngine;

    public Motor (int hp, int startEngine, int fuel,int stopEngine){
        this.hp = hp;
        this.startEngine = startEngine;
        this.fuel = fuel;
        this.stopEngine = stopEngine;



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
        return this.hp;
    }

    @Override
    public void setHp(int hp) {
        this.hp = hp;
    }

    @Override
    public int getFuel() {
        return this.fuel;
    }

    @Override
    public void setFuel(int fuel) {
        this.fuel = fuel;
    }
}
