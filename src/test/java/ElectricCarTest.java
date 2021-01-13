import car.ElectricCar;
import components.SteeringWheel;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ElectricCarTest {
    ElectricCar electricCar;
    Engine engine;
    SteeringWheel steeringWheel;
    Tyres tyres;

    @Before
    public void setUp() {
        electricCar = new ElectricCar(3000, "Pink", 2, engine, steeringWheel, tyres);
    }

    @Test
    public void hasAge() {
    assertEquals(2, electricCar.getAge());
    }

}
