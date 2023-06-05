package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.models.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String cars(@RequestParam(value = "count", defaultValue = "5")int count, Model model){
        List<Car> cars = new ArrayList<>();
        cars.add(new Car("Oka", "black", 1));
        cars.add(new Car("UAZ", "white", 2));
        cars.add(new Car("LADA", "black", 3));
        cars.add(new Car("Aurus", "white", 4));
        cars.add(new Car("KAMAZ", "black", 5));
        cars = CarService.CarsCount(cars, count);
        model.addAttribute("cars", cars);
        return "cars";
    }
}

