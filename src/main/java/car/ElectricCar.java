package car;

import components.Engine;
import components.SteeringWheel;
import components.Tyres;

public class ElectricCar extends Car{
    public ElectricCar(double price, String colour, int age, Engine engine, SteeringWheel steeringWheel, Tyres tyres) {
        super(price, colour, age, engine, steeringWheel, tyres);
    }
}
