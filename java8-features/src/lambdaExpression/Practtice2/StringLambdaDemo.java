package lambdaExpression.Practtice2;

public class StringLambdaDemo {

    public static void main(String[] args) {
        //old Fashion
        StringAppender appender = new StringAppenderImple();
        String output = appender.append("good" , "luck");
        System.out.println("Result" + output);

        // using lambda Expression

        StringAppender stringAppender = (S1 , S2) ->
                S1 + S2;

        String outputWithLamda = stringAppender.append("HardWork" , "Success");
        System.out.println("Result using Lambada" + outputWithLamda);

    }
}
