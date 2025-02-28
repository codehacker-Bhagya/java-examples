package functionalinterface;

public class InterestCalculattorImple implements InterestCalculattor {

    @Override
    public double calculate(int principalAmount, double interestRate, int year) {
        double calculatedValue = principalAmount* (interestRate/100) * year;
        System.out.println("Return Amount" + calculatedValue);
        return calculatedValue;

    }
}
