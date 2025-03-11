public class AddressInfo {
    String street,city,state,postalCode;

    public AddressInfo(String street,String city,String state,String postalCode)
    {
        this.street=street;
        this.city=city;
        this.state=state;
        this.postalCode=postalCode;
    }

}

class InsuranceInfo{
    String policyName;
    int policyId;
    public InsuranceInfo(String policyName, int policyId)
    {
        this.policyId=policyId;
        this.policyName=policyName;
    }

}

class EMployee{
    String name;
    AddressInfo addressInfo;
    InsuranceInfo insuranceInfo;

    public EMployee(String name, AddressInfo addressInfo, InsuranceInfo insuranceInfo)
    {
        this.name=name;
        this.addressInfo=addressInfo;
        this.insuranceInfo=insuranceInfo;

    }
    void display()
    {
        System.out.println("Employee's Name: "+this.name);
        System.out.println("Employee's Address: "+
                addressInfo.street+", "+addressInfo.city+", "+
                addressInfo.state+", "+addressInfo.postalCode);
        System.out.println("Insurance information: "+
                insuranceInfo.policyName+", "+insuranceInfo.policyId);
    }
}

class Main2{
    public static void main(String[] args) {
        AddressInfo addressInfo=new AddressInfo("Monipur","Mirpur","Dhaka","1216");
        InsuranceInfo insuranceInfo =new InsuranceInfo("Life Insurance", 333);
        EMployee eMployee=new EMployee("Mr. Rahim",addressInfo,insuranceInfo);
        eMployee.display();

    }
}