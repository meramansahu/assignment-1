import java.util.Scanner;
public class circumfrence {
   public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the radius of the circle :");
      int radius = sc.nextInt();
      double circumference = 2*3.14*radius;
      System.out.println("Circumference of the circle is :"+circumference);
   }
}