public class Swap {
    public static void main(String[] args) {
        int a = 12, b = 2;
        System.out.println("Before swap");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
        int temp = a;
        a = b;
        b=temp;
        System.out.println("After swap");
        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }
}