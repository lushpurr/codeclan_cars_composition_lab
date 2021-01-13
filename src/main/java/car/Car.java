package car;

import components.Engine;
import components.SteeringWheel;
import components.Tyres;

public abstract class Car {
    private double price;
    private String colour;
    private int age;
    private Engine engine;
    private SteeringWheel steeringWheel;
    private Tyres tyres;

    public Car(double price, String colour, int age, Engine engine, SteeringWheel steeringWheel, Tyres tyres) {
        this.price = price;
        this.colour = colour;
        this.age = age;
        this.engine = engine;
        this.steeringWheel = steeringWheel;
        this.tyres = tyres;
    }


    public double getPrice() {
        return price;
    }

    public String getColour() {
        return colour;
    }

    public int getAge() {
        return age;
    }

    public Engine getEngine() {
        return engine;
    }

    public SteeringWheel getSteeringWheel() {
        return steeringWheel;
    }

    public Tyres getTyres() {
        return tyres;
    }
}
