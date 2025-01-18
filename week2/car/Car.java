package week2.car;

public class Car {
    private static int number = 1000;
    private int carNumber;

    public Car() {
        carNumber = number++;
    }

    public int showCarNumber(){
        return carNumber;
    }
}