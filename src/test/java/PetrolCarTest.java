import car.PetrolCar;
import components.SteeringWheel;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PetrolCarTest {
    PetrolCar petrolCar;
    Engine engine;
    SteeringWheel steeringWheel;
    Tyres tyres;

    @Before
    public void setUp() {
        petrolCar = new PetrolCar(1000, "Red", 12, engine, steeringWheel, tyres);
    }

    @Test
    public void hasPrice() {
        assertEquals(1000, petrolCar.getPrice(), 0.01);
    }

    @Test
    public void hasEngine() {
        assertEquals(engine, petrolCar.getEngine());
    }

}
