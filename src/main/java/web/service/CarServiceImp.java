package web.service;

import web.controller.CarController;
import web.models.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class CarServiceImp extends CarController implements CarService  {

    List<Car> cars = Arrays.asList(
            new Car("Oka", "black", 1),
            new Car("UAZ", "white", 2),
            new Car("LADA", "black", 3),
            new Car("Aurus", "white", 4),
            new Car("KAMAZ", "black", 5));

    @Override
    public List<Car> CarsCount(int count) {
        return (count>5||count<0)? cars: cars.subList(0, count);
    }

    @Override
    public void addCar(Car car) {
        cars.add(car);
    }

}
