public interface Bank_Interface {
    double account();
}
class SIBL implements Bank_Interface{
    @Override
    public double account() {
        System.out.println("Account System in SIBL");
        return 0;
    }
}
class DBBL implements Bank_Interface{
    @Override
    public double account() {
        System.out.println("Account System in DBBL");
        return 0;
    }
}
class TestInterface{
    public static void main(String[] args) {
        SIBL sibl=new SIBL();
        DBBL dbbl=new DBBL();
        sibl.account();
        dbbl.account();
    }
}
