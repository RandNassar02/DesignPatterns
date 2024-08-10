package structuraldesignpatterns.adapter;

//Client: This class will interact with the Adapter class.
public class AdapterPatternDemo {
    public static void main(String[] args) {
        CreditCard targetInterface = new BankCustomer();
        targetInterface.giveBankDetails();
        System.out.print(targetInterface.getCreditCard());

    }
}
