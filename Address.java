class Address {
    String city,state,country;

    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }

}


class Bank{
    String name;
    Emp emp;

    public Bank (String name, Emp emp) {
        this.name = name;
        this.emp = emp;
    }
    void display()
    {
        System.out.println("Bank's name: "+name +"   "+ "Employee's Name: "+emp.name);
        emp.displayAddress();

    }
}


class Emp extends Person{
    int id;
    String name;
    Address address;

    public Emp(int id, String name,Address address) {
        this.id = id;
        this.name = name;
        this.address=address;
    }
    void displayAddress()
    {
        System.out.println(address.city+" "+address.state+" "+address.country);
    }

    void display(){
        System.out.println(id+" "+name);
        System.out.println(address.city+" "+address.state+" "+address.country);
    }


    public static void main(String[] args) {
        Address address1=new Address("Mirpur","Dhaka","Bangladesh");
        Address address2=new Address("Karatia","Tangail","Bangladesh");

        Emp emp=new Emp(217,"Tanzia",address1);
        Emp emp2=new Emp(333,"Hridy",address2);

        emp.display();
        emp2.display();

        Bank bank = new Bank("IFIC Bank", emp);
        bank.display();
    }
}