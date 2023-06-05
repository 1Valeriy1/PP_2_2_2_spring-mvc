package web.service;

import web.models.Car;

import java.util.List;

public class CarService {

    public static List<Car> CarsCount(List<Car> car, int count) {
        return car.subList(0, count>5? 5: count);
    }
}
