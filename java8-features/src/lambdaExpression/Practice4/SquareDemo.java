package lambdaExpression.Practice4;

public class SquareDemo {

    public static void main(String[] args) {
        Square square = (value) -> value * value;
        System.out.println("Square of value 10" + square.calculate(10));
        System.out.println("Square of value 25" + square.calculate(25));
    }
}

interface Square{
    int calculate(int value);
}
