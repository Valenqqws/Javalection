package Homework19;

public class main {

    public class Main {
        public static void main(String[] args) {

            Car car = new Car("Toyota", 2020, 18);


            car.showInfo();


            car.engineStart();

            car.engineStop();


            System.out.println("Размер колеса: " + car.getWheelSize());
        }
    }
}
