public class Engine2 {

    private String type;

    Engine2(String type) {
        this.type = type;
    }

    void start() {
        System.out.println(type + " Engine is starting...");
    }
}

class Car2 {
    private Engine2 engine2;
    Car2(String engineType) {
        this.engine2 = new Engine2(engineType);
    }

    void startCar() {
        engine2.start();
        System.out.println("Car is ready to drive!");
    }
}
class Driver {
    String name;

    Driver(String name) {
        this.name = name;
    }
}

class Bus {
    private Driver driver;

    Bus(Driver driver) {
        this.driver = driver;
    }

    void showDriver() {
        System.out.println("Bus driver is " + driver.name);
    }
}

    class Main3 {
    public static void main(String[] args) {
        // Composition: Car has an engine, and engine's lifecycle is tied to the car
        Car2 myCar = new Car2("V8");
        myCar.startCar();

        System.out.println();

        // Aggregation: Bus has a driver, but a driver can exist independently
        Driver driver = new Driver("John");
        Bus myBus = new Bus(driver);
        myBus.showDriver();
    }
}




