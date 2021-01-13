import car.DieselCar;
import components.SteeringWheel;
import components.Engine;
import components.Tyres;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DieselCarTest {
    DieselCar dieselCar;
    Engine engine;
    SteeringWheel steeringWheel;
    Tyres tyres;

    @Before
    public void setUp() {
        dieselCar = new DieselCar(1200, "Blue", 10, engine, steeringWheel, tyres);
    }

}