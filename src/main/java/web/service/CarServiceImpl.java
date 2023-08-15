package web.service;

import web.model.Car;
import web.dao.CarDaoImpl;

import java.util.List;

public class CarServiceImpl implements CarService {
    private final CarDaoImpl carDao = new CarDaoImpl();

    public List<Car> listCars(Integer i) {

        return carDao.listCars(i);

    }
}
