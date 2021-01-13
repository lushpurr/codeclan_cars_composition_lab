import car.PetrolCar;
import components.Engine;
import components.SteeringWheel;
import components.Tyres;
import customer.Customer;
import dealership.Dealership;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DealerShipTest {

    Dealership dealership;
    PetrolCar petrolCar;
    Engine engine;
    SteeringWheel steeringWheel;
    Tyres tyres;

    @Before
    public void setUp() {

        dealership = new Dealership("Bobs Cars", 2000);
        petrolCar = new PetrolCar(1000, "Red", 12, engine, steeringWheel, tyres);
    }

    @Test
    public void canBuyCar(){
        dealership.canBuy(petrolCar);
        assertEquals(1, dealership.getStockOfCars().size());
    }

    @Test
    public void canSellCar(){
        dealership.canBuy(petrolCar);
        dealership.canSell(petrolCar);
        assertEquals(0, dealership.getStockOfCars().size());
    }

    @Test
    public void canSellCarToCustomer(){
        Customer customer = new Customer("Bob", 2000);
        dealership.canBuy(petrolCar);
        dealership.canSell(petrolCar);
        customer.canBuy(petrolCar);
        assertEquals(0, dealership.getStockOfCars().size());
        assertEquals(1, customer.getCollectionOfCars().size());
    }



}

