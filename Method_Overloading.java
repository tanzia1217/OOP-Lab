public class Method_Overloading {

    int sum(int x,int y)
    {
        return x+y;
    }
    double sum(double x,double y)
    {
        return x+y;
    }
    String sum(String x,String y)
    {
        return x+y;
    }
    //for 3 parameters
    int sum(int x,int y,int z)
    {
        return x+y+z;
    }
    double sum(double x,double y,double z)
    {
        return x+y+z;
    }
    String sum(String x,String y,String z)
    {
        return x+y+z;
    }

    public static void main(String[]args){
        Method_Overloading lab=new Method_Overloading();
        int num=lab.sum(10,5);
        double num2=lab.sum(4.5,6.25);
        String num3=lab.sum("Sinthia ","Rouf");

        int num4=lab.sum(8,5,7);
        double num5=lab.sum(2.5,4.5,7.5);
        String num6=lab.sum("Tanzia ","Binte ","Rouf");

        System.out.println();
        System.out.println("int: " + num);
        System.out.println("double : " + num2);
        System.out.println("String : " + num3);

        System.out.println();
        System.out.println("its 3 int: " + num4);
        System.out.println("its 3 double : " + num5);
        System.out.println("its 3 String : " + num6);
    }
}