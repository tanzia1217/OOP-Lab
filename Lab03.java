import java.util.*;
        public class Lab03 {

                int x;
                Lab03()
                {
                        x=4;
                }
                public Lab03(int y)
                {
                        x=y;
                }

                public static void Lab03(String[] args) {


                        Lab03 object = new Lab03();
                        Lab03 object2 = new Lab03(15);
                        // Create an object of class Main (This will call the constructor)
                        System.out.println(object.x);
                        System.out.println(object2.x); // Print the value of x
                }



}
