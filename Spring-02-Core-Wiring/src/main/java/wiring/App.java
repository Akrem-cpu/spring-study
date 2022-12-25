package wiring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);
        Car c = container.getBean(Car.class);
        Person p = container.getBean(Person.class);

        System.out.println("person's name : " + p.getName());
        System.out.println("car's make : " + c.getMake());
        System.out.println("person's car : " + p.getCar());
    }
}
