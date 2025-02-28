package lambdaExpression.Practice3;

public class GreetingsExample {
    public static void main(String[] args) {

        Greetings greetings= ()-> System.out.println("GoodMorning Pune");
        greetings.sayHello();

        GreetingsWithParam greetingsWithParam = (name) -> System.out.println("Hello" + name + "!");
        greetingsWithParam.sayHello("pune");
    }
}

interface Greetings {
    void sayHello();
}

interface GreetingsWithParam{
    void sayHello(String name);
}