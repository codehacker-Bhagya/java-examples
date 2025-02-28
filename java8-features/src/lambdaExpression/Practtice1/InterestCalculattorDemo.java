package lambdaExpression.Practtice1;

public class InterestCalculattorDemo {
    public static void main(String[] args) {
        InterestCalculattor interestCalculattor = (principalAmount, interestRate, years) ->
                principalAmount * (interestRate/100) * years;

        double calculatedValue = interestCalculattor.calculate(50000, 2.8, 4);
        System.out.println("Total Calculated Interest Value" + calculatedValue);
    }
}
