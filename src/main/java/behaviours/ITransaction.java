package behaviours;

import car.Car;

public interface ITransaction {

    void canBuy(Car car);
    void canSell(Car car);

}
