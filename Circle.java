import java.util.*;
public class Circle {

    double r;

    void area() {
        System.out.println("Area of Circle: "+3.1416*r*r);
    }

    void circumference() {

        System.out.println("Circumference: " +3.1416*2*r);
    }

    public static void main(String [] args) {

        Circle obj = new Circle();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Radius : ");
        double r = scanner.nextDouble();

        obj.r = r;

        obj.area();
        obj.circumference();

    }
}
