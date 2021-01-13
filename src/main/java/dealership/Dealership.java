package dealership;

import behaviours.ITransaction;
import car.Car;

import java.util.ArrayList;

public class Dealership implements ITransaction {
    private String name;
    private double till;
    private ArrayList<Car> stockOfCars;


        public Dealership(String name, double till){
            this.name = name;
            this.till = till;
            this.stockOfCars = new ArrayList<Car>();
        }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getTill() {
        return till;
    }

    public void setTill(double till) {
        this.till = till;
    }

    public ArrayList<Car> getStockOfCars() {
        return stockOfCars;
    }

    public void setStockOfCars(ArrayList<Car> stockOfCars) {
        this.stockOfCars = stockOfCars;
    }

    public void canBuy(Car car) {
        this.stockOfCars.add(car);
    }

    public void canSell(Car car) {
        this.stockOfCars.remove(car);
    }
}
