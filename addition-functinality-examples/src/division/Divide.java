package division;

public class Divide {

    public void Div() {

        //type 1 - int
        int a = 20;
        int b = 5;
        int Div = a/b ;

        System.out.println("Remain:"+ Div);

        //type 2 - float (short partial value)
        float c = 8.35f;
        float d = 3.52f;
        float div = c/d;

        System.out.println("ans:"+ div);


        //type 3 - double (big partial value)
        double e = 65.25458962d;
        double f = 23.65894445d;

        double Dv = e/f;

        System.out.println("Answer:"+ Dv);

        //type 4 - long (big value)

        long g = 2598745631555l;
        long h = 248651235l;

        long dv = g/h;
        System.out.println("Gives:"+ dv);

        //type 5 - short (small value)

        short i = 8562;
        short j = 2516;

        short Divi = (short) (i/j);
        System.out.println("Equal:"+ Divi);
    }

    public static void main(String[] args){
        Divide value = new Divide();
        value.Div();
    }
}
