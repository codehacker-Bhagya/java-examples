package addition;

public class Addition {

    public void add() {
        int a = 10;
        int b = 10;

        int sum = a+b;

        System.out.println("sum:" + sum);




        //type 2 - float (small partial no)

        float c = 25f;
        float d = 20f;

        float add = c+d;

        System.out.println("Ans:" + add);

       // public static void main(String[] args) {
        //    Addition nos = new Addition();
           // nos.add();
      //  }


        //type 3 - double (big partial no)

        double e = 1.52687252554d;
       double f = 4.89632598445d;

        double plus = e+f;

       System.out.println("Equal:" + plus);

        //type 4 - short

        short s = (short) 2541;
        short r = (short) 6253;

        short summation =(short) (s+r);

        System.out.println("add:"+ summation);


        // type 5 - long

        //long l = 2644565645l;
        // long g = 5855454598l

    }
    public static void main(String[] args){
        Addition nos = new Addition();
        nos.add();


        }
}
