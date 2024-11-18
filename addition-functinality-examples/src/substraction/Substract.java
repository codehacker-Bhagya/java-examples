package substraction;

public class Substract {

    public void Minus(){
        //type 1 - int
        int a = 84;
        int b = 36;

        int substract = a-b;

        System.out.println("Ans:"+substract);

        //type 2 - float (smaill partial no)

        float c = 8.10f;
        float d = 4.23f;

        float minus = c-d;

        System.out.println("Remain:"+ minus);


        // type 3 - double (long partial no)

        double e = 15.2554212891145d;
        double f = 52.6842551212555d;

        double sub = e-f;
        System.out.println("min:"+ sub);

        // type 4 - short (small no)

        short g = (short) 5682;
        short h = (short) 2564;

        short ans = (short) (g-h);
        System.out.println("Answer:"+ ans);

        // type 5 - long (big no)

        long i = 528496356l;
        long j = 584618942l;

        long subst = i-j;
        System.out.println("gives:"+ subst);
    }


    public static void main(String[]args){
        Substract remain = new Substract();
        remain.Minus();



    }
}
