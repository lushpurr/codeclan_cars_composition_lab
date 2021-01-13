import car.Car;
import car.PetrolCar;
import components.Engine;
import components.SteeringWheel;
import components.Tyres;
import customer.Customer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {

    Customer customer;
    PetrolCar petrolCar;
    Engine engine;
    SteeringWheel steeringWheel;
    Tyres tyres;


    @Before
    public void setUp() {

        customer = new Customer("Bob", 2000);
        petrolCar = new PetrolCar(1000, "Red", 12, engine, steeringWheel, tyres);
    }

    @Test
    public void canBuyCar(){
        customer.canBuy(petrolCar);
        assertEquals(1, customer.getCollectionOfCars().size());
    }

    @Test
    public void canSellCar(){
        customer.canBuy(petrolCar);
        customer.canSell(petrolCar);
        assertEquals(0, customer.getCollectionOfCars().size());
    }


}
