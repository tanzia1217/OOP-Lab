import java.util.Scanner;
class Student {
    String firstName;
    String lastName;
    int age;

    void insertion(String first, String last, int a) {
        firstName = first;
        lastName = last;
        age = a;

    }

    void display() {
        System.out.println("Details : ");
        System.out.println("First Name : "+firstName);
        System.out.println("Last Name : "+lastName);
        System.out.println("Age : "+age);
    }
}

public class Lab02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Name : ");
        String firstName = scanner.nextLine();

        System.out.print("Enter Last Name : ");
        String lastName = scanner.nextLine();
        System.out.print("Enter Age : ");
        int age = scanner.nextInt();

        Student student = new Student();

        student.firstName = firstName;
        student.lastName = lastName;
        student.age = age;
        scanner.nextLine();

        System.out.println("Details : ");
        System.out.println("First Name : "+student.firstName);
        System.out.println("Last Name : "+student.lastName);
        System.out.println("Age : "+student.age);

        System.out.print("Enter First Name : ");
        String firstName2 = scanner.nextLine();

        System.out.print("Enter Last Name : ");
        String lastName2 = scanner.nextLine();
        System.out.print("Enter Age : ");
        int age2 = scanner.nextInt();

        Student student2 = new Student();

        student2.firstName = firstName2;
        student2.lastName = lastName2;
        student2.age = age2;
        scanner.nextLine();


        //student.insertion(firstName,lastName,age);
        student.insertion(firstName2,lastName2,age2);
        //student.display();
        student2.display();

    }
}