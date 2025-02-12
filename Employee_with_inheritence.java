public class Employee_with_inheritence {
    public int id=14;
    public String name= "Hridy";
    public String joining_date="12.02.25";


    public void display()
    {
        System.out.println(id);
        System.out.println(name);
        System.out.println(joining_date);
    }


}
   class software_engineer extends Employee_with_inheritence{

    double salary= 40000;

       public void display()
       {
           System.out.println("Name: "+name+" "+ salary);
       }
   }
class HR extends Employee_with_inheritence{

    double salary= 30000;

    public void display()
    {
        System.out.println("Name: "+name+" " + salary);
    }

}

