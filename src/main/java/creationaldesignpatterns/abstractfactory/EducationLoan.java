package creationaldesignpatterns.abstractfactory;

public class EducationLoan extends Loan{
    @Override
    void getInterestRate(double r) {
        rate=r;
    }
}
