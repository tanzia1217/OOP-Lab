public class Engine {

    public double capacity;
    public Engine(double capacity)
    {
        this.capacity=capacity;
    }
}

class DashBoard {
    public double size;

    public DashBoard(double size) {
        this.size = size;
    }
}

class Car1 {
    public String model;
    public String company;


    public void drive() {
        System.out.println("Driving");
    }

    public void stop() {
        System.out.println("Stopping");
    }
}

   class VOlvo extends Car1 {
        double price;
        String productionYear;
        String registrationNumber;
        Engine eng;
        DashBoard db;

        public VOlvo(double price, String productionYear, String registrationNumber, Engine eng, DashBoard db) {
            this.price = price;
            this.productionYear = productionYear;
            this.registrationNumber = registrationNumber;
            this.eng = eng;
            this.db = db;
        }

        public void changeFuel() {
            System.out.println("Changing Fuel");
        }


        public void checkBattery() {
            System.out.println("Checking battery");
        }
    }


   class Main7 {
        public static void main(String[] args) {
            Engine eng = new Engine(34.7);
            DashBoard db = new DashBoard(5.0);
            VOlvo v = new VOlvo(700, "2022", "DHA34567", eng, db);
            v.drive();
            v.stop();
            v.changeFuel();
            v.checkBattery();
            v.model = "SUV. XC40";
            v.company = "Volvo";

        }

    }

