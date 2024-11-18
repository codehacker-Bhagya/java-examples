package multiplication;

public class Multiply {

    public void multiplication(){
        //type 1 - int
        int a = 8;
        int b = 2;
        int mult = a*b;
        System.out.println("Gives:"+ mult);

        //type 2 - float (short partial value0

        float c = 9.12f;
        float d = 5.32f;
        float times = c*d;
        System.out.println("Ans:"+ times);
        // type 3 - double (big partial value)

        double e = 85.562155d;
        double f = 25.215455d;
        double grow = e*f;
        System.out.println("Equal:"+ grow);

        //type 4 - short (small value)

        short g = 2541;
        short h = 1542;
        short increase = (short) (g*h);
        System.out.println("multiply:" + increase);
        //type 5 - long (big value)

        long i = 25486145l;
        long j = 25568874l;
        long up = i*j;
        System.out.println("Expand:"+ up);

    }

    public static void main(String[] args){
        Multiply values = new Multiply();
        values.multiplication();

    }

}
