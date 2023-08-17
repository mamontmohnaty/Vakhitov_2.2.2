package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>(List.of(
            new Car(1, "Audi", "Red"),
            new Car(2, "BMW", "Green"),
            new Car(3, "MB", "Blue"),
            new Car(4, "Lada", "White"),
            new Car(5, "GAZ", "Brown")));

    @Override
    public List<Car> listCars(Integer i) {
        return cars.subList(0, i);
    }
}
