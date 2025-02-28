package lambdaExpression.Practtice1;

public class InterestCalculattorImpl implements InterestCalculattor {


    @Override
    public double calculate(int principalAmount, double interestRate, int years) {
        double calculatedValue = principalAmount* (interestRate/100) * years;
        System.out.println("Return Amount" + calculatedValue);
        return calculatedValue;

    }
}
