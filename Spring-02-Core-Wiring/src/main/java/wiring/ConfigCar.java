package wiring;

import org.springframework.context.annotation.Bean;

public class ConfigCar {
    @Bean
    public Car car(){
        Car car = new Car();
        car.setMake("Honda");
       return car;
    }
    @Bean
    public Person person(){
      Person p = new Person();
      p.setName("mike");
      p.setCar(car());
      return p;
    }
}
