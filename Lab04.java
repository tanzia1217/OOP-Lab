public class Lab04 {
    private int age;

        private String name;


        public String getName() {
            return name;


        }

        public int getAge() {

            return age;

        }



        public void setName(String newName) {
            this.name = newName;

        }
        public void setAge(int newAge)
        {
            this.age= newAge;
    }


    Lab04(String name,int age)
    {
        this.name=name;
        this.age=age;
    }

     Lab04()
    {

    }

    public static void main(String[] args) {
            Lab04 obj1=new Lab04();
            Lab04 obj2=new Lab04("Hridy",21);

            obj1.setName("Hridy");
        obj1.setAge(21);

        System.out.println(obj1.getName());
        System.out.println(obj1.getAge());
        System.out.println("With Constructor: ");
        System.out.println(obj2.name+" "+obj2.age);
    }
}
