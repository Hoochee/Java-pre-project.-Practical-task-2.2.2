package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    private final List<Car> cars;

    {
        cars = new ArrayList<>();
        cars.add(new Car("Leaf", "Japan", 2002));
        cars.add(new Car("Mazda 6", "Japan", 2006));
        cars.add(new Car("Vesta", "Russia", 2018));
        cars.add(new Car("Explorer", "USA", 2020));
        cars.add(new Car("Raptor", "USA", 2019));
    }

    @Override
    public List<Car> index(int count) {
        if (count == 0 || count >= 5) {
            return cars;
        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
