package typen;

public class Variable2 {

 //   public void main(String[] args, int aa)
    //   {
 //       int a=5;
//        System.out.println(a);
//        }

    public static void main(String[] args) {
        byte a = 0;
        short b = 5;

        byte c = (byte) (a + b);
        short d = (short) (a + b);

        char aChar = 'a';
        char bChar = 'b';
        System.out.println(c);
        System.out.println(d);
        System.out.println("------------------------------------------");
        System.out.println(aChar + bChar);
        System.out.println("" + aChar + bChar);
        System.out.println(aChar);
        System.out.println(bChar);
        System.out.println("------------------------------------------");
        double double1 = 0.1;
        float float1 = 0.6f;
        float float2 = float1 + float1;
        float float3 = (float) double1 + float1;//down-casting
        System.out.println(float2);
        System.out.println(float3);
        System.out.println();

        int int1 = 1_000_000;//1000000
        System.out.println(int1);

    }
}