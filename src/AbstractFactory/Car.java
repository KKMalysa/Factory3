package AbstractFactory;

public abstract class Car {

    private int yearOfProdukction;
    private double engineCapacity;
    private String fuelType;
    private final SteeringWheelPosition position;


    public Car(int yearOfProdukction, double engineCapacity, String fuelType, SteeringWheelPosition position) {
        this.yearOfProdukction = yearOfProdukction;
        this.engineCapacity = engineCapacity;
        this.fuelType = fuelType;
        this.position = position;
    }

    public int getYearOfProdukction() {
        return yearOfProdukction;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public String getFuelType() {
        return fuelType;
    }

    public SteeringWheelPosition getPosition() {
        return position;
    }
}
