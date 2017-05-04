package car;


import static car.Car.sort;
import static car.Car.year;

/**
 * Created by koqfl on 04.05.2017.
 */
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("BMW", 1997, 1.3);
        Car car2 = new Car("Mercedes", 2005, 5.0);
        Car car3 = new Car("Lada", 2008, 4.9);
        Car[] cars = {car1, car2, car3};
        for(Car e:year(cars,2005)){
            System.out.println(e.toString());
        }
        sort(cars);
        for (Car e: cars) {
            System.out.println(e.toString());
        }

    }
}
