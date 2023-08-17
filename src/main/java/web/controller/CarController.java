package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarService;
import web.service.CarServiceImpl;
import web.model.Car;

import java.util.List;

@Controller
public class CarController {

    private CarService carService = new CarServiceImpl();

    @GetMapping(value = "/cars")
    private String listCars(@RequestParam(required = false, defaultValue = "5") Integer count, ModelMap model) {
        List<Car> cars;
        cars = (count > -1 && count <= 5) ? carService.listCars(count) : carService.listCars(5);
        model.addAttribute("cars", cars);
        return "cars";
    }
}
