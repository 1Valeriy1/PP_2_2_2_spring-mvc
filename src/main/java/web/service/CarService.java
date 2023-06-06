package web.service;

import web.models.Car;

import java.util.List;

public interface CarService {
    List<Car> CarsCount(int count);

    void addCar(Car car);
}
