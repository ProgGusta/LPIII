public class Opternario
{
    public static void main(String[] args) {
        double x = 3.1;
        float y = 2.3f;
        int a = 3;
        short b = (short) 2;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("x == y = " + ((x == y) ? true : false));
        System.out.println("a != b = " + ((a != b) ? true : false));
        System.out.println("x > b = " + ((x > b) ? true : false));
        System.out.println("a < y = " + ((a < y) ? true : false));
        System.out.println("x >= y = " + ((x >= y) ? true : false));
        System.out.println("a <= b = " + ((a <= b) ? true : false));
    }
}