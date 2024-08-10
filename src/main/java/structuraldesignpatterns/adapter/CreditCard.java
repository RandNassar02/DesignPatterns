package structuraldesignpatterns.adapter;

//Target Interface: This is the desired interface class which will be used by the clients.
public interface CreditCard {
    public void giveBankDetails();

    public String getCreditCard();
}
