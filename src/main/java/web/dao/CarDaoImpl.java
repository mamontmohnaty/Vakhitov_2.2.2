package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {
    private final List<Car> cars = new ArrayList<>();
    @Override
    public List<Car> listCars(Integer i) {


        Car car1 = new Car(1, "Audi", "Red");
        Car car2 = new Car(2, "BMW", "Green");
        Car car3 = new Car(3, "MB", "Blue");
        Car car4 = new Car(4, "Lada", "White");
        Car car5 = new Car(5, "GAZ", "Brown");

        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);
        cars.add(car5);

        return cars.subList(0, i);

    }
}
