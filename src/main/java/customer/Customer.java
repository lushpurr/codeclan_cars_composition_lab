package customer;

import behaviours.ITransaction;
import car.Car;

import java.util.ArrayList;

public class Customer implements ITransaction {
    private String name;
    private double money;
    private ArrayList<Car> collectionOfCars;

    public Customer(String name, double money) {
        this.name = name;
        this.money = money;
        this.collectionOfCars = new ArrayList<Car>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public ArrayList<Car> getCollectionOfCars() {
        return collectionOfCars;
    }

    public void setCollectionOfCars(ArrayList<Car> collectionOfCars) {
        this.collectionOfCars = collectionOfCars;
    }


    public void canBuy(Car car) {
        this.collectionOfCars.add(car);
    }

    public void canSell(Car car) {
        this.collectionOfCars.remove(car);
    }
}
