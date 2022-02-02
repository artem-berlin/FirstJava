package methode;

public class Summe {
    public static void main (String[]args)
    {
        int a = 5;
        int b = 7;
        int sum= summe(a, b);
        boolean c = check(sum) ;
        System.out.println("sum" +" "+ sum);
        System.out.println("check" +" "+ "is "+c);

    }
    public static int summe(int a, int b)
    {

        return  a + b;
    }
 public static boolean check( int sum)
 {
        return sum == 20;
 }

}



