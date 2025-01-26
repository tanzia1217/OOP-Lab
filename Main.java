public class Main {

    /*public static void prime (int p) {
        if (p < 2) {
            System.out.println(p + "is not prime");
        }
        for (int i = 2; i * i <= p; i++) {
            if (p % i == 0) {
                System.out.println(p + "is not prime");
                break;
            } else {
                System.out.println(p + "is prime");
            }
        }
    }
*/

    public static void primeCheck(int p) {

        if (p < 2){
            System.out.println(p + " is not a Prime Number.");
            return;
        }
        boolean isPrime = true;
        for(int i=2 ; i<=Math.sqrt(p); i++) {
            if (p%i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime){
            System.out.println(p+" is a Prime Number.");
        }
        else {
            System.out.println(p + " is not a Prime Number.");
        }
    }
    public static void main(String[] args) {
        int[] a = {5, 7, 8, 11, 17, 40};
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        System.out.println("sum");

        System.out.println("Avg=" + sum / 6);

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0) {
                System.out.println("Even Number=" + a[i]);
                break;
            } else
                System.out.println("Odd Number=" + a[i]);

        }

        int m = 1;
        sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);


        int s = 25;
        for (int i = 1; i <= 10; i++) {
            System.out.println(s * i);
        }


        int x = 7, y = 11, z = 2;
        if (x > y)
            System.out.println("Largest=" + x);
        else if (y > z)
        {System.out.println("Largest=" + y);}
        else
            System.out.println("Largest=" + z);



        primeCheck(33);

        }
    }
