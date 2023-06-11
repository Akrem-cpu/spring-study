package com.akrem.bootstrap;

import com.akrem.entity.Car;
import com.akrem.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataGenerater implements CommandLineRunner {

    @Autowired
    CarRepository carRepository;

    @Override
    public void run(String... args) throws Exception {
        Car c1 = new Car("BMW","M5");
        Car c2 = new Car("Akrem","v12");
        Car c3 = new Car("Toyota","Corolla");

          carRepository.save(c1);
          carRepository.save(c2);
          carRepository.save(c3);

    }

}
