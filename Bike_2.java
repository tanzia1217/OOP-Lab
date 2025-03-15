abstract class Bike_2 {
    abstract void run();
}
class Honda extends Bike_2{
    void run(){System.out.println("Running safely");}
}

class Main_4 {
    public static void main(String args[]) {
        Bike_2 obj = new Honda();
        obj.run();
    }
}