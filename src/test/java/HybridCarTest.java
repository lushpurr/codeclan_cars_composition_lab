import car.Car;
import car.HybridCar;
import car.PetrolCar;
import components.Engine;
import components.SteeringWheel;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HybridCarTest {
    HybridCar hybridCar;
    Engine engine;
    SteeringWheel steeringWheel;
    Tyres tyres;

    @Before
    public void setUp() {
        hybridCar = new HybridCar(6000, "Green", 5, engine, steeringWheel, tyres);
    }

    @Test
    public void hasPrice() {
        assertEquals(6000, hybridCar.getPrice(), 0.01);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, hybridCar.getEngine());
    }

}
