package week2.car;

public class HyundaiFactory {
    private static HyundaiFactory instance;

    private HyundaiFactory() {}

    public static HyundaiFactory getFactory() {
        if (instance == null) {
            instance = new HyundaiFactory();
        }
        return instance;
    }

    public Car createCar() {
        return new Car();
    }
}